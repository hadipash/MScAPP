package hk.hku.cs.msccompsc_app.Adapter;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import org.json.JSONException;

import java.io.ByteArrayOutputStream;

import androidx.recyclerview.widget.RecyclerView;
import hk.hku.cs.msccompsc_app.R;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class AlumniAdapter extends RecyclerView.Adapter<AlumniAdapter.ViewHolder>{

    private static StreamObj[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView stream;
        public TextView streamDescription;
        public ImageView streamImg;


        public ViewHolder(View v) {
            super(v);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), AlumniNewsPage.class);

                    intent.putExtra("title", mDataset[getAdapterPosition()].stream);
                    intent.putExtra("content", mDataset[getAdapterPosition()].streamDescription);
                    intent.putExtra("img", mDataset[getAdapterPosition()].streamImg);

                    v.getContext().startActivity(intent);
                }
            });
            stream = (TextView) v.findViewById(R.id.alumni_act_title);
            streamDescription = (TextView) v.findViewById(R.id.alumni_act_time);
            streamImg = (ImageView) v.findViewById(R.id.alumni_act_img);

//            stream.measure(0,0);
//            int height = stream.getMeasuredHeight();
//            streamDescription.measure(0,0);
//            height += height;
//
//            System.out.println("\n\n\n\n\n\n\n\n\nTextView height: " + height + "\n\n\n\n\n\n\n\n\n\n");

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AlumniAdapter(StreamObj[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AlumniAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.alumni_activity_card, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.stream.setText(mDataset[position].getStream());
        holder.streamDescription.setText(mDataset[position].getStreamDescription());

//        int height;
//        holder.itemView.post(new Runnable()
//        {
//            @Override
//            public void run()
//            {
//
//                int cellWidth = holder.itemView.getWidth();// this will give you cell width dynamically
//                int cellHeight = holder.itemView.getHeight();// this will give you cell height dynamically
//                System.out.println("holder height: " + cellHeight);
//                System.out.println("holder width: " + cellWidth);
//            }
//        });

        holder.streamImg.setImageBitmap(        BitmapFactory.decodeByteArray(
                mDataset[position].getStreamImg(), 0, mDataset[position].getStreamImg().length));



    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    static public class StreamObj {
        public String stream;
        public String streamDescription;

        byte[] streamImg;

        public StreamObj(String _stream, String _streamDescription, Bitmap _streamImg) {
            stream = _stream;
            streamDescription = _streamDescription;


            ByteArrayOutputStream bs = new ByteArrayOutputStream();
            _streamImg.compress(Bitmap.CompressFormat.JPEG, 30, bs);
            streamImg = bs.toByteArray();
        }


        String getStream(){
            return stream;
        }

        String getStreamDescription() {
            return streamDescription;
        }

        byte[] getStreamImg() {
            return streamImg;
        }

    }

}