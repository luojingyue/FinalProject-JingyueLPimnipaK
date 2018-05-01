package com.example.awos.finalproject_jingyuepim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HiActivity extends AppCompatActivity {
    private List<Person> persons;
    private PersonAdapter personAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hi);
        initialData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new PersonAdapter(persons,this));

    }

    private void initialData(){
        persons=new ArrayList<>();
        persons.add(new Person("J-Hope",R.drawable.korea_j_hope));
        persons.add(new Person("Jimin",R.drawable.korea_jimin));
        persons.add(new Person("Jin",R.drawable.korea_jin));
        persons.add(new Person("Jungkook",R.drawable.korea_jungkook));
        persons.add(new Person("Suga",R.drawable.korea_suga));
        persons.add(new Person("V",R.drawable.korea_v));

    }
}
