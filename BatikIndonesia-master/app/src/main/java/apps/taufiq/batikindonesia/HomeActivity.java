package apps.taufiq.batikindonesia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView rvBatik;
    private List<pojo> list;
    private RecyclerView.ItemDecoration decoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Setup list
        rvBatik = findViewById(R.id.rv_list);
        list = new ArrayList<>();
        decoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);

        //setup adapter
        adapter anAdapter = new adapter(list);
        rvBatik.setLayoutManager(new LinearLayoutManager(this));
        rvBatik.addItemDecoration(decoration);
        rvBatik.setAdapter(anAdapter);

        //data list
        dataLoad();

    }

    private void dataLoad() {
        /**
         * params : pojo (Nama Batik, asal batik, foto batik, deskripsi batik, foto batik 2)
         * */
        list.add(new pojo("Batik Tujuh Rupa", "Pekalongan", R.drawable.tujuh_rupa,
                "Motif batik Sogan sudah ada sejak zaman nenek moyang orang Jawa beberapa abad lalu. Batik ini, didominasi oleh warna cokelat muda dan memiliko motif yang khas seperti, bunga dengan aksen titik-titk atau lengkungan garis. Dulunya, batik ini dipakai raja-raja di Jawa khususnya keraton kesultanan Solo.",
                "https://4.bp.blogspot.com/-oY7M9zo7930/WAudvhSAWDI/AAAAAAAABpY/QF514baWMokohMzKFl5PG3xgvvW9KQ9MQCLcB/s1600/2-motif-batik-tujuh-rupa.jpg"));

        list.add(new pojo("Batik Parang", "Jawa", R.drawable.parang,
                "Parang berasal dari kata pereng atau miring. Bentuk motifnya berbentuk seperti huruf “S” miring berombak memanjang.Motif Parang ini tersebar di seluruh Jawa, mulai dari Jawa Tegah, Jogjakarta dan Jawa Barat. Biasanya, perbedaannya hanya terletak pada aksen dari batik Motif parang tersebut.",
                "https://kesolo.com/wp-content/uploads/2016/04/motif-batik-parang-barong.jpg"));

        list.add(new pojo("Batik Priyangan", "Tasikmalaya", R.drawable.priyangan,
                "Motif batik Priyangan memiliki bentuk motif berupa tumbuhan. Bedanya dengan batik lain, tumbuhan yang digambar disusun rapi dan simetris. Sehingga, kesan elegan muncul dalam batik dari Tasik ini, baik dari segi kerapian maupun corak warnanya. Batik ini memunyai warna terang tetapi kalem dan tidak mencolok. ",
                "https://scontent-lax3-2.cdninstagram.com/vp/d610dac5a2252a2f8b00b04dfd7de86e/5BA58177/t51.2885-15/s480x480/e35/c224.0.576.576/28432583_2015479345366450_7521719961413222400_n.jpg"));

        list.add(new pojo("Batik Pring Sedapur", "Magetan", R.drawable.pringsedapur,
                "Motif batik Pring Sedapur memiliki ciri khas yang simpel namun elegan. Motif yang dipakai adalah motif bambu, sehingga sering juga disebut sebagai batik Pring. Batik ini tidak hanya indah dalam kesederhanaan motifnya, tetapi memiliki filosofi yang sederhana pula.",
                "http://www.gambarbagus.com/wp-content/uploads/2017/11/Motif-Batik-Pring-Sedapur-Magetan.png"));

        list.add(new pojo("Batik Sogan", "Solo", R.drawable.sogan,
                "Motif batik Sogan sudah ada sejak zaman nenek moyang orang Jawa beberapa abad lalu. Batik ini, didominasi oleh warna cokelat muda dan memiliko motif yang khas seperti, bunga dengan aksen titik-titk atau lengkungan garis. Dulunya, batik ini dipakai raja-raja di Jawa khususnya keraton kesultanan Solo.",
                "https://uzbatik.com/wp-content/uploads/2018/03/batik-motif-sogan.jpg"));

        list.add(new pojo("Batik Simbut", "Banten", R.drawable.simbut,
                "Motif batik Simbut berbentuk daun yang menyeruai daun talas. Motif tersebut merupakan motif yang paling sederhana, hanya menyusun dan merapikan satu jenis motif saja. Motif Simbut berasal dari suku  Badui pedalaman di Sunda yang kental dengan peradaban lama.",
                "https://cdn.shopify.com/s/files/1/0366/9825/files/29_-_banten.png?v=1499266790"));

        list.add(new pojo("Batik  Mega Mendung", "Cirebon", R.drawable.mega_mendung,
                "Motif batik Mega Mendung cukup sederhana namun memberi kesan mewah. Motif mendung di langit mega yang berwarna cerah inilah yang membuat batik Mega Mendung sangat cocok dipakai orang tua maupun anak muda, baik perempuan maupun laki-laki.",
                "https://batik-tulis.com/wp-content/uploads/2015/12/batik-mega-mendung.jpg"));

        list.add(new pojo("Batik Keraton", "Yogyakarta", R.drawable.keraton,
                "Batik Keraton adalah motif bunga yang simetris atau saya burung yang dikenal sebagai motif sawat lar. Motif ini bisa dibilang paling banyak dipakai baik oleh orang Indonesia maupun orang luar negeri.",
                "https://4.bp.blogspot.com/-I93HAg03bew/V_Cy-QZHj3I/AAAAAAAACzs/80xrNwIwHc0ZDrcGFMbponVBpxXj_axOACLcB/s1600/batik%2Bkeraton.jpg"));

        list.add(new pojo("Batik Gentongan", "Madura", R.drawable.gentongan,
                "Motif Gentongan berbeda dengan batik lainnya. Batik asal madura ini menggunakan motif abstrak sederhana, tanaman atau kombinasi keduanya. Warna batik Gentongan biasanya mengambil warna terang seperti merah, kuning, hijau, atau ungu. Batik Gentongan sendiri diambil dari gentong, yakni gerabah yang dipakai sebagai wadah untuk mencelup kain batik pada cairan warna.",
                "https://2.bp.blogspot.com/-z21VG3LRkSo/WAud8B_p6oI/AAAAAAAABpg/qK6UkDG705cY-JijScLknLJvzl4jgXV0gCLcB/s1600/4-motif-batik-gentongan.jpg"));


    }


}
