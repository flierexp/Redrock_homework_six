package com.example.yangzijian.homework_android_1;

import android.app.Activity;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Administrator on 2016/11/24.
 */
public class Register extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.register);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
    }
}
