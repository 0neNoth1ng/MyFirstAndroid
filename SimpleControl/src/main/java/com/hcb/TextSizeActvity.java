package com.hcb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TextSizeActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_size);
        TextView tv_hello = findViewById(R.id.tv_px);
        tv_hello.setTextSize(30);
    }
}