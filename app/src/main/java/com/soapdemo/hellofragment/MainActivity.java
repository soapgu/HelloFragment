package com.soapdemo.hellofragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public MainActivity()
    {
        super(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.findViewById(R.id.button_navi_one).setOnClickListener( v-> {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragment_container, OneFragment.newInstance( "C","D" ), null)
                    .commit();
        });
        this.findViewById(R.id.button_navi_sec).setOnClickListener( v -> {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragment_container, TwoFragment.newInstance(), null)
                    .commit();
        });
    }
}