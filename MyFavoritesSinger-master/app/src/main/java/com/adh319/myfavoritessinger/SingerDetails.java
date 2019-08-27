package com.adh319.myfavoritessinger;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SingerDetails extends AppCompatActivity {

    ImageView detailsImageView;
    TextView detailsTitleView, detailsDescView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_singer );
        //--
        ActionBar actionBar = getSupportActionBar();

        detailsTitleView = findViewById( R.id.singerTitle );
        detailsDescView = findViewById( R.id.singerDesc );
        detailsImageView = findViewById( R.id.singerImage );
        
        //--
        Intent intent = getIntent();

        String dTitle = intent.getStringExtra( "mTitle" );
        String dDesc = intent.getStringExtra( "mDesc" );

        byte[] dBytes = getIntent().getByteArrayExtra( "mImage" );
        //--
        Bitmap bitmap = BitmapFactory.decodeByteArray( dBytes, 0,dBytes.length );

        actionBar.setTitle( dTitle );

        detailsTitleView.setText( dTitle );
        detailsDescView.setText( dDesc );
        detailsImageView.setImageBitmap( bitmap );


    }
}
