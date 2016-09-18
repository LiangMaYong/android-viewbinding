package com.liangmayong.android_viewbinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.liangmayong.viewbinding.ViewBinding;
import com.liangmayong.viewbinding.annotations.BindLayout;

@BindLayout(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewBinding.parserActivity(this);
    }
}
