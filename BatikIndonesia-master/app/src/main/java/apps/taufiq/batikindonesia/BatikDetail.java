package apps.taufiq.batikindonesia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BatikDetail extends AppCompatActivity {

    public static String IMAGE = "image";
    public static String DESCRIPTIONS = "deskripsi";
    public static String NAMA_BATIK = "nama batik";
    public static String ASAL_BATIK = "asal_batik";

    TextView namaBatik, deskripsiBatik, asalBatik;
    ImageView fotoBatik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batik_detail);

        //take a data from HomeActivity

        String pict = getIntent().getStringExtra(IMAGE);
        String name = getIntent().getStringExtra(NAMA_BATIK);
        String asal = getIntent().getStringExtra(ASAL_BATIK);
        String desc = getIntent().getStringExtra(DESCRIPTIONS);

        fotoBatik = findViewById(R.id.civ_batik);
        namaBatik = findViewById(R.id.tv_nama_batik);
        asalBatik = findViewById(R.id.tv_asal_batik);
        deskripsiBatik = findViewById(R.id.tv_deskripsi_batik);


        //foto batik
        Glide.with(this).load(pict).into(fotoBatik);

        //nama batik
        namaBatik.setText(name);

        //asal batik
        asalBatik.setText(asal);

        //deskripsi batik
        deskripsiBatik.setText(desc);


    }


}
