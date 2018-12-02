package hk.hku.cs.msccompsc_app.About;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import hk.hku.cs.msccompsc_app.R;


public class FacultyAdapter extends RecyclerView.Adapter<FacultyAdapter.ViewHolder> {

    private static final String TAG = "FacultyAdapter";
    private static Bitmap[] image;
    private static String[] names;
    private static String[] intro;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public final ImageView pic;
        public final TextView name;


        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText( view.getContext() , intro[getAdapterPosition()] , Toast.LENGTH_SHORT ).show();
                }
            });
            pic = v.findViewById(R.id.prof_img);
            name = v.findViewById(R.id.prof_name);
        }
    }

    public FacultyAdapter(Bitmap[] Images, String[] Names, String[] Intro){
        image = Images;
        names = Names;
        intro = Intro;

    }

    @NonNull
    @Override
    public FacultyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.faculty_card, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FacultyAdapter.ViewHolder holder, int position) {
        holder.pic.setImageBitmap(image[position]);
        holder.name.setText(names[position]);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }
}
