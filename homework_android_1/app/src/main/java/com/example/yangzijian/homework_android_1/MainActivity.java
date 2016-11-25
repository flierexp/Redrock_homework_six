package com.example.yangzijian.homework_android_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button toregistrbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        toregistrbtn = (Button)findViewById(R.id.toregister);
        toregistrbtn.setOnClickListener(this);
        toregistrbtn.getBackground().setAlpha(100);
        LinearLayout setalpha = (LinearLayout)findViewById(R.id.linerlayout);
        setalpha.getBackground().setAlpha(100);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toregister:
                startActivity(new Intent(MainActivity.this,Register.class));
                break;

            default:
                break;
        }
    }
}
