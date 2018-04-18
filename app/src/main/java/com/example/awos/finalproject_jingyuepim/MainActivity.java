package com.example.awos.finalproject_jingyuepim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openKoreaActivity(View view) {
        Intent koreanIntent=new Intent(this,KoreaActivity.class);
        startActivity(koreanIntent);
    }

    public void openPRActivity(View view) {
        Intent prIntent=new Intent(this,PRActivity.class);
        startActivity(prIntent);
    }

    public void openLebanonActivity(View view) {
        Intent lebaIntent=new Intent(this,LebanonActivity.class);
        startActivity(lebaIntent);
    }
}
