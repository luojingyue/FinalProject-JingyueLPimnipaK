package com.example.awos.finalproject_jingyuepim;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth msAuth;
    private FirebaseAuth.AuthStateListener authListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        msAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null){
                    startActivity(new Intent(MainActivity.this, AuthenticationActivity.class));
                }
            }
        };

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
