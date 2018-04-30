package com.example.awos.finalproject_jingyuepim;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth msAuth;
    private FirebaseAuth.AuthStateListener authListener;
    private DatabaseReference userRef;
    FirebaseDatabase database = FirebaseDatabase.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        msAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userRef = database.getReference("Hi");
        ;


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    protected void onStart() {
        super.onStart();
        msAuth.addAuthStateListener(authListener);
    }

    @Override

    public void onStop() {
        super.onStop();
        msAuth.removeAuthStateListener(authListener);
    }


    public void openKoreaActivity(View view) {
        Intent koreanIntent = new Intent(this, KoreaActivity.class);
        startActivity(koreanIntent);
    }

    public void openPRActivity(View view) {
        Intent prIntent = new Intent(this, PRActivity.class);
        startActivity(prIntent);
    }

    public void openLebanonActivity(View view) {
        Intent lebaIntent = new Intent(this, LebanonActivity.class);
        startActivity(lebaIntent);
    }

}



