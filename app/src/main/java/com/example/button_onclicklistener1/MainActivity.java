package com.example.button_onclicklistener1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn1,btn2,btn3,btn4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.TextView);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);

        View.OnClickListener OCL=new View.OnClickListener() {

            public void onClick(View v) {
                Button btn=(Button)v;
                int id=btn.getId();
                switch(id){

                    case R.id.button1:
                        tv.setBackgroundColor(Color.RED);
                        tv.setText(btn1.getText());
                        tv.setTextSize(40);
                        tv.setTextColor(Color.YELLOW);
                        break;
                    case R.id.button2:
                        tv.setBackgroundColor(Color.GREEN);
                        tv.setText(btn2.getText());
                        tv.setTextSize(50);
                        tv.setTextColor(Color.YELLOW);
                        break;
                    case R.id.button3:
                        tv.setBackgroundColor(Color.BLUE);
                        tv.setText(btn3.getText());
                        tv.setTextSize(20);
                        tv.setTextColor(Color.YELLOW);
                        break;
                    case R.id.button4:
                        tv.setText(btn4.getText());
                        finish();
                        break;
                }
            }
        };


        btn1.setOnClickListener(OCL);
        btn2.setOnClickListener(OCL);
        btn3.setOnClickListener(OCL);
        btn4.setOnClickListener(OCL);

//        fuction 2
//        btn1.setOnClickListener(new View.OnClickListener() { //事件監聽功能
//            @Override
//            public void onClick(View v) {
//                tv.setBackgroundColor(Color.RED);
//                tv.setText(btn1.getText());   // textview 抓取按鈕上的文字 btn1.getText
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tv.setBackgroundColor(Color.GREEN);
//                tv.setText(btn2.getText());
//            }
//        });
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tv.setBackgroundColor(Color.BLUE);
//                tv.setText(btn3.getText());
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });

    }
//    fuction 1
//    public void btn1(View v){
//        tv.setBackgroundColor(Color.RED);
//
//    }
//    public void btn2(View v){
//
//
//        tv.setBackgroundColor(Color.GREEN);
//    }
//    public void btn3(View v){
//        tv.setBackgroundColor(Color.BLUE);
//    }
//    public void btn4(View v){
//
//        finish();
//    }

}
