package com.hfy.componentlearning;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 启动页
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //通过路由直接打开home组件的HomeActivity，
        ARouter.getInstance().build("/homepage/homeActivity").navigation();
        finish();
    }
}
