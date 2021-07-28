package com.mayank.gautam99.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mayank.gautam99.mytoasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this,"Mayank Message");
    }
}