package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.am_button1);
        btn2 = findViewById(R.id.am_button2);
        btn3 = findViewById(R.id.am_button3);
        btn4 = findViewById(R.id.am_button4);
        btn5 = findViewById(R.id.am_button5);
        btn6 = findViewById(R.id.am_button6);
        imgView = findViewById(R.id.am_displayImage);
        imgView.setImageResource(R.drawable.img1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage2();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage3();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage4();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage5();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage6();
            }
        });
    }

    private void showImage1(){
        imgView.setImageResource(R.drawable.img1);
    }
    private void showImage2(){
        imgView.setImageResource(R.drawable.img2);
    }
    private void showImage3(){
        imgView.setImageResource(R.drawable.img3);
    }
    private void showImage4(){
        imgView.setImageResource(R.drawable.img4);
    }
    private void showImage5(){
        imgView.setImageResource(R.drawable.img5);
    }
    private void showImage6(){
        imgView.setImageResource(R.drawable.img6);
    }
}