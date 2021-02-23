package umn.ac.id.week04_27328;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TopFragment extends Fragment {

    TextView tvTextTopFragment;
    String textOnTop;
    public TopFragment() {
        // Required empty public constructor
        //this.textOnTop = text;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_top, container, false);
//        tvTextTopFragment = root.findViewById(R.id.tvTextTopFragment);
//        tvTextTopFragment.setText(textOnTop);
        return inflater.inflate(R.layout.fragment_top, container, false);
    }
}