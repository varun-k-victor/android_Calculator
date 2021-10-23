package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int opR=0;
    String num1="",num2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView screen2 = findViewById(R.id.textView2);
        TextView screen1 = findViewById(R.id.textView1);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn0 = findViewById(R.id.btn0);

        Button btnAdd = findViewById(R.id.btnADD);
        Button btnSUBTRACT = findViewById(R.id.btnSUBTRACT);
        Button btnMULTIPLY = findViewById(R.id.btnMULTIPLY);
        Button btnDIVIDE = findViewById(R.id.btnDIVIDE);
        Button btnPower = findViewById(R.id.btnPOWER);

        Button btnEQUAL = findViewById(R.id.btnEQUAL);

        Button btnCLEAR = findViewById(R.id.btnCLEAR);

        screen1.setText("Enter first number");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String intext=btn1.getText().toString();
                if(opR==0)
                {
                    num1=num1+intext;
                    screen1.setText("Enter any operator");
                    screen2.setText(num1);
                }
                else
                {
                    num2=num2+intext;
                    screen1.setText("click (=)");
                    screen2.setText(num2);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String intext=btn2.getText().toString();
                if(opR==0)
                {
                    num1=num1+intext;
                    screen1.setText("Enter any operator");
                    screen2.setText(num1);
                }
                else
                {
                    num2=num2+intext;
                    screen1.setText("click (=)");
                    screen2.setText(num2);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String intext=btn3.getText().toString();
                if(opR==0)
                {
                    num1=num1+intext;
                    screen1.setText("Enter any operator");
                    screen2.setText(num1);
                }
                else
                {
                    num2=num2+intext;
                    screen1.setText("click (=)");
                    screen2.setText(num2);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String intext=btn4.getText().toString();
                if(opR==0)
                {
                    num1=num1+intext;
                    screen1.setText("Enter any operator");
                    screen2.setText(num1);
                }
                else
                {
                    num2=num2+intext;
                    screen1.setText("click (=)");
                    screen2.setText(num2);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String intext=btn5.getText().toString();
                if(opR==0)
                {
                    num1=num1+intext;
                    screen1.setText("Enter any operator");
                    screen2.setText(num1);
                }
                else
                {
                    num2=num2+intext;
                    screen1.setText("click (=)");
                    screen2.setText(num2);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String intext=btn6.getText().toString();
                if(opR==0)
                {
                    num1=num1+intext;
                    screen1.setText("Enter any operator");
                    screen2.setText(num1);
                }
                else
                {
                    num2=num2+intext;
                    screen1.setText("click (=)");
                    screen2.setText(num2);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String intext=btn7.getText().toString();
                if(opR==0)
                {
                    num1=num1+intext;
                    screen1.setText("Enter any operator");
                    screen2.setText(num1);
                }
                else
                {
                    num2=num2+intext;
                    screen1.setText("click (=)");
                    screen2.setText(num2);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String intext=btn8.getText().toString();
                if(opR==0)
                {
                    num1=num1+intext;
                    screen1.setText("Enter any operator");
                    screen2.setText(num1);
                }
                else
                {
                    num2=num2+intext;
                    screen1.setText("click (=)");
                    screen2.setText(num2);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String intext=btn9.getText().toString();
                if(opR==0)
                {
                    num1=num1+intext;
                    screen1.setText("Enter any operator");
                    screen2.setText(num1);
                }
                else
                {
                    num2=num2+intext;
                    screen1.setText("click (=)");
                    screen2.setText(num2);
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String intext=btn0.getText().toString();
                if(opR==0)
                {
                    num1=num1+intext;
                    screen1.setText("Enter any operator");
                    screen2.setText(num1);
                }
                else
                {
                    num2=num2+intext;
                    screen1.setText("click (=)");
                    screen2.setText(num2);
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1=="" || num2!="")
                {
                    screen2.setText("INVALID INPUT");
                    screen1.setText("CLEAR SCREEN");
                    opR=0;
                }
                else
                {
                    opR=1;
                    screen2.setText("+");
                    screen1.setText("Enter second number");
                }
            }
        });

        btnSUBTRACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1=="" || num2!="")
                {
                    screen2.setText("INVALID INPUT");
                    screen1.setText("CLEAR SCREEN");
                    opR=0;
                }
                else
                {
                    opR=2;
                    screen2.setText("-");
                    screen1.setText("Enter second number");
                }
            }
        });

        btnMULTIPLY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1=="" || num2!="")
                {
                    screen2.setText("INVALID INPUT");
                    screen1.setText("CLEAR SCREEN");
                    opR=0;
                }
                else
                {
                    opR=3;
                    screen2.setText("*");
                    screen1.setText("Enter second number");
                }
            }
        });

        btnDIVIDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1=="" || num2!="")
                {
                    screen2.setText("INVALID INPUT");
                    screen1.setText("CLEAR SCREEN");
                    opR=0;
                }
                else
                {
                    opR=4;
                    screen2.setText("/");
                    screen1.setText("Enter second number");
                }
            }
        });

        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1=="" || num2!="")
                {
                    screen2.setText("INVALID INPUT");
                    screen1.setText("CLEAR SCREEN");
                    opR=0;
                }
                else
                {
                    opR=5;
                    screen2.setText("^");
                    screen1.setText("Enter second number");
                }
            }
        });

        btnEQUAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen1.setText("Result");
                if(opR==1)
                {
                    int result=Integer.parseInt(num1)+Integer.parseInt(num2);
                    screen2.setText(Integer.toString(result));
                }
                else if(opR==2)
                {
                    int result=Integer.parseInt(num1)-Integer.parseInt(num2);
                    screen2.setText(Integer.toString(result));
                }
                else if(opR==3)
                {
                    int result=Integer.parseInt(num1)*Integer.parseInt(num2);
                    screen2.setText(Integer.toString(result));
                }
                else if(opR==4)
                {
                    double result=Double.parseDouble(num1)/Double.parseDouble(num2);
                    screen2.setText(Double.toString(result));
                }
                else if(opR==5)
                {
                    double result=Math.pow(Integer.parseInt(num1),Integer.parseInt(num2));
                    screen2.setText(Double.toString(result));
                }
                else if(opR==0)
                {
                    screen2.setText("INVALID INPUT");
                    screen1.setText("CLEAR SCREEN");
                }
            }
        });

        btnCLEAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1="";
                num2="";
                opR=0;
                screen2.setText(null);
                screen1.setText("Enter first number");
            }
        });

    }
}