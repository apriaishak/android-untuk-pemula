package com.apriaishak.myrecyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.request.RequestOptions;

public class MoveWithDataActivity extends AppCompatActivity {
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_PHOTO = "extra_photo";
    private Context context = MoveWithDataActivity.this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TextView tvDataReceived = findViewById(R.id.tv_data_received);
        ImageView imgDataReceived = findViewById(R.id.img_photo_received);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String age = getIntent().getStringExtra(EXTRA_AGE);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);

        String text = "" + name + ",\n\n" + age +"\n";
        String img = "" + photo;
        tvDataReceived.setText(text);
        Glide.with(context).load(photo).into(imgDataReceived);


    }
}