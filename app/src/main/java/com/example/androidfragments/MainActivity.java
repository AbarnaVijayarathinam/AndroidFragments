package com.example.androidfragments;


import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeFragment(View view) {
        Fragment1 fragment;

        if (view == findViewById(R.id.button7)) {
            fragment = new Fragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frgmntDefalut, fragment);
            ft.commit();
        }

        if (view == findViewById(R.id.button8)) {
            fragment = new Fragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frgmntDefalut, fragment);
            ft.commit();
        }

    }

}
