package com.apriaishak.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();
    private String title = "VCT - Open Academy Class";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvHeroes = findViewById(R.id.rv_hero);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());
        showRecyclerList();
    }

    private void showSelectedHero(Hero hero) {
        Toast.makeText(this, "Kamu memilih " + hero.getName(), Toast.LENGTH_SHORT).show();
        Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, hero.getName());
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, hero.getFrom());
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_PHOTO, hero.getPhoto());
        startActivity(moveWithDataIntent);
    }

    private void showRecyclerList(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter;
        listHeroAdapter = new ListHeroAdapter(list);
        rvHeroes.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback(new ListHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hero data) {
                showSelectedHero(data);

            }
        });
    }
/*
    private void showRecyclerGrid(){
        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2));
        GridHeroAdapter gridHeroAdapter;
        gridHeroAdapter = new GridHeroAdapter(list);
        rvHeroes.setAdapter(gridHeroAdapter);

        gridHeroAdapter.setOnItemClickCallback(new GridHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hero data) {
                showSelectedHero(data);
            }
        });
    }

    private void showRecyclerCardView(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        CardViewHeroAdapter cardViewHeroAdapter = new CardViewHeroAdapter(list);
        rvHeroes.setAdapter(cardViewHeroAdapter);
    }
*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";

                String nama = "APRIA ISHAK";
                String email = "apriaishakpel@gmail.com";
                String foto = "https://1.bp.blogspot.com/-Kb6f_VfLTZo/XVVRJOXYQ7I/AAAAAAAABDk/X7JTxb8-aYMqPqWSee6BRpoQcCGlPqYIgCLcBGAs/s1600/Foto%2BPenulis.png";

                Intent moveWithDataIntent = new Intent(MainActivity.this, AboutActiviy.class);

                moveWithDataIntent.putExtra(AboutActiviy.EXTRA_NAME, nama);
                moveWithDataIntent.putExtra(AboutActiviy.EXTRA_AGE, email);
                moveWithDataIntent.putExtra(AboutActiviy.EXTRA_PHOTO, foto);

                startActivity(moveWithDataIntent);
                break;
/*
            case R.id.action_grid:
                title = "Mode List";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode List";
                showRecyclerCardView();
                break;
  */
        }
    }
}

