package com.apriaishak.katalogfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] dataName = {"Film 1","Film 2","Film 3","Film 4","Film 5","Film 6","Film 7","Film 8","Film 9","Film 10"};
    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private FilmAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new FilmAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, film.get(i).getJudul(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}

    private void prepare() {
        dataJudul = getResources().getStringArray(R.array.data_judul);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
    }

    private void addItem() {
        film = new ArrayList<>();

        for (int i = 0; i < dataName.length; i++) {
            Film film = new Film();
            film.setPhoto(dataPhoto.getResourceId(i, -1));
            film.setJudul(dataName[i]);
            film.setDescription(dataDescription[i]);
            film.add(film);
        }
        adapter.setFilm(film);
    }


}
