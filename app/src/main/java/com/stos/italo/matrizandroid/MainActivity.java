package com.stos.italo.matrizandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText a11, a12, a13, a21, a22, a23, a31, a32, a33, multiplicarNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    public void initViews() {
        multiplicarNumero = findViewById(R.id.multiplicar_numero);

        a11 = findViewById(R.id.m1a11);
        a12 = findViewById(R.id.m1a12);
        a13 = findViewById(R.id.m1a13);
        a21 = findViewById(R.id.m1a21);
        a22 = findViewById(R.id.m1a22);
        a23 = findViewById(R.id.m1a23);
        a31 = findViewById(R.id.m1a31);
        a32 = findViewById(R.id.m1a32);
        a33 = findViewById(R.id.m1a33);
    }

    public void onMultiplicar(View v) {
        int multiplier;
        int iA11;
        int iA12;
        int iA13;
        int iA21;
        int iA22;
        int iA23;
        int iA31;
        int iA32;
        int iA33;

        if (multiplicarNumero.getText().length() == 0) {
            multiplier = 0;
        } else {
            multiplier = Integer.parseInt(multiplicarNumero.getText().toString());
        }


        if (a11.getText().length() == 0) {
            iA11 = 0;
        } else {
            iA11 = Integer.parseInt(a11.getText().toString()) * multiplier;
        }

        if (a12.getText().length() == 0) {
            iA12 = 0;
        } else {
            iA12 = Integer.parseInt(a12.getText().toString()) * multiplier;
        }

        if (a13.getText().length() == 0) {
            iA13 = 0;
        } else {
            iA13 = Integer.parseInt(a13.getText().toString()) * multiplier;
        }

        if (a21.getText().length() == 0) {
            iA21 = 0;
        } else {
            iA21 = Integer.parseInt(a21.getText().toString()) * multiplier;
        }

        if (a22.getText().length() == 0) {
            iA22 = 0;
        } else {
            iA22 = Integer.parseInt(a22.getText().toString()) * multiplier;
        }

        if (a23.getText().length() == 0) {
            iA23 = 0;
        } else {
            iA23 = Integer.parseInt(a23.getText().toString()) * multiplier;
        }

        if (a31.getText().length() == 0) {
            iA31 = 0;
        } else {
            iA31 = Integer.parseInt(a31.getText().toString()) * multiplier;
        }

        if (a32.getText().length() == 0) {
            iA32 = 0;
        } else {
            iA32 = Integer.parseInt(a32.getText().toString()) * multiplier;
        }

        if (a33.getText().length() == 0) {
            iA33 = 0;
        } else {
            iA33 = Integer.parseInt(a33.getText().toString()) * multiplier;
        }

        ResultFragment resultFragment = new ResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("a11", Integer.toString(iA11));
        bundle.putString("a12", Integer.toString(iA12));
        bundle.putString("a13", Integer.toString(iA13));
        bundle.putString("a21", Integer.toString(iA21));
        bundle.putString("a22", Integer.toString(iA22));
        bundle.putString("a23", Integer.toString(iA23));
        bundle.putString("a31", Integer.toString(iA31));
        bundle.putString("a32", Integer.toString(iA32));
        bundle.putString("a33", Integer.toString(iA33));
        resultFragment.setArguments(bundle);

        resultFragment.show((MainActivity.this).getSupportFragmentManager(), "Result Dialog");
    }
}
