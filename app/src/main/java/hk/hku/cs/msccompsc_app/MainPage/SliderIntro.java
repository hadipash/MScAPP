package hk.hku.cs.msccompsc_app.MainPage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import hk.hku.cs.msccompsc_app.R;

public class SliderIntro extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.slider_main, container, false);
        ImageView img = rootView.findViewById(R.id.slider_img);
        img.setImageResource(R.drawable.slider1);

        return rootView;
    }
}
