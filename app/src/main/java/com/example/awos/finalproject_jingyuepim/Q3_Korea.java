package com.example.awos.finalproject_jingyuepim;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Q3_Korea extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.q3_korea, container, false);
        Button button1 = rootView.findViewById(R.id.answer2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info=new Intent(getContext(),KoreanAnswer2Activity.class);
                startActivity(info);
            }
        });
        Button button2=rootView.findViewById(R.id.answer1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getContext(), "Try one more time!!!",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return rootView;
    }
}

