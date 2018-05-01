package com.example.awos.finalproject_jingyuepim;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Admin on 4/30/18.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private List<Person> persons;
    private Context context;

    public PersonAdapter(List<Person> persons, Context context) {
        this.persons = persons;
        this.context = context;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_person, parent, false);
        return new PersonViewHolder(view, context);
    }



    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person person = persons.get(position);
        holder.getPersonNameView().setText(person.getName());
        holder.getPersonPhotoView().setImageResource(person.getPhotoId());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

}
