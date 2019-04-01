package com.app.namko;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.namkchat.NamkoFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager = getSupportFragmentManager();

        NamkoFragment fr = new NamkoFragment();
        fr.setBackgdrawable(R.drawable.splash);

        fr.setNameP("Diego Garcia");
        fr.setLang_chat("Latino");
        fr.setUrrPhoto("http://chittagongit.com//images/avatar-icon/avatar-icon-4.jpg");

        fragmentManager.beginTransaction().replace(R.id.frg, fr).commitAllowingStateLoss();

    }


}
