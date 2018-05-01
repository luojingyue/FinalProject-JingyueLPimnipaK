package com.example.awos.finalproject_jingyuepim;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Admin on 4/30/18.
 */

public class PersonViewHolder extends RecyclerView.ViewHolder {
    //a)
    private CardView cardView;
    private TextView personNameView;
    private ImageView personPhotoView;
    private Context context;

    //b)
    public PersonViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        personNameView = (TextView) itemView.findViewById(R.id.person_name);
        personPhotoView = (ImageView) itemView.findViewById(R.id.person_photo);
        this.context = context;

//c)
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, personNameView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public CardView getCardView() {
        return cardView;
    }

    public Context getContext() {
        return context;
    }

    public ImageView getPersonPhotoView() {
        return personPhotoView;
    }

    public TextView getPersonNameView() {
        return personNameView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setPersonNameView(TextView personNameView) {
        this.personNameView = personNameView;
    }

    public void setPersonPhotoView(ImageView personPhotoView) {
        this.personPhotoView = personPhotoView;
    }
}

