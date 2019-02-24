package com.stos.italo.matrizandroid;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ResultFragment extends DialogFragment {

    private TextView a11, a12, a13, a21, a22, a23, a31, a32, a33;

    public ResultFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);

        Bundle bundle = getArguments();

        String rA11 = bundle.getString("a11", "0");
        String rA12 = bundle.getString("a12", "0");
        String rA13 = bundle.getString("a13", "0");
        String rA21 = bundle.getString("a21", "0");
        String rA22 = bundle.getString("a22", "0");
        String rA23 = bundle.getString("a23", "0");
        String rA31 = bundle.getString("a31", "0");
        String rA32 = bundle.getString("a32", "0");
        String rA33 = bundle.getString("a33", "0");

        a11 = view.findViewById(R.id.m1a11);
        a12 = view.findViewById(R.id.m1a12);
        a13 = view.findViewById(R.id.m1a13);
        a21 = view.findViewById(R.id.m1a21);
        a22 = view.findViewById(R.id.m1a22);
        a23 = view.findViewById(R.id.m1a23);
        a31 = view.findViewById(R.id.m1a31);
        a32 = view.findViewById(R.id.m1a32);
        a33 = view.findViewById(R.id.m1a33);

        a11.setText(rA11);
        a12.setText(rA12);
        a13.setText(rA13);
        a21.setText(rA21);
        a22.setText(rA22);
        a23.setText(rA23);
        a31.setText(rA31);
        a32.setText(rA32);
        a33.setText(rA33);

        return view;
    }

}
