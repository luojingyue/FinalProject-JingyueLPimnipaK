package com.example.awos.finalproject_jingyuepim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AuthenticationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
    }

    public void openMapActivity(View view) {
        Intent mapIntent = new Intent(this,MainActivity.class);
        startActivity(mapIntent);
    }
}
