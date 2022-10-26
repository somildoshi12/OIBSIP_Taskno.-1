package com.somildoshi.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button mph_kmhr, kmhr_mph, k_m, m_k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mph_kmhr = findViewById(R.id.mph_kmhr);
        kmhr_mph = findViewById(R.id.kmhr_mph);
        k_m = findViewById(R.id.k_m);
        m_k = findViewById(R.id.m_k);

    }

    public void ctof2(View view) {
        loadFragment(new kmfrag2());
    }

    public void ctok2(View view) {
        loadFragment(new mkfrag2());
    }

    public void ftoc2(View view) {
        loadFragment(new cifrag2());
    }

    public void ftok2(View view) {
        loadFragment(new icfrag2());
    }

    private void loadFragment(Fragment fragment) {

        FragmentManager fm = getFragmentManager();

        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.lay2, fragment);
        fragmentTransaction.commit();
    }

}