package com.coder.freedomland.livedatademo;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TimerViewModel mTimerViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTimerViewModel = ViewModelProviders.of(this).get(TimerViewModel.class);
        Observer<Long> observer = new Observer<Long>() {
            @Override
            public void onChanged(@Nullable Long aLong) {
                ((TextView) findViewById(R.id.hello_tv)).setText(aLong + "");
            }
        };

        mTimerViewModel.getElapseTime().observe(this, observer);
    }
}
