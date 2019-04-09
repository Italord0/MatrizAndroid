package com.stos.italo.matrizandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText a11, a12, a13, a21, a22, a23, a31, a32, a33, multiplicarNumero, elevadoNumero, b11, b12, b13, b21, b22, b23, b31, b32, b33,multiplicarNumeroB, elevadoNumeroB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    public void initViews() {
        multiplicarNumero = findViewById(R.id.multiplicar_numero);
        elevadoNumero = findViewById(R.id.elevar_numero);

        a11 = findViewById(R.id.m1a11);
        a12 = findViewById(R.id.m1a12);
        a13 = findViewById(R.id.m1a13);
        a21 = findViewById(R.id.m1a21);
        a22 = findViewById(R.id.m1a22);
        a23 = findViewById(R.id.m1a23);
        a31 = findViewById(R.id.m1a31);
        a32 = findViewById(R.id.m1a32);
        a33 = findViewById(R.id.m1a33);

        multiplicarNumeroB = findViewById(R.id.multiplicar_numero_b);
        elevadoNumeroB = findViewById(R.id.elevar_numero_b);

        b11 = findViewById(R.id.m1b11);
        b12 = findViewById(R.id.m1b12);
        b13 = findViewById(R.id.m1b13);
        b21 = findViewById(R.id.m1b21);
        b22 = findViewById(R.id.m1b22);
        b23 = findViewById(R.id.m1b23);
        b31 = findViewById(R.id.m1b31);
        b32 = findViewById(R.id.m1b32);
        b33 = findViewById(R.id.m1b33);
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

    public void onElevado(View v) {
        double power;
        int iA11;
        int iA12;
        int iA13;
        int iA21;
        int iA22;
        int iA23;
        int iA31;
        int iA32;
        int iA33;

        if (elevadoNumero.getText().length() == 0) {
            power = 0;
        } else {
            power = Integer.parseInt(elevadoNumero.getText().toString());
        }


        if (a11.getText().length() == 0) {
            iA11 = 0;
        } else {
            iA11 = (int) Math.pow(Double.parseDouble(a11.getText().toString()), power);
        }

        if (a12.getText().length() == 0) {
            iA12 = 0;
        } else {
            iA12 = (int) Math.pow(Double.parseDouble(a12.getText().toString()), power);
        }

        if (a13.getText().length() == 0) {
            iA13 = 0;
        } else {
            iA13 = (int) Math.pow(Double.parseDouble(a13.getText().toString()), power);
        }

        if (a21.getText().length() == 0) {
            iA21 = 0;
        } else {
            iA21 = (int) Math.pow(Double.parseDouble(a21.getText().toString()), power);
        }

        if (a22.getText().length() == 0) {
            iA22 = 0;
        } else {
            iA22 = (int) Math.pow(Double.parseDouble(a22.getText().toString()), power);
        }

        if (a23.getText().length() == 0) {
            iA23 = 0;
        } else {
            iA23 = (int) Math.pow(Double.parseDouble(a23.getText().toString()), power);
        }

        if (a31.getText().length() == 0) {
            iA31 = 0;
        } else {
            iA31 = (int) Math.pow(Double.parseDouble(a31.getText().toString()), power);
        }

        if (a32.getText().length() == 0) {
            iA32 = 0;
        } else {
            iA32 = (int) Math.pow(Double.parseDouble(a32.getText().toString()), power);
        }

        if (a33.getText().length() == 0) {
            iA33 = 0;
        } else {
            iA33 = (int) Math.pow(Double.parseDouble(a33.getText().toString()), power);
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

    public void onDeterminante(View v) {
        int iA11;
        int iA12;
        int iA13;
        int iA21;
        int iA22;
        int iA23;
        int iA31;
        int iA32;
        int iA33;

        if (a11.getText().length() == 0) {
            iA11 = 0;
        } else {
            iA11 = Integer.parseInt(a11.getText().toString());
        }

        if (a12.getText().length() == 0) {
            iA12 = 0;
        } else {
            iA12 = Integer.parseInt(a12.getText().toString());
        }

        if (a13.getText().length() == 0) {
            iA13 = 0;
        } else {
            iA13 = Integer.parseInt(a13.getText().toString());
        }

        if (a21.getText().length() == 0) {
            iA21 = 0;
        } else {
            iA21 = Integer.parseInt(a21.getText().toString());
        }

        if (a22.getText().length() == 0) {
            iA22 = 0;
        } else {
            iA22 = Integer.parseInt(a22.getText().toString());
        }

        if (a23.getText().length() == 0) {
            iA23 = 0;
        } else {
            iA23 = Integer.parseInt(a23.getText().toString());
        }

        if (a31.getText().length() == 0) {
            iA31 = 0;
        } else {
            iA31 = Integer.parseInt(a31.getText().toString());
        }

        if (a32.getText().length() == 0) {
            iA32 = 0;
        } else {
            iA32 = Integer.parseInt(a32.getText().toString());
        }

        if (a33.getText().length() == 0) {
            iA33 = 0;
        } else {
            iA33 = Integer.parseInt(a33.getText().toString());
        }


        int diagonalprincipal1 = iA11 * iA22 * iA33;
        int diagonalprincipal2 = iA12 * iA23 * iA31;
        int diagonalprincipal3 = iA13 * iA21 * iA32;

        int diagonalsecundaria1 = iA12 * iA21 * iA33;
        int diagonalsecundaria2 = iA11 * iA23 * iA32;
        int diagonalsecundaria3 = iA13 * iA22 * iA31;

        int determinante = diagonalprincipal1 + diagonalprincipal2 + diagonalprincipal3 - diagonalsecundaria1 - diagonalsecundaria2 - diagonalsecundaria3;

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
        bundle.putString("mode", "sarrus");
        bundle.putString("determinante", Integer.toString(determinante));
        resultFragment.setArguments(bundle);

        resultFragment.show((MainActivity.this).getSupportFragmentManager(), "Result Dialog");

    }

    public void onTransposta(View v) {
        int iA11;
        int iA12;
        int iA13;
        int iA21;
        int iA22;
        int iA23;
        int iA31;
        int iA32;
        int iA33;

        iA11 = Integer.parseInt(a11.getText().toString());
        iA12 = Integer.parseInt(a21.getText().toString());
        iA13 = Integer.parseInt(a31.getText().toString());

        iA21 = Integer.parseInt(a12.getText().toString());
        iA22 = Integer.parseInt(a22.getText().toString());
        iA23 = Integer.parseInt(a32.getText().toString());

        iA31 = Integer.parseInt(a13.getText().toString());
        iA32 = Integer.parseInt(a23.getText().toString());
        iA33 = Integer.parseInt(a33.getText().toString());

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

    public void onMultiplicarB(View v) {
        int multiplier;
        int iB11;
        int iB12;
        int iB13;
        int iB21;
        int iB22;
        int iB23;
        int iB31;
        int iB32;
        int iB33;

        if (multiplicarNumeroB.getText().length() == 0) {
            multiplier = 0;
        } else {
            multiplier = Integer.parseInt(multiplicarNumeroB.getText().toString());
        }


        if (b11.getText().length() == 0) {
            iB11 = 0;
        } else {
            iB11 = Integer.parseInt(b11.getText().toString()) * multiplier;
        }

        if (b12.getText().length() == 0) {
            iB12 = 0;
        } else {
            iB12 = Integer.parseInt(b12.getText().toString()) * multiplier;
        }

        if (b13.getText().length() == 0) {
            iB13 = 0;
        } else {
            iB13 = Integer.parseInt(b13.getText().toString()) * multiplier;
        }

        if (b21.getText().length() == 0) {
            iB21 = 0;
        } else {
            iB21 = Integer.parseInt(b21.getText().toString()) * multiplier;
        }

        if (b22.getText().length() == 0) {
            iB22 = 0;
        } else {
            iB22 = Integer.parseInt(b22.getText().toString()) * multiplier;
        }

        if (b23.getText().length() == 0) {
            iB23 = 0;
        } else {
            iB23 = Integer.parseInt(b23.getText().toString()) * multiplier;
        }

        if (b31.getText().length() == 0) {
            iB31 = 0;
        } else {
            iB31 = Integer.parseInt(b31.getText().toString()) * multiplier;
        }

        if (b32.getText().length() == 0) {
            iB32 = 0;
        } else {
            iB32 = Integer.parseInt(b32.getText().toString()) * multiplier;
        }

        if (b33.getText().length() == 0) {
            iB33 = 0;
        } else {
            iB33 = Integer.parseInt(b33.getText().toString()) * multiplier;
        }

        ResultFragment resultFragment = new ResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("a11", Integer.toString(iB11));
        bundle.putString("a12", Integer.toString(iB12));
        bundle.putString("a13", Integer.toString(iB13));
        bundle.putString("a21", Integer.toString(iB21));
        bundle.putString("a22", Integer.toString(iB22));
        bundle.putString("a23", Integer.toString(iB23));
        bundle.putString("a31", Integer.toString(iB31));
        bundle.putString("a32", Integer.toString(iB32));
        bundle.putString("a33", Integer.toString(iB33));
        resultFragment.setArguments(bundle);

        resultFragment.show((MainActivity.this).getSupportFragmentManager(), "Result Dialog");
    }

    public void onElevadoB(View v) {
        double power;
        int iB11;
        int iB12;
        int iB13;
        int iB21;
        int iB22;
        int iB23;
        int iB31;
        int iB32;
        int iB33;

        if (elevadoNumeroB.getText().length() == 0) {
            power = 0;
        } else {
            power = Integer.parseInt(elevadoNumeroB.getText().toString());
        }


        if (b11.getText().length() == 0) {
            iB11 = 0;
        } else {
            iB11 = (int) Math.pow(Double.parseDouble(b11.getText().toString()), power);
        }

        if (b12.getText().length() == 0) {
            iB12 = 0;
        } else {
            iB12 = (int) Math.pow(Double.parseDouble(b12.getText().toString()), power);
        }

        if (b13.getText().length() == 0) {
            iB13 = 0;
        } else {
            iB13 = (int) Math.pow(Double.parseDouble(b13.getText().toString()), power);
        }

        if (b21.getText().length() == 0) {
            iB21 = 0;
        } else {
            iB21 = (int) Math.pow(Double.parseDouble(b21.getText().toString()), power);
        }

        if (b22.getText().length() == 0) {
            iB22 = 0;
        } else {
            iB22 = (int) Math.pow(Double.parseDouble(b22.getText().toString()), power);
        }

        if (b23.getText().length() == 0) {
            iB23 = 0;
        } else {
            iB23 = (int) Math.pow(Double.parseDouble(b23.getText().toString()), power);
        }

        if (b31.getText().length() == 0) {
            iB31 = 0;
        } else {
            iB31 = (int) Math.pow(Double.parseDouble(b31.getText().toString()), power);
        }

        if (b32.getText().length() == 0) {
            iB32 = 0;
        } else {
            iB32 = (int) Math.pow(Double.parseDouble(b32.getText().toString()), power);
        }

        if (b33.getText().length() == 0) {
            iB33 = 0;
        } else {
            iB33 = (int) Math.pow(Double.parseDouble(b33.getText().toString()), power);
        }

        ResultFragment resultFragment = new ResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("a11", Integer.toString(iB11));
        bundle.putString("a12", Integer.toString(iB12));
        bundle.putString("a13", Integer.toString(iB13));
        bundle.putString("a21", Integer.toString(iB21));
        bundle.putString("a22", Integer.toString(iB22));
        bundle.putString("a23", Integer.toString(iB23));
        bundle.putString("a31", Integer.toString(iB31));
        bundle.putString("a32", Integer.toString(iB32));
        bundle.putString("a33", Integer.toString(iB33));
        resultFragment.setArguments(bundle);

        resultFragment.show((MainActivity.this).getSupportFragmentManager(), "Result Dialog");
    }

    public void onDeterminanteB(View v) {
        int iB11;
        int iB12;
        int iB13;
        int iB21;
        int iB22;
        int iB23;
        int iB31;
        int iB32;
        int iB33;

        if (b11.getText().length() == 0) {
            iB11 = 0;
        } else {
            iB11 = Integer.parseInt(b11.getText().toString());
        }

        if (b12.getText().length() == 0) {
            iB12 = 0;
        } else {
            iB12 = Integer.parseInt(b12.getText().toString());
        }

        if (b13.getText().length() == 0) {
            iB13 = 0;
        } else {
            iB13 = Integer.parseInt(b13.getText().toString());
        }

        if (b21.getText().length() == 0) {
            iB21 = 0;
        } else {
            iB21 = Integer.parseInt(b21.getText().toString());
        }

        if (b22.getText().length() == 0) {
            iB22 = 0;
        } else {
            iB22 = Integer.parseInt(b22.getText().toString());
        }

        if (b23.getText().length() == 0) {
            iB23 = 0;
        } else {
            iB23 = Integer.parseInt(b23.getText().toString());
        }

        if (b31.getText().length() == 0) {
            iB31 = 0;
        } else {
            iB31 = Integer.parseInt(b31.getText().toString());
        }

        if (b32.getText().length() == 0) {
            iB32 = 0;
        } else {
            iB32 = Integer.parseInt(b32.getText().toString());
        }

        if (b33.getText().length() == 0) {
            iB33 = 0;
        } else {
            iB33 = Integer.parseInt(b33.getText().toString());
        }


        int diagonalprincipal1 = iB11 * iB22 * iB33;
        int diagonalprincipal2 = iB12 * iB23 * iB31;
        int diagonalprincipal3 = iB13 * iB21 * iB32;

        int diagonalsecundaria1 = iB12 * iB21 * iB33;
        int diagonalsecundaria2 = iB11 * iB23 * iB32;
        int diagonalsecundaria3 = iB13 * iB22 * iB31;

        int determinante = diagonalprincipal1 + diagonalprincipal2 + diagonalprincipal3 - diagonalsecundaria1 - diagonalsecundaria2 - diagonalsecundaria3;

        ResultFragment resultFragment = new ResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("a11", Integer.toString(iB11));
        bundle.putString("a12", Integer.toString(iB12));
        bundle.putString("a13", Integer.toString(iB13));
        bundle.putString("a21", Integer.toString(iB21));
        bundle.putString("a22", Integer.toString(iB22));
        bundle.putString("a23", Integer.toString(iB23));
        bundle.putString("a31", Integer.toString(iB31));
        bundle.putString("a32", Integer.toString(iB32));
        bundle.putString("a33", Integer.toString(iB33));
        bundle.putString("mode", "sarrus");
        bundle.putString("determinante", Integer.toString(determinante));
        resultFragment.setArguments(bundle);

        resultFragment.show((MainActivity.this).getSupportFragmentManager(), "Result Dialog");

    }

    public void onTranspostaB(View v) {
        int iA11;
        int iA12;
        int iA13;
        int iA21;
        int iA22;
        int iA23;
        int iA31;
        int iA32;
        int iA33;

        iA11 = Integer.parseInt(b11.getText().toString());
        iA12 = Integer.parseInt(b21.getText().toString());
        iA13 = Integer.parseInt(b31.getText().toString());

        iA21 = Integer.parseInt(b12.getText().toString());
        iA22 = Integer.parseInt(b22.getText().toString());
        iA23 = Integer.parseInt(b32.getText().toString());

        iA31 = Integer.parseInt(b13.getText().toString());
        iA32 = Integer.parseInt(b23.getText().toString());
        iA33 = Integer.parseInt(b33.getText().toString());

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

    public void onSoma (View v){

        int iA11;
        int iA12;
        int iA13;
        int iA21;
        int iA22;
        int iA23;
        int iA31;
        int iA32;
        int iA33;

        int iB11;
        int iB12;
        int iB13;
        int iB21;
        int iB22;
        int iB23;
        int iB31;
        int iB32;
        int iB33;

        if (a11.getText().length() == 0) {
            iA11 = 0;
        } else {
            iA11 = Integer.parseInt(a11.getText().toString());
        }

        if (a12.getText().length() == 0) {
            iA12 = 0;
        } else {
            iA12 = Integer.parseInt(a12.getText().toString());
        }

        if (a13.getText().length() == 0) {
            iA13 = 0;
        } else {
            iA13 = Integer.parseInt(a13.getText().toString());
        }

        if (a21.getText().length() == 0) {
            iA21 = 0;
        } else {
            iA21 = Integer.parseInt(a21.getText().toString());
        }

        if (a22.getText().length() == 0) {
            iA22 = 0;
        } else {
            iA22 = Integer.parseInt(a22.getText().toString());
        }

        if (a23.getText().length() == 0) {
            iA23 = 0;
        } else {
            iA23 = Integer.parseInt(a23.getText().toString());
        }

        if (a31.getText().length() == 0) {
            iA31 = 0;
        } else {
            iA31 = Integer.parseInt(a31.getText().toString());
        }

        if (a32.getText().length() == 0) {
            iA32 = 0;
        } else {
            iA32 = Integer.parseInt(a32.getText().toString());
        }

        if (a33.getText().length() == 0) {
            iA33 = 0;
        } else {
            iA33 = Integer.parseInt(a33.getText().toString());
        }

        if (b11.getText().length() == 0) {
            iB11 = 0;
        } else {
            iB11 = Integer.parseInt(b11.getText().toString());
        }

        if (b12.getText().length() == 0) {
            iB12 = 0;
        } else {
            iB12 = Integer.parseInt(b12.getText().toString());
        }

        if (b13.getText().length() == 0) {
            iB13 = 0;
        } else {
            iB13 = Integer.parseInt(b13.getText().toString());
        }

        if (b21.getText().length() == 0) {
            iB21 = 0;
        } else {
            iB21 = Integer.parseInt(b21.getText().toString());
        }

        if (b22.getText().length() == 0) {
            iB22 = 0;
        } else {
            iB22 = Integer.parseInt(b22.getText().toString());
        }

        if (b23.getText().length() == 0) {
            iB23 = 0;
        } else {
            iB23 = Integer.parseInt(b23.getText().toString());
        }

        if (b31.getText().length() == 0) {
            iB31 = 0;
        } else {
            iB31 = Integer.parseInt(b31.getText().toString());
        }

        if (b32.getText().length() == 0) {
            iB32 = 0;
        } else {
            iB32 = Integer.parseInt(b32.getText().toString());
        }

        if (b33.getText().length() == 0) {
            iB33 = 0;
        } else {
            iB33 = Integer.parseInt(b33.getText().toString());
        }

        ResultFragment resultFragment = new ResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("a11", Integer.toString(iA11 + iB11));
        bundle.putString("a12", Integer.toString(iA12 + iB12));
        bundle.putString("a13", Integer.toString(iA13 + iB13));
        bundle.putString("a21", Integer.toString(iA21 + iB21));
        bundle.putString("a22", Integer.toString(iA22 + iB22));
        bundle.putString("a23", Integer.toString(iA23 + iB23));
        bundle.putString("a31", Integer.toString(iA31 + iB31));
        bundle.putString("a32", Integer.toString(iA32 + iB32));
        bundle.putString("a33", Integer.toString(iA33 + iB33));
        resultFragment.setArguments(bundle);

        resultFragment.show((MainActivity.this).getSupportFragmentManager(), "Result Dialog");

    }

    public void onSubtracao(View v){

        int iA11;
        int iA12;
        int iA13;
        int iA21;
        int iA22;
        int iA23;
        int iA31;
        int iA32;
        int iA33;

        int iB11;
        int iB12;
        int iB13;
        int iB21;
        int iB22;
        int iB23;
        int iB31;
        int iB32;
        int iB33;

        if (a11.getText().length() == 0) {
            iA11 = 0;
        } else {
            iA11 = Integer.parseInt(a11.getText().toString());
        }

        if (a12.getText().length() == 0) {
            iA12 = 0;
        } else {
            iA12 = Integer.parseInt(a12.getText().toString());
        }

        if (a13.getText().length() == 0) {
            iA13 = 0;
        } else {
            iA13 = Integer.parseInt(a13.getText().toString());
        }

        if (a21.getText().length() == 0) {
            iA21 = 0;
        } else {
            iA21 = Integer.parseInt(a21.getText().toString());
        }

        if (a22.getText().length() == 0) {
            iA22 = 0;
        } else {
            iA22 = Integer.parseInt(a22.getText().toString());
        }

        if (a23.getText().length() == 0) {
            iA23 = 0;
        } else {
            iA23 = Integer.parseInt(a23.getText().toString());
        }

        if (a31.getText().length() == 0) {
            iA31 = 0;
        } else {
            iA31 = Integer.parseInt(a31.getText().toString());
        }

        if (a32.getText().length() == 0) {
            iA32 = 0;
        } else {
            iA32 = Integer.parseInt(a32.getText().toString());
        }

        if (a33.getText().length() == 0) {
            iA33 = 0;
        } else {
            iA33 = Integer.parseInt(a33.getText().toString());
        }

        if (b11.getText().length() == 0) {
            iB11 = 0;
        } else {
            iB11 = Integer.parseInt(b11.getText().toString());
        }

        if (b12.getText().length() == 0) {
            iB12 = 0;
        } else {
            iB12 = Integer.parseInt(b12.getText().toString());
        }

        if (b13.getText().length() == 0) {
            iB13 = 0;
        } else {
            iB13 = Integer.parseInt(b13.getText().toString());
        }

        if (b21.getText().length() == 0) {
            iB21 = 0;
        } else {
            iB21 = Integer.parseInt(b21.getText().toString());
        }

        if (b22.getText().length() == 0) {
            iB22 = 0;
        } else {
            iB22 = Integer.parseInt(b22.getText().toString());
        }

        if (b23.getText().length() == 0) {
            iB23 = 0;
        } else {
            iB23 = Integer.parseInt(b23.getText().toString());
        }

        if (b31.getText().length() == 0) {
            iB31 = 0;
        } else {
            iB31 = Integer.parseInt(b31.getText().toString());
        }

        if (b32.getText().length() == 0) {
            iB32 = 0;
        } else {
            iB32 = Integer.parseInt(b32.getText().toString());
        }

        if (b33.getText().length() == 0) {
            iB33 = 0;
        } else {
            iB33 = Integer.parseInt(b33.getText().toString());
        }

        ResultFragment resultFragment = new ResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("a11", Integer.toString(iA11 - iB11));
        bundle.putString("a12", Integer.toString(iA12 - iB12));
        bundle.putString("a13", Integer.toString(iA13 - iB13));
        bundle.putString("a21", Integer.toString(iA21 - iB21));
        bundle.putString("a22", Integer.toString(iA22 - iB22));
        bundle.putString("a23", Integer.toString(iA23 - iB23));
        bundle.putString("a31", Integer.toString(iA31 - iB31));
        bundle.putString("a32", Integer.toString(iA32 - iB32));
        bundle.putString("a33", Integer.toString(iA33 - iB33));
        resultFragment.setArguments(bundle);

        resultFragment.show((MainActivity.this).getSupportFragmentManager(), "Result Dialog");

    }

    public void onSubtracaoInversa(View v){
        int iA11;
        int iA12;
        int iA13;
        int iA21;
        int iA22;
        int iA23;
        int iA31;
        int iA32;
        int iA33;

        int iB11;
        int iB12;
        int iB13;
        int iB21;
        int iB22;
        int iB23;
        int iB31;
        int iB32;
        int iB33;

        if (a11.getText().length() == 0) {
            iA11 = 0;
        } else {
            iA11 = Integer.parseInt(a11.getText().toString());
        }

        if (a12.getText().length() == 0) {
            iA12 = 0;
        } else {
            iA12 = Integer.parseInt(a12.getText().toString());
        }

        if (a13.getText().length() == 0) {
            iA13 = 0;
        } else {
            iA13 = Integer.parseInt(a13.getText().toString());
        }

        if (a21.getText().length() == 0) {
            iA21 = 0;
        } else {
            iA21 = Integer.parseInt(a21.getText().toString());
        }

        if (a22.getText().length() == 0) {
            iA22 = 0;
        } else {
            iA22 = Integer.parseInt(a22.getText().toString());
        }

        if (a23.getText().length() == 0) {
            iA23 = 0;
        } else {
            iA23 = Integer.parseInt(a23.getText().toString());
        }

        if (a31.getText().length() == 0) {
            iA31 = 0;
        } else {
            iA31 = Integer.parseInt(a31.getText().toString());
        }

        if (a32.getText().length() == 0) {
            iA32 = 0;
        } else {
            iA32 = Integer.parseInt(a32.getText().toString());
        }

        if (a33.getText().length() == 0) {
            iA33 = 0;
        } else {
            iA33 = Integer.parseInt(a33.getText().toString());
        }

        if (b11.getText().length() == 0) {
            iB11 = 0;
        } else {
            iB11 = Integer.parseInt(b11.getText().toString());
        }

        if (b12.getText().length() == 0) {
            iB12 = 0;
        } else {
            iB12 = Integer.parseInt(b12.getText().toString());
        }

        if (b13.getText().length() == 0) {
            iB13 = 0;
        } else {
            iB13 = Integer.parseInt(b13.getText().toString());
        }

        if (b21.getText().length() == 0) {
            iB21 = 0;
        } else {
            iB21 = Integer.parseInt(b21.getText().toString());
        }

        if (b22.getText().length() == 0) {
            iB22 = 0;
        } else {
            iB22 = Integer.parseInt(b22.getText().toString());
        }

        if (b23.getText().length() == 0) {
            iB23 = 0;
        } else {
            iB23 = Integer.parseInt(b23.getText().toString());
        }

        if (b31.getText().length() == 0) {
            iB31 = 0;
        } else {
            iB31 = Integer.parseInt(b31.getText().toString());
        }

        if (b32.getText().length() == 0) {
            iB32 = 0;
        } else {
            iB32 = Integer.parseInt(b32.getText().toString());
        }

        if (b33.getText().length() == 0) {
            iB33 = 0;
        } else {
            iB33 = Integer.parseInt(b33.getText().toString());
        }

        ResultFragment resultFragment = new ResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("a11", Integer.toString(iB11 - iA11));
        bundle.putString("a12", Integer.toString(iB12 - iA12));
        bundle.putString("a13", Integer.toString(iB13 - iA13));
        bundle.putString("a21", Integer.toString(iB21 - iA21));
        bundle.putString("a22", Integer.toString(iB22 - iA22));
        bundle.putString("a23", Integer.toString(iB23 - iA23));
        bundle.putString("a31", Integer.toString(iB31 - iA31));
        bundle.putString("a32", Integer.toString(iB32 - iA32));
        bundle.putString("a33", Integer.toString(iB33 - iA33));
        resultFragment.setArguments(bundle);

        resultFragment.show((MainActivity.this).getSupportFragmentManager(), "Result Dialog");
    }

    public void onMultiplicacao(View v){
        int iA11;
        int iA12;
        int iA13;
        int iA21;
        int iA22;
        int iA23;
        int iA31;
        int iA32;
        int iA33;

        int iB11;
        int iB12;
        int iB13;
        int iB21;
        int iB22;
        int iB23;
        int iB31;
        int iB32;
        int iB33;

        if (a11.getText().length() == 0) {
            iA11 = 0;
        } else {
            iA11 = Integer.parseInt(a11.getText().toString());
        }

        if (a12.getText().length() == 0) {
            iA12 = 0;
        } else {
            iA12 = Integer.parseInt(a12.getText().toString());
        }

        if (a13.getText().length() == 0) {
            iA13 = 0;
        } else {
            iA13 = Integer.parseInt(a13.getText().toString());
        }

        if (a21.getText().length() == 0) {
            iA21 = 0;
        } else {
            iA21 = Integer.parseInt(a21.getText().toString());
        }

        if (a22.getText().length() == 0) {
            iA22 = 0;
        } else {
            iA22 = Integer.parseInt(a22.getText().toString());
        }

        if (a23.getText().length() == 0) {
            iA23 = 0;
        } else {
            iA23 = Integer.parseInt(a23.getText().toString());
        }

        if (a31.getText().length() == 0) {
            iA31 = 0;
        } else {
            iA31 = Integer.parseInt(a31.getText().toString());
        }

        if (a32.getText().length() == 0) {
            iA32 = 0;
        } else {
            iA32 = Integer.parseInt(a32.getText().toString());
        }

        if (a33.getText().length() == 0) {
            iA33 = 0;
        } else {
            iA33 = Integer.parseInt(a33.getText().toString());
        }

        if (b11.getText().length() == 0) {
            iB11 = 0;
        } else {
            iB11 = Integer.parseInt(b11.getText().toString());
        }

        if (b12.getText().length() == 0) {
            iB12 = 0;
        } else {
            iB12 = Integer.parseInt(b12.getText().toString());
        }

        if (b13.getText().length() == 0) {
            iB13 = 0;
        } else {
            iB13 = Integer.parseInt(b13.getText().toString());
        }

        if (b21.getText().length() == 0) {
            iB21 = 0;
        } else {
            iB21 = Integer.parseInt(b21.getText().toString());
        }

        if (b22.getText().length() == 0) {
            iB22 = 0;
        } else {
            iB22 = Integer.parseInt(b22.getText().toString());
        }

        if (b23.getText().length() == 0) {
            iB23 = 0;
        } else {
            iB23 = Integer.parseInt(b23.getText().toString());
        }

        if (b31.getText().length() == 0) {
            iB31 = 0;
        } else {
            iB31 = Integer.parseInt(b31.getText().toString());
        }

        if (b32.getText().length() == 0) {
            iB32 = 0;
        } else {
            iB32 = Integer.parseInt(b32.getText().toString());
        }

        if (b33.getText().length() == 0) {
            iB33 = 0;
        } else {
            iB33 = Integer.parseInt(b33.getText().toString());
        }

        ResultFragment resultFragment = new ResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("a11", Integer.toString((iA11 * iB11) + (iA12 * iB21) + (iA13 * iB31)));
        bundle.putString("a12", Integer.toString((iA11 * iB12) + (iA12 * iB22) + (iA13 * iB32)));
        bundle.putString("a13", Integer.toString((iA11 * iB13) + (iA12 * iB23) + (iA13 * iB33)));
        bundle.putString("a21", Integer.toString((iA21 * iB11) + (iA22 * iB21) + (iA23 * iB31)));
        bundle.putString("a22", Integer.toString((iA21 * iB12) + (iA22 * iB22) + (iA23 * iB32)));
        bundle.putString("a23", Integer.toString((iA21 * iB13) + (iA22 * iB23) + (iA23 * iB33)));
        bundle.putString("a31", Integer.toString((iA31 * iB11) + (iA32 * iB21) + (iA33 * iB31)));
        bundle.putString("a32", Integer.toString((iA31 * iB12) + (iA32 * iB22) + (iA33 * iB32)));
        bundle.putString("a33", Integer.toString((iA31 * iB13) + (iA32 * iB23) + (iA33 * iB33)));
        resultFragment.setArguments(bundle);

        resultFragment.show((MainActivity.this).getSupportFragmentManager(), "Result Dialog");
    }
}
