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

public class Ksatria1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ksatria1);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		String htmlText1 = "<html><body style=\"text-align:justify\" > <style=\"background-color:transparent\"> %s </body></Html>";
		String Pahlawan1 = "Dipanegara adalah putra sulung Hamengkubuwono III, seorang raja Mataram di Yogyakarta. Lahir pada tanggal 11 November 1785 di Yogyakarta dengan nama Mustahar dari seorang selir bernama R.A. Mangkarawati, yaitu seorang garwa ampeyan (istri non permaisuri) yang berasal dari Pacitan. Pangeran Dipanegara bernama kecil Raden Mas Antawirya." +
				"</br></br>Menyadari kedudukannya sebagai putra seorang selir, Dipanegara menolak keinginan ayahnya, Sultan Hamengkubuwono III, untuk mengangkatnya menjadi raja. Ia menolak mengingat ibunya bukanlah permaisuri." +
				"</br></br><b> Riwayat Perjuangan</b>" +
				"</br></br>Perang Diponegoro berawal ketika pihak Belanda memasang patok di tanah milik Dipanegara di desa Tegalrejo. Saat itu, beliau memang sudah muak dengan kelakuan Belanda yang tidak menghargai adat istiadat setempat dan sangat mengeksploitasi rakyat dengan pembebanan pajak." +
				"</br></br>Sikap Dipanegara yang menentang Belanda secara terbuka, mendapat simpati dan dukungan rakyat. Atas saran Pangeran Mangkubumi, pamannya, Dipanegara menyingkir dari Tegalrejo, dan membuat markas di sebuah goa yang bernama Goa Selarong. Saat itu, Dipanegara menyatakan bahwa perlawanannya adalah perang sabil, perlawanan menghadapi kaum kafir. Semangat 'perang sabil' yang dikobarkan Dipanegara membawa pengaruh luas hingga ke wilayah Pacitan dan Kedu. Salah seorang tokoh agama di Surakarta, Kyai Maja, ikut bergabung dengan pasukan Dipanegara di Goa Selarong.Perjuangan Pangeran Dipanegara ini didukung oleh S.I.S.K.S. Pakubuwono VI dan Raden Tumenggung Prawirodigdaya Bupati Gagatan." +
				"</br></br>Selama perang ini kerugian pihak Belanda tidak kurang dari 15.000 tentara dan 20 juta gulden. Berbagai cara terus diupayakan Belanda untuk menangkap Dipanegara. Bahkan sayembara pun dipergunakan. Hadiah 50.000 Gulden diberikan kepada siapa saja yang bisa menangkap Dipanegara. Sampai akhirnya Dipanegara ditangkap pada 1830.";
		
		WebView webView1 = (WebView) findViewById(R.id.webview1);
		WebSettings webSettings = webView1.getSettings();
		webView1.setBackgroundColor(0x00FFFFFF);
		webView1.loadData(String.format(htmlText1, Pahlawan1), "text/html", "utf-8");
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
		if(findViewById(R.id.nextP1) == v){
			it = new Intent(this, Ksatria2.class);
		} else {
			it = new Intent(this, Ksatria1.class);
		}
		startActivity(it);
	}
}
