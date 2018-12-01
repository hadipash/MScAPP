package hk.hku.cs.msccompsc_app.About;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import hk.hku.cs.msccompsc_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 */
public class MessageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message, container, false);
    }


}
