package com.astonyang.retrofitdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.IOException;

/**
 * Created by yangxl on 2018/4/28.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSimpleService(View view) {
        try {
            SimpleService.main();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
