package com.adh319.myfavoritessinger;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class SingerAdapter extends RecyclerView.Adapter<SingerHolder> {

    Context c;
    ArrayList<SingerModel> singerModels;

    public SingerAdapter(Context c, ArrayList<SingerModel> singerModels) {

        this.c = c;
        this.singerModels = singerModels;

    }

    @NonNull
    @Override
    public SingerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.singer_list, null );

        return new SingerHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull final SingerHolder singerHolder, int i) {

        singerHolder.cardTitleView.setText( singerModels.get( i ).getCardtitle() );
        singerHolder.cardDescView.setText( singerModels.get( i ).getCarddesc() );
        singerHolder.cardImageView.setImageResource( singerModels.get( i ).getCardimage() );

        singerHolder.setSingerClickListener( new SingerClickListener() {
            @Override
            public void onSingerClickListener(View v, int position) {

                String iTitle = singerModels.get( position ).getCardtitle();
                String iDesc = singerModels.get( position ).getCarddesc();
                BitmapDrawable bitmapDrawable = (BitmapDrawable)singerHolder.cardImageView.getDrawable();

                Bitmap bitmap = bitmapDrawable.getBitmap();

                ByteArrayOutputStream stream = new ByteArrayOutputStream(  );

                bitmap.compress( Bitmap.CompressFormat.PNG, 100, stream );

                byte[] bytes = stream.toByteArray();

                Intent intent = new Intent( c, SingerDetails.class );
                intent.putExtra( "mTitle", iTitle );
                intent.putExtra( "mDesc", iDesc );
                intent.putExtra( "mImage", bytes );
                c.startActivity( intent );

            }
        } );
    }

    @Override
    public int getItemCount() {
        return singerModels.size();
    }
}
