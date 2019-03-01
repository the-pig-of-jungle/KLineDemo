package com.coder.zzq.mvvm;

import android.databinding.ObservableField;

public class ObUser {
    private ObservableField<String> mFirstName = new ObservableField<>();
    private ObservableField<String> mLastName = new ObservableField<>();

    public ObservableField<String> getFirstName() {
        return mFirstName;
    }

    public ObservableField<String> getLastName() {
        return mLastName;
    }
}
