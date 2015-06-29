package mainpackage.ksatria;

import mainpackage.ksatria.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Ksatria4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ksatria4);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		String htmlText1 = "<html><body style=\"text-align:justify\" > <style=\"background-color:transparent\"> %s </body></Html>";
		String Pahlawan1 = "Raden Dewi Sartika (lahir di Bandung, 4 Desember 1884 – meninggal di Tasikmalaya, 11 September 1947 pada umur 62 tahun) adalah tokoh perintis pendidikan untuk kaum wanita, diakui sebagai Pahlawan Nasional oleh Pemerintah Indonesia tahun 1966." +
				"</br></br><b>Biografi</b>" +
				"Dewi Sartika dilahirkan dari keluarga priyayi Sunda, Nyi Raden Rajapermas dengan Raden Somanagara. Meskipun bertentangan dengan adat waktu itu, ayah-ibunya bersikukuh menyekolahkan Dewi Sartika di sekolah Belanda. Setelah ayahnya wafat, Dewi Sartika diasuh oleh pamannya (kakak ibunya) yang menjadi patih di Cicalengka. Oleh pamannya itu, ia mendapatkan pengetahuan mengenai kebudayaan Sunda, sementara wawasan kebudayaan Barat didapatkannya dari seorang nyonya Asisten Residen berkebangsaan Belanda." +
				"Sedari kecil, Dewi Sartika sudah menunjukkan bakat pendidik dan kegigihan untuk meraih kemajuan. Sambil bermain di belakang gedung kepatihan, ia sering memperagakan praktik di sekolah, belajar baca-tulis, dan bahasa Belanda, kepada anak-anak pembantu di kepatihan. Papan bilik kandang kereta, arang, dan pecahan genting dijadikannya alat bantu belajar." +
				"Waktu itu, Dewi Sartika baru berumur sekitar sepuluh tahun, ketika Cicalengka digemparkan oleh kemampuan baca-tulis dan beberapa patah kata dalam bahasa Belanda yang ditunjukkan oleh anak-anak pembantu kepatihan. Gempar, karena waktu itu belum ada anak (apalagi anak rakyat jelata) yang memiliki kemampuan seperti itu, dan diajarkan oleh seorang anak perempuan." +
				"Setelah remaja, Dewi Sartika kembali lagi kepada ibunya di Bandung. Jiwanya yang telah dewasa semakin menggiringnya untuk mewujudkan cita-citanya. Hal ini didorong pula oleh pamannya, Bupati Martanagara, yang memang memiliki keinginan yang sama. Tetapi, meski keinginan yang sama dimiliki oleh pamannya, tidak menjadikannya serta merta dapat mewujudkan cita-citanya. Adat yang mengekang kaum wanita pada waktu itu, membuat pamannya mengalami kesulitan dan khawatir. Namun karena kegigihan semangatnya yang tak pernah surut, akhirnya Dewi Sartika bisa meyakinkan pamannya dan diizinkan mendirikan sekolah untuk perempuan." +
				"Tahun 1906, Dewi Sartika menikah dengan Raden Kanduruan Agah Suriawinata, dari pernikahannya itu ia memiliki putra bernama R. Atot, yang merupakan Ketua Umum BIVB, sebuah klub sepak bola yang merupakan cikal bakal dari Persib Bandung.[rujukan?] Suami dari Dewi Sartika memiliki visi dan cita-cita yang sama dengan Dewi Sartika, guru di sekolah Karang Pamulang, yang saat itu merupakan sekolah Latihan Guru." +
				"Sejak 1902, Dewi Sartika sudah merintis pendidikan bagi kaum perempuan. Di sebuah ruangan kecil, di belakang rumah ibunya di Bandung, Dewi Sartika mengajar di hadapan anggota keluarganya yang perempuan. Merenda, memasak, jahit-menjahit, membaca, menulis dan sebagainya, menjadi materi pelajaran saat itu." +
				"Usai berkonsultasi dengan Bupati R.A. Martenagara, pada 16 Januari 1904, Dewi Sartika membuka Sakola Istri (Sekolah Perempuan) pertama se-Hindia-Belanda. Tenaga pengajarnya tiga orang : Dewi Sartika dibantu dua saudara misannya, Ny. Poerwa dan Nyi. Oewid. Murid-murid angkatan pertamanya terdiri dari 20 orang, menggunakan ruangan pendopo kabupaten Bandung." +
				"Setahun kemudian, 1905, sekolahnya menambah kelas, sehingga kemudian pindah ke Jalan Ciguriang, Kebon Cau. Lokasi baru ini dibeli Dewi Sartika dengan uang tabungan pribadinya, serta bantuan dana pribadi dari Bupati Bandung. Lulusan pertama keluar pada tahun 1909, bahasa sundabisa lebih mememenuhi syarat kelengkapan sekolah formal." +
				"Pada tahun-tahun berikutnya di beberapa wilayah Pasundan bermunculan beberapa Sakola Istri, terutama yang dikelola oleh perempuan-perempuan Sunda yang memiliki cita-cita yang sama dengan Dewi Sartika. Pada tahun 1912 sudah berdiri sembilan Sakola Istri di kota-kota kabupaten (setengah dari seluruh kota kabupaten se-Pasundan). Memasuki usia ke-sepuluh, tahun 1914, nama sekolahnya diganti menjadi Sakola Kautamaan Istri (Sekolah Keutamaan Perempuan). Kota-kota kabupaten wilayah Pasundan yang belum memiliki Sakola Kautamaan Istri tinggal tiga/empat, semangat ini menyeberang ke Bukittinggi, di mana Sakola Kautamaan Istri didirikan oleh Encik Rama Saleh. Seluruh wilayah Pasundan lengkap memiliki Sakola Kautamaan Istri di tiap kota kabupatennya pada tahun 1920, ditambah beberapa yang berdiri di kota kewedanaan." +
				"Bulan September 1929, Dewi Sartika mengadakan peringatan pendirian sekolahnya yang telah berumur 25 tahun, yang kemudian berganti nama menjadi 'Sakola Raden Déwi'. Atas jasanya dalam bidang ini, Dewi Sartika dianugerahi bintang jasa oleh pemerintah Hindia-Belanda." +
				"Dewi Sartika meninggal 11 September 1947 di Tasikmalaya, dan dimakamkan dengan suatu upacara pemakaman sederhana di pemakaman Cigagadon-Desa Rahayu Kecamatan Cineam. Tiga tahun kemudian dimakamkan kembali di kompleks Pemakaman Bupati Bandung di Jalan Karang Anyar, Kabupaten Bandung.";
		
		WebView webView1 = (WebView) findViewById(R.id.webview4);
		WebSettings webSettings = webView1.getSettings();
		webView1.setBackgroundColor(0x00FFFFFF);
		webView1.loadData(String.format(htmlText1, Pahlawan1), "text/html", "utf-8");
		webSettings.setDefaultFontSize(13);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.belajar, menu);
        return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
        	    case R.id.tentang:
                Tentang.Launch(this);
                break;
        	    case android.R.id.home:
        	        NavUtils.navigateUpFromSameTask(this);
        	        return true;
        }
        return true;
    }
	
	public void changeActivity(View v) {
		Intent it; 
		if(findViewById(R.id.nextP4) == v){
			it = new Intent(this, Ksatria5.class);
		} else {
			it = new Intent(this, Ksatria4.class);
		}
		startActivity(it);
	}

}
