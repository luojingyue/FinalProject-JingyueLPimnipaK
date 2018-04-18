package com.example.awos.finalproject_jingyuepim;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Q1_Korea extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.q1_korea, container, false);
        Button button = rootView.findViewById(R.id.answer1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info=new Intent(getContext(),KoreanAnswer1Activity.class);
                startActivity(info);
            }
        });
        return rootView;
    }



}

