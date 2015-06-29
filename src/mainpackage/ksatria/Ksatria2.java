package mainpackage.ksatria;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Ksatria2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ksatria2);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		String htmlText2 = "<html><body style=\"text-align:justify\" > <style=\"background-color:transparent\"> %s </body></Html>";
		String Pahlawan2 = "Pattimura(atau Thomas Matulessy) (lahir di Haria, pulau Saparua, Maluku, 8 Juni 1783 – meninggal di Ambon, Maluku, 16 Desember 1817 pada umur 34 tahun), juga dikenal dengan nama Kapitan Pattimura adalah pahlawan Maluku dan merupakan Pahlawan nasional Indonesia." +
				"</br></br>Menurut buku biografi Pattimura versi pemerintah yang pertama kali terbit, M Sapija menulis, 'Bahwa pahlawan Pattimura tergolong turunan bangsawan dan berasal dari Nusa Ina (Seram). Ayah beliau yang bernama Antoni Mattulessy adalah anak dari Kasimiliali Pattimura Mattulessy. Yang terakhir ini adalah putra raja Sahulau. Sahulau merupakan nama orang di negeri yang terletak dalam sebuah teluk di Seram Selatan'</body>" +
				"</br></br>Namun berbeda dengan sejarawan Mansyur Suryanegara. Dia mengatakan dalam bukunya Api Sejarah bahwa Ahmad Lussy atau dalam bahasa Maluku disebut Mat Lussy, lahir di Hualoy, Seram Selatan (bukan Saparua seperti yang dikenal dalam sejarah versi pemerintah). Dia adalah bangsawan dari kerajaan Islam Sahulau, yang saat itu diperintah Sultan Abdurrahman. Raja ini dikenal pula dengan sebutan Sultan Kasimillah (Kazim Allah/Asisten Allah). Dalam bahasa Maluku disebut Kasimiliali." +
				"</br></br><b>Perjuangan</b>" +
				"</br></br>Sebelum melakukan perlawanan terhadap VOC ia pernah berkarier dalam militer sebagai mantan sersan Militer Inggris.[3] Kata 'Maluku' berasal dari bahasa Arab Al Mulk atau Al Malik yang berarti Tanah Raja-Raja.[4] mengingat pada masa itu banyaknya kerajaan." +
				"</br></br>Pada tahun 1816 pihak Inggris menyerahkan kekuasaannya kepada pihak Belanda dan kemudian Belanda menetapkan kebijakan politik monopoli, pajak atas tanah (landrente), pemindahan penduduk serta pelayaran Hongi (Hongi Tochten), serta mengabaikan Traktat London I antara lain dalam pasal 11 memuat ketentuan bahwa Residen Inggris di Ambon harus merundingkan dahulu pemindahan koprs Ambon dengan Gubenur dan dalam perjanjian tersebut juga dicantumkan dengan jelas bahwa jika pemerintahan Inggris berakhir di Maluku maka para serdadu-serdadu Ambon harus dibebaskan dalam artian berhak untuk memilih untuk memasuki dinas militer pemerintah baru atau keluar dari dinas militer, akan tetapi dalam pratiknya pemindahan dinas militer ini dipaksakan [5] Kedatangan kembali kolonial Belanda pada tahun 1817 mendapat tantangan keras dari rakyat. Hal ini disebabkan karena kondisi politik, ekonomi, dan hubungan kemasyarakatan yang buruk selama dua abad. Rakyat Maluku akhirnya bangkit mengangkat senjata di bawah pimpinan Kapitan Pattimura [4] Maka pada waktu pecah perang melawan penjajah Belanda tahun 1817, Raja-raja Patih, Para Kapitan, Tua-tua Adat dan rakyat mengangkatnya sebagai pemimpin dan panglima perang karena berpengalaman dan memiliki sifat-sfat kesatria (kabaressi). Sebagai panglima perang, Kapitan Pattimura mengatur strategi perang bersama pembantunya. Sebagai pemimpin dia berhasil mengkoordinir Raja-raja Patih dalam melaksanakan kegiatan pemerintahan, memimpin rakyat, mengatur pendidikan, menyediakan pangan dan membangun benteng-benteng pertahanan. Kewibawaannya dalam kepemimpinan diakui luas oleh para Raja Patih maupun rakyat biasa. Dalam perjuangan menentang Belanda ia juga menggalang persatuan dengan kerajaan Ternate dan Tidore, raja-raja di Bali, Sulawesi dan Jawa. Perang Pattimura yang berskala nasional itu dihadapi Belanda dengan kekuatan militer yang besar dan kuat dengan mengirimkan sendiri Laksamana Buykes, salah seorang Komisaris Jenderal untuk menghadapi Patimura." +
				"</br></br>Pertempuran-pertempuran yang hebat melawan angkatan perang Belanda di darat dan di laut dikoordinir Kapitan Pattimura yang dibantu oleh para penglimanya antara lain Melchior Kesaulya, Anthoni Rebhok, Philip Latumahina dan Ulupaha. Pertempuran yang menghancurkan pasukan Belanda tercatat seperti perebutan benteng Belanda Duurstede, pertempuran di pantai Waisisil dan jasirah Hatawano, Ouw- Ullath, Jasirah Hitu di Pulau Ambon dan Seram Selatan. Perang Pattimura hanya dapat dihentikan dengan politik adu domba, tipu muslihat dan bumi hangus oleh Belanda. Para tokoh pejuang akhirnya dapat ditangkap dan mengakhiri pengabdiannya di tiang gantungan pada tanggal 16 Desember 1817 di kota Ambon. Untuk jasa dan pengorbanannya itu, Kapitan Pattimura dikukuhkan sebagai “PAHLAWAN PERJUANGAN KEMERDEKAAN” oleh pemerintah Republik Indonesia.";
		
		WebView webView2 = (WebView) findViewById(R.id.webview2);
		WebSettings webSettings = webView2.getSettings();
		webView2.setBackgroundColor(0x00FFFFFF);
		webView2.loadData(String.format(htmlText2, Pahlawan2), "text/html", "utf-8");
		webSettings.setDefaultFontSize(13);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.belajar, menu);
		return true;
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
		if(findViewById(R.id.nextP2) == v){
			it = new Intent(this, Ksatria3.class);
		} else {
			it = new Intent(this, Ksatria2.class);
		}
		startActivity(it);
	}
}
