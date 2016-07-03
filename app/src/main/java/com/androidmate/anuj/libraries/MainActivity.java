package com.androidmate.anuj.libraries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidmate.anuj.firstlibrary.FirstLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstLibrary.getInstance().makeMeAwesome(this,"Anuj");
    }
}
