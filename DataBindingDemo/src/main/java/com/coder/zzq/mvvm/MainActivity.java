package com.coder.zzq.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.coder.zzq.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);;
        final ObUser obUser = new ObUser();
        binding.setUser(obUser);
        getWindow().getDecorView().postDelayed(new Runnable() {
            @Override
            public void run() {
                obUser.getLastName().set("zhu");
                obUser.getFirstName().set("zhiqiang");
            }
        }, 5000);
        ImageView imageView;
    }
}
