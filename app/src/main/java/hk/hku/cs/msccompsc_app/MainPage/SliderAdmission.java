package hk.hku.cs.msccompsc_app.MainPage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import hk.hku.cs.msccompsc_app.Admission.MainAdmission;
import hk.hku.cs.msccompsc_app.R;

public class SliderAdmission extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.slider_main, container, false);

        ImageView img = rootView.findViewById(R.id.slider_img);
        img.setImageResource(R.drawable.slider2);

        Button btn = rootView.findViewById(R.id.adm_button);
        btn.setVisibility(View.VISIBLE);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rootView.getContext(), MainAdmission.class));
            }
        });

        return rootView;
    }
}
