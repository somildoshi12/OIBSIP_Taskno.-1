package com.somildoshi.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button cf,ck,fc,fk,kc,kf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        cf=findViewById(R.id.km);
        ck=findViewById(R.id.mk);
        fc=findViewById(R.id.ci);
        fk=findViewById(R.id.ic);
        kc=findViewById(R.id.my);
        kf=findViewById(R.id.ym);

    }

    public void ctof(View view) {
        loadFragment(new kmfrag());
    }

    public void ctok(View view) {
        loadFragment(new mkfrag());
    }

    public void ftoc(View view) {
        loadFragment(new cifrag());
    }

    public void ftok(View view) {
        loadFragment(new icfrag());
    }

    public void ktoc(View view) {
        loadFragment(new myfrag());
    }

    public void ktof(View view) {
        loadFragment(new ymfrag());
    }

    private void loadFragment(Fragment fragment) {

        FragmentManager fm = getFragmentManager();

        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.lay, fragment);
        fragmentTransaction.commit();
    }

}