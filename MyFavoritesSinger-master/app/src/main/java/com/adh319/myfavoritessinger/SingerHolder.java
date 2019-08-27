package com.adh319.myfavoritessinger;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SingerHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView cardImageView;
    TextView cardTitleView, cardDescView;
    SingerClickListener singerClickListener;

    SingerHolder(@NonNull View itemView) {
        super( itemView );

        this.cardImageView = itemView.findViewById( R.id.cardImage );
        this.cardTitleView = itemView.findViewById( R.id.cardTitle );
        this.cardDescView = itemView.findViewById( R.id.cardDesc );

        itemView.setOnClickListener( this );

    }

    @Override
    public void onClick(View v) {

        this.singerClickListener.onSingerClickListener( v, getLayoutPosition() );

    }

    public void setSingerClickListener(SingerClickListener ic) {

        this.singerClickListener = ic;

    }

}
