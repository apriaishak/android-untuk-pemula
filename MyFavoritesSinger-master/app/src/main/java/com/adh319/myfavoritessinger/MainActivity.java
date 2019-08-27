package com.adh319.myfavoritessinger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView cardReyclerView;
    SingerAdapter singerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        cardReyclerView = findViewById( R.id.recyclerView );
        cardReyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        singerAdapter = new SingerAdapter( this, getSingerList() );
        cardReyclerView.setAdapter( singerAdapter );

    }

    private ArrayList<SingerModel> getSingerList() {

        ArrayList<SingerModel> singerModels = new ArrayList<>(  );

        // List array
        SingerModel card = new SingerModel();
        card.setCardtitle( "Ariana Grande" );
        card.setCarddesc( "Ariana Grande, lahir 26 Juni 1993 adalah seorang penyanyi, aktris, dan penulis lagu berkebangsaan Amerika Serikat. Dia memulai kariernya pada tahun 2008 di drama musikal Broadway berjudul 13, sebelum memerankan Cat Valentine di serial televisi Nickelodeon Victorious (2010–2013) dan di spinoff Sam & Cat (2013–2014). Dia juga pernah tampil di berbagai teater dan peran televisi dan telah mengisi suara dibeberapa serial televisi dan film." );
        card.setCardimage( R.drawable.ariana_grande );
        singerModels.add( card );

        card = new SingerModel();
        card.setCardtitle( "Charlie Puth" );
        card.setCarddesc( "Charles Otto Puth Jr, lahir 2 Desember 1991 adalah seorang penyanyi, penulis lagu dan produser rekaman berkebangsaan Amerika Serikat. Lagu debutnya \"See You Again\", yang dia tulis, ikut produseri, dan nyanyikan bersama Wiz Khalifa untuk lagu latar Furious 7 sebagai penghormatan terhadap Paul Walker, berada di nomor satu selama 12 minggu tidak berurutan di Amerika Serikat." );
        card.setCardimage( R.drawable.charlie_puth );
        singerModels.add( card );

        card = new SingerModel();
        card.setCardtitle( "Selena Gomez" );
        card.setCarddesc( "Selena Marie Gomez, lahir 22 Juli 1992 adalah seorang penyanyi, aktris, dan produser berkebangsaan Amerika Serikat. Setelah tampil di serial televisi anak-anak Barney & Friends, dia semakin dikenal atas perannya sebagai Alex Russo di serial televisi Disney Channel Wizards of Waverly Place, yang tayang sampai empat musim dari tahun 2007 sampai 2012." );
        card.setCardimage( R.drawable.selena_gomez );
        singerModels.add( card );

        card = new SingerModel();
        card.setCardtitle( "Ed Sheeran" );
        card.setCarddesc( "Edward Christopher Sheeran, lahir 17 Februari 1991 adalah seorang penyanyi, penulis lagu, gitaris, produser rekaman, dan aktor berkebangsaan Inggris. Sheeran lahir di Halifax, West Yorkshire, dan dibesarkan di Framlingham, Suffolk. Dia memasuki Academy of Contemporary Music di Guildford sebagai seorang sarjana pada usia 18 tahun di 2009. Pada awal tahun 2011, Sheeran secara independen merilis sebuah extended play berjudul No. 5 Collaborations Project." );
        card.setCardimage( R.drawable.ed_sheeran );
        singerModels.add( card );

        card = new SingerModel();
        card.setCardtitle( "Camila Cabello" );
        card.setCarddesc( "Karla Camila Cabello Estrabao, lahir 3 Maret 1997) adalah seorang penyanyi dan penulis lagu berkebangsaan Kuba-Amerika Serikat. Dia terkenal sejak menjadi anggota dari grup Fifth Harmony, terbentuk pada musim kedua dari The X Factor pada tahun 2012. Setelah itu, grup tersebut menandatangani kontrak gabungan dengan Syco Music dan Epic Records untuk perilisan musik mereka." );
        card.setCardimage( R.drawable.camila_cabello );
        singerModels.add( card );

        card = new SingerModel();
        card.setCardtitle( "Jason Mraz" );
        card.setCarddesc( "Jason Mraz, lahir 23 Juni 1977 adalah penyanyi dan penulis lagu Amerika Serikat. Ia lahir dan dibesarkan di Mechanicsville, Virginia. Ia telah bermain dengan banyak musisi, diantaranya Jack Johnson, Dave Matthews Band, James Blunt, Gavin DeGraw, Paula Cole, John Popper, Alanis Morissette, The Ohio Players, Rachael Yamagata, Tristan Prettyman, James Morrison, Lisa Hannigan, John Mayer, Jewel, Colbie Caillat, dan Ingrid Michaelson." );
        card.setCardimage( R.drawable.jason_mraz );
        singerModels.add( card );

        card = new SingerModel();
        card.setCardtitle( "Taylor Swift" );
        card.setCarddesc( "Taylor Alison Swift, lahir 13 Desember 1989 adalah seorang penyanyi dan penulis lagu berkebangsaan Amerika Serikat. Dibesarkan di Pennsylvania, dia pindah ke Nashville, Tennessee pada usia 14 tahun untuk mengejar karier di musik country. Dia menandatangani kontrak dengan label independen Big Machine Records. Pada tahun 2018 setelah kontraknya dengan Big Machine Records selesai, dia memutuskan untuk bergabung dengan Universal Music Group dan menjadi penulis lagu termuda yang pernah dipekerjakan oleh Sony/ATV Music publishing house." );
        card.setCardimage( R.drawable.taylor_swift );
        singerModels.add( card );

        card = new SingerModel();
        card.setCardtitle( "Demi Lovato" );
        card.setCarddesc( "Demetria Devonne Lovato, lahir 20 Agustus 1992 adalah seorang penyanyi, penulis lagu dan aktris berkebangsaan Amerika Serikat. Setelah tampil diserial televisi anak-anak Barney & Friends ketika masih kecil, dia mendapat peran terobosan sebagai Mitchie Torres di film televisi Disney Channel yang berjudul Camp Rock (2008) dan lanjutannya Camp Rock 2: The Final Jam (2010)." );
        card.setCardimage( R.drawable.demi_lovato );
        singerModels.add( card );

        card = new SingerModel();
        card.setCardtitle( "Anne-Marie" );
        card.setCarddesc( "Anne-Marie Rose Nicholson, lahir 7 April 1991 yang dikenal secara profesional sebagai Anne-Marie, adalah seorang penyanyi dan penulis lagu berkebangsaan Inggris. Dia telah mencapai beberapa charting single di UK Singles Chart, termasuk Clean Bandit\'s Rockabye, yang menampilkan Sean Paul, yang mencapai posisi puncak di nomor satu, serta Alarm, Ciao Adios, dan Friends. Album studio debutnya, Speak Your Mind, akan dirilis pada 27 April 2018." );
        card.setCardimage( R.drawable.anne_marie );
        singerModels.add( card );

        card = new SingerModel();
        card.setCardtitle( "Bebe Rexha" );
        card.setCarddesc( "Bleta Rexha, lahir 30 Agustus 1989 adalah seorang penyanyi, penulis lagu dan produser rekaman berkebangsaan Amerika Serikat. Dia dikenal atas lagu seperti (Meant to Be) bersama Florida Georgia Line, (Me, Myself & I) bersama G-Eazy, dan (In the Name of Love) bersama Martin Garrix. Dia juga menulis lagu untuk beberapa artis seperti Selena Gomez, Nick Jonas, dan Eminem." );
        card.setCardimage( R.drawable.bebe_rexha );
        singerModels.add( card );

        return singerModels;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate( R.menu.about_menu, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        if (id==R.id.act_about){
            Intent intent=new Intent( this,AboutActivity.class );
            Toast.makeText( this, "About Me",Toast.LENGTH_SHORT ).show();
            this.startActivity( intent );
            return true;
        }

        return super.onOptionsItemSelected( item );
    }
}