package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bang, cong, tru, nhan, chia, phay, doidau, ce, c, bs;
    TextView txt1, txt2;
    Double var1;
    Double var2;
    Double ans;
    Boolean addition = false, subtract = false, multiply = false, divide = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);
        b1 = findViewById(R.id.mot);
        b2 = findViewById(R.id.hai);
        b3 = findViewById(R.id.ba);
        b4 = findViewById(R.id.bon);
        b5 = findViewById(R.id.nam);
        b6 = findViewById(R.id.sau);
        b7 = findViewById(R.id.bay);
        b8 = findViewById(R.id.tam);
        b9 = findViewById(R.id.chin);
        b0 = findViewById(R.id.ko);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        chia = findViewById(R.id.chia);
        phay = findViewById(R.id.cham);
        nhan = findViewById(R.id.nhan);
        doidau = findViewById(R.id.doidau);
        ce = findViewById(R.id.ce);
        c= findViewById(R.id.c);
        bs = findViewById(R.id.bs);
        bang = findViewById(R.id.bang);

        txt1 = findViewById(R.id.text1);
        txt2 = findViewById(R.id.text2);
        //to show value of this button in textView1
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"1");
            }
        });
        //to show value of this button in textView1
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"2");
            }
        });
        //to show value of this button in textView1
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"3");
            }
        });
        //to show value of this button in textView1
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"4");
            }
        });
        //to show value of this button in textView1
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"5");
            }
        });
        //to show value of this button in textView1
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"6");
            }
        });
        //to show value of this button in textView1
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"7");
            }
        });
        //to show value of this button in textView1
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"8");
            }
        });
        //to show value of this button in textView1
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"9");
            }
        });
        //to show value of this button in textView1
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"0");
            }
        });
        //to show value of this button in textView1
        phay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+".");
            }
        });


        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                addition = true;
            }
        });
        //To subtract
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                subtract = true;
            }
        });
        //To multiply
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                multiply = true;
            }
        });
        //To divide
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                divide = true;
            }
        });



        //To clear and refresh everything!
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allReset();
            }
        });
        //To calculate answer
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2 = Double.parseDouble(txt1.getText().toString());
                if(addition){
                    ans = var1 + var2;
                } else if (subtract){
                    ans = var1 - var2;
                } else if (multiply){
                    ans = var1 * var2;
                } else if (divide){
                    ans = var1 / var2;
                } else {
                    ans = ans + 0;
                }
                txt2.setText(ans.toString());
                bang.setEnabled(false);
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText().subSequence(0,txt1.length()-1));
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cong.setEnabled(true);
                tru.setEnabled(true);
                nhan.setEnabled(true);
                chia.setEnabled(true);
                bang.setEnabled(true);

                txt1.setText("");
            }
        });


    }
    //To disable buttons
    public void buttonFalse(){
        cong.setEnabled(false);
        tru.setEnabled(false);
        nhan.setEnabled(false);
        chia.setEnabled(false);
        txt1.setText("");
    }
    //To set val1 value
    public void setVar1(){
        var1 = Double.parseDouble(txt1.getText().toString());
    }
    //to reset all buttons and textview
    public void allReset(){


        bang.setEnabled(true);
        cong.setEnabled(true);
        tru.setEnabled(true);
        nhan.setEnabled(true);
        chia.setEnabled(true);
        txt1.setText("");
        txt2.setText("");
    }



}
