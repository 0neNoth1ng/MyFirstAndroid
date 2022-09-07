package com.hcb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hcb.utils.Utils;

public class ViewBorderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_border);
        TextView tv_code_border = findViewById(R.id.tv_code_border);
        //获取tv_code_border的布局参数
        ViewGroup.LayoutParams params = tv_code_border.getLayoutParams();
        //修改宽度
        params.width = Utils.dip2px(this,300);
        //设置参数
        tv_code_border.setLayoutParams(params);
        
    }
}