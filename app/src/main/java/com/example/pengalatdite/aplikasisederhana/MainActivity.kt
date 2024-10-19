package com.example.pengalatdite.aplikasisederhana;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final List<DataNews> listBerita = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recylerView);

        Adapter mAdapter = new Adapter(listBerita);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        berita();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        startActivity(new Intent(this, ProfileActivity.class));
        return super.onOptionsItemSelected(item);
    }

    private void berita() {
        DataNews dataNews = new DataNews("Desain Ruang Tamu Leter L Ciptakan Kesan Nyaman dan Hangat", "Iron Man", "Desain ruang tamu leter L akan terkesan rapi dan cantik dengan penataan yang tepat. Ada banyak cara yang bisa Anda lakukan dalam penataan.", R.drawable.desain_ruang, R.drawable.ironman);
        listBerita.add(dataNews);

        dataNews = new DataNews("Fungsi Stabilizer Rantai Motor Lengkap dengan Pengertiannya", "Wonder Woman", "Fungsi stabilizer rantai motor cukup banyak. Karena alasan inilah sebagai pemilik kendaraan Anda wajib merawatnya.", R.drawable.fungsi_stabilizer, R.drawable.wonderwoman);
        listBerita.add(dataNews);

        dataNews = new DataNews("Rentetan Tanya ke Mahfud soal Irjen Sambo: Isu LGBT hingga Motif Porno", "Robinhood", "Mahfud Md mendapat rentetan pertanyaan terkait kasus pembunuhan Brigadir Yosua atau Brigadir J. Dari soal LGBT hingga kerajaan Sambo.", R.drawable.rentetan_tanya, R.drawable.robinhood);
        listBerita.add(dataNews);

        dataNews = new DataNews("Suga BTS Hadirkan Ringtone Terbaru untuk Samsung Galaxy Ini", "Batman", "JPNN.com : Min Yoon-gi atau dikenal dengan Suga, berkolaborasi dengan produsen ponsel dunia Samsung, menghadirkan ringtone legendaris", R.drawable.suga_bts, R.drawable.batman);
        listBerita.add(dataNews);

        dataNews = new DataNews("MotoGP 2022: Bagnaia Abaikan Saran Rossi untuk Raih Kemenangan", "Superman", "Bagnaia raih kemenangan kelima di musim 2022 usai finis terdepan di MotoGP Austria. Rupanya selama ini dia abaikan saran mentornya selama ini, Valentino Rossi.", R.drawable.motogp_2022, R.drawable.superman);
        listBerita.add(dataNews);

        dataNews = new DataNews("Bareskrim Ungkap Korupsi Jual Beli BBM, Negara Rugi Rp 451,6 Miliar", "Hawkeye", "Dittipidkor Bareskrim Polri mengungkap kasus dugaan korupsi dalam perjanjian jual beli BBM yang diduga merugikan negara Rp Rp 451,6 miliar.", R.drawable.bareskrim_ungkap, R.drawable.hawkeye);
        listBerita.add(dataNews);

        dataNews = new DataNews("Ledek Kaesang soal Erina Gudono, Bobby Nasution: Kemarin Ngejar Minta Tips", "Thor", "Unggahan Bobby Nasution langsung mendapat respons dari Kaesang Pangarep dan Erina Gudono.", R.drawable.ledek_kaesang, R.drawable.thor);
        listBerita.add(dataNews);

        dataNews = new DataNews("Siapa yang Berani & Sengaja Halangi Pemeriksaan Ferdy Sambo?", "Flash", "Kabareskrim Polri, Komjen Agus Andrianto menyebut, Putri berada di lantai 3 rumah saat Ferdy mengajukan pertanyaan kepada Eliezer dan Brigadir Rizky Rizal.", R.drawable.siapa_yang_berani, R.drawable.flash);
        listBerita.add(dataNews);

        dataNews = new DataNews("Komnas HAM: Skuad yang Ancam Bunuh Brigadir Yosua Ternyata Si Kuat Maruf", "Aquaman", "Komnas HAM menyatakan bahwa skuad yang sempat disebut Brigadir Yosua akan membunuh dia, bukan merujuk kepada tim.", R.drawable.komnas_ham, R.drawable.aquaman);
        listBerita.add(dataNews);

        dataNews = new DataNews("Tidak Sendiri, Luis Milla Bawa Dua Asisten Pelatih ke Persib Bandung", "Spiderman", "Pelatih anyar Persib Bandung, Luis Milla berencana akan membawa 2 asisten pelatih untuk menemani dirinya.", R.drawable.tidak_sendiri, R.drawable.spiderman);
        listBerita.add(dataNews);

    }
}
