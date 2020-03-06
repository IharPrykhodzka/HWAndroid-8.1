package com.example.hwandroid81;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnPoint;
    private TextView total;
    private String totalShow = " ";
    private Button btnClean;
    private Button btnPlusOrMinus;
    private Button btnDivision;
    private Button btnPercent;
    private Button btnMultiplication;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnEqually;
    private Button btnEngOrNrm;
    private Button btnEngOrNrm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUse();
    }

    private void btnUse() {
        btn0 = findViewById(R.id.zero);
        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btnPoint = findViewById(R.id.point);
        total = findViewById(R.id.total);
        btnPlusOrMinus = findViewById(R.id.plusOrMinus);
        btnDivision = findViewById(R.id.division);
        btnPercent = findViewById(R.id.percent);
        btnMultiplication = findViewById(R.id.multiplication);
        btnMinus = findViewById(R.id.minus);
        btnPlus = findViewById(R.id.plus);
        btnEqually = findViewById(R.id.equally);
        btnClean = findViewById(R.id.clean);
        btnEngOrNrm = findViewById(R.id.btnEnginOrNorm1);
        btnEngOrNrm2 = findViewById(R.id.btnEnginOrNorm2);

        btnEngOrNrm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout relativeLayoutRoot = findViewById(R.id.root);
                RelativeLayout relativeLayoutRoot2 = findViewById(R.id.root2);
                if (relativeLayoutRoot.getVisibility() == View.GONE) {
                    relativeLayoutRoot.setVisibility(View.VISIBLE);
                    relativeLayoutRoot2.setVisibility(View.GONE);
                } else if (relativeLayoutRoot2.getVisibility() == View.GONE) {
                    relativeLayoutRoot.setVisibility(View.GONE);
                    relativeLayoutRoot2.setVisibility(View.VISIBLE);
                }
            }
        });

        btnEngOrNrm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout relativeLayoutRoot = findViewById(R.id.root);
                RelativeLayout relativeLayoutRoot2 = findViewById(R.id.root2);
                if (relativeLayoutRoot.getVisibility() == View.GONE) {
                    relativeLayoutRoot.setVisibility(View.VISIBLE);
                    relativeLayoutRoot2.setVisibility(View.GONE);
                } else if (relativeLayoutRoot2.getVisibility() == View.GONE) {
                    relativeLayoutRoot.setVisibility(View.GONE);
                    relativeLayoutRoot2.setVisibility(View.VISIBLE);
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "9");
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + ".");
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = "0");
            }
        });

        btnPlusOrMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "+/-");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "-");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "+");
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "÷");
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "×");
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "%");
            }
        });

        btnEqually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(totalShow = totalShow + "=");
            }
        });
    }

}
