package id.sch.smktelkom_mlg.www.fragment2.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.sch.smktelkom_mlg.www.fragment2.R;

/**
 * Created by Arum dong on 3/18/2019
 */

public class PenguinFragment extends Fragment{

    public PenguinFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.penguin_multiple_fragment, container, false);
        return rootView;
    }
}