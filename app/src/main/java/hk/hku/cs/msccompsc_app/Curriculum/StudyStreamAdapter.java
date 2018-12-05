package hk.hku.cs.msccompsc_app.Curriculum;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;
import hk.hku.cs.msccompsc_app.R;

public class StudyStreamAdapter extends RecyclerView.Adapter<StudyStreamAdapter.ViewHolder>{

    private  StreamObj[] mDataset;

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
            stream = (TextView) v.findViewById(R.id.stream);
            streamDescription = (TextView) v.findViewById(R.id.stream_description);
            streamImg = (ImageView) v.findViewById(R.id.stream_img);

//            stream.measure(0,0);
//            int height = stream.getMeasuredHeight();
//            streamDescription.measure(0,0);
//            height += height;
//
//            System.out.println("\n\n\n\n\n\n\n\n\nTextView height: " + height + "\n\n\n\n\n\n\n\n\n\n");

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public StudyStreamAdapter(StreamObj[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public StudyStreamAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_stream, parent, false);

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

        holder.streamImg.setImageBitmap(mDataset[position].getStreamImg());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    static public class StreamObj {
        public String stream;
        public String streamDescription;
        public Bitmap streamImg;

        public StreamObj(String _stream, String _streamDescription, Bitmap _streamImg) {
            stream = _stream;
            streamDescription = _streamDescription;
            streamImg = _streamImg;
        }


        String getStream(){
            return stream;
        }

        String getStreamDescription() {
            return streamDescription;
        }

        Bitmap getStreamImg() {
            return streamImg;
        }

    }

}