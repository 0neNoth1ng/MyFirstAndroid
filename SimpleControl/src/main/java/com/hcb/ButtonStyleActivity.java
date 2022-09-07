package com.hcb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hcb.utils.DateUtil;

public class ButtonStyleActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_button_result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_style);
        tv_button_result = findViewById(R.id.tv_button_result);

        Button button_listen = findViewById(R.id.button_listen);
        button_listen.setOnClickListener(new MyOnClickListener(tv_button_result));

        Button button_click_public = findViewById(R.id.button_click_public);
        button_click_public.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        /*根据id设置每个按钮的作用*/
        if(view.getId() == R.id.button_click_public){
            String desc = String.format("%s 您点击了按钮：%s", DateUtil.GetNowTime(), ((Button) view).getText());
            tv_button_result.setText(desc);
        }
    }

    /*采用监听的方法*/
    static class MyOnClickListener implements View.OnClickListener {

        private TextView tv_button_result;

        public MyOnClickListener(TextView tv_button_result) {
            this.tv_button_result = tv_button_result;
        }

        @Override
        public void onClick(View view) {
            String desc = String.format("%s 您点击了按钮：%s", DateUtil.GetNowTime(), ((Button) view).getText());
            tv_button_result.setText(desc);
        }
    }


    /*不推荐的方式*/
    public void doClick(View view) {
        System.out.println("OK!");
        String desc = String.format("%s 您点击了按钮：%s", DateUtil.GetNowTime(), ((Button) view).getText());
        tv_button_result.setText(desc);
    }
}