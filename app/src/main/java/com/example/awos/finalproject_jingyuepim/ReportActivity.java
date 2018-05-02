package com.example.awos.finalproject_jingyuepim;

import android.media.tv.TvContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ReportActivity extends AppCompatActivity {
    private EditText nameArea;
    private EditText commentArea;
    private String name;
    private String comment;
    private FirebaseDatabase database;
    private DatabaseReference myRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        nameArea=(EditText)findViewById(R.id.report_name);
        commentArea=(EditText)findViewById(R.id.report_here);
        database = FirebaseDatabase.getInstance();




    }

    public void uploadComment(View view) {

        name=nameArea.getText().toString();
        comment=commentArea.getText().toString();
        myRef = database.getReference(name);

        myRef.setValue(comment);
    }

    public void readComment(View view) {
        // Read from the database
        myRef=database.getReference(nameArea.getText().toString());
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    String loadedData=dataSnapshot.getValue(String.class);
                    commentArea.setText(loadedData);
                }else{
                    commentArea.setText(null);
                    Toast.makeText(ReportActivity.this,"Cannot find your name",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(ReportActivity.this,"Error loading",Toast.LENGTH_SHORT).show();

            }
        });


    }
}
