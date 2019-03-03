package com.coder.freedomland.livedatademo;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.SystemClock;

import java.util.Timer;
import java.util.TimerTask;

public class TimerViewModel extends ViewModel {
    public static final int ONE_SECONDS = 1000;
    private MutableLiveData<Long> mElapseTime = new MutableLiveData<>();
    private long mInitialTime;

    public TimerViewModel() {
        mInitialTime = SystemClock.elapsedRealtime();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                long newValue = (SystemClock.elapsedRealtime() - mInitialTime) / 100;
                mElapseTime.postValue(newValue);
            }
        },0,ONE_SECONDS);
    }

    public MutableLiveData<Long> getElapseTime() {
        return mElapseTime;
    }
}
