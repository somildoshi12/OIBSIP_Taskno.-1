package com.somildoshi.unitconverter;

import android.os.Bundle;

import android.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class cifrag2 extends Fragment {

    View view;
    EditText etf;
    String setf;
    TextView tvc;
    Button submit;
    float f=0,c=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_cifrag2, container, false);

        etf=view.findViewById(R.id.etf);
        submit=view.findViewById(R.id.submit);
        tvc=view.findViewById(R.id.tvc);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setf=etf.getText().toString();
                if (TextUtils.isEmpty(setf)) {
                    etf.setError("Enter value in numbers");
                    return;
                }
                else {
                    f = Float.parseFloat(etf.getText().toString());
                    c = (float) (f * 1.60934);
                    tvc.setText("Speed in km/hr: " + c);
                    tvc.setVisibility(view.VISIBLE);
                }
            }
        });
        return view;
    }
}