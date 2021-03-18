package com.soapdemo.hellofragment;

import androidx.lifecycle.ViewModel;

import com.orhanobut.logger.Logger;

public class TwoViewModel extends ViewModel {
    public TwoViewModel()
    {
        Logger.i( "-------TwoViewModel Create----" );
    }

    public String getMessage()
    {
        return "Hello-Fragment-Binding";
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Logger.i("------TwoViewModel Cleared------");
    }
}