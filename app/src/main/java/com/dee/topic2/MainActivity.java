package com.dee.topic2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
RadioButton btn1, btn2, btn3;
ImageView theimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

        theimage= findViewById(R.id.theimage);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                theimage.setImageResource(R.drawable.dd);
                break;
            case R.id.btn2:
                theimage.setImageResource(R.drawable.dd);
                break;
            case R.id.btn3:
                theimage.setImageResource(R.drawable.dd);
                break;
        }
    }
    }
