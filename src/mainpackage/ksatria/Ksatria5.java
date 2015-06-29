package mainpackage.ksatria;

import mainpackage.ksatria.R;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Ksatria5 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ksatria5);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		String htmlText1 = "<html><body style=\"text-align:justify\" > <style=\"background-color:transparent\"> %s </body></Html>";
		String Pahlawan1 = "Cut Nyak Dhien (ejaan lama: Tjoet Nja' Dhien, Lampadang, Kerajaan Aceh, 1848 – Sumedang, Jawa Barat, 6 November 1908; dimakamkan di Gunung Puyuh, Sumedang) adalah seorang Pahlawan Nasional Indonesia dari Aceh yang berjuang melawan Belanda pada masa Perang Aceh. Setelah wilayah VI Mukim diserang, ia mengungsi, sementara suaminya Ibrahim Lamnga bertempur melawan Belanda. Ibrahim Lamnga tewas di Gle Tarum pada tanggal 29 Juni 1878 yang menyebabkan Cut Nyak Dhien sangat marah dan bersumpah hendak menghancurkan Belanda." +
				"</br></br>Teuku Umar, salah satu tokoh yang melawan Belanda, melamar Cut Nyak Dhien. Pada awalnya Cut Nyak Dhien menolak, tetapi karena Teuku Umar memperbolehkannya ikut serta dalam medan perang, Cut Nyak Dhien setuju untuk menikah dengannya pada tahun 1880. Mereka dikaruniai anak yang diberi nama Cut Gambang.[1] Setelah pernikahannya dengan Teuku Umar, ia bersama Teuku Umar bertempur bersama melawan Belanda. Namun, Teuku Umar gugur saat menyerang Meulaboh pada tanggal 11 Februari 1899, sehingga ia berjuang sendirian di pedalaman Meulaboh bersama pasukan kecilnya. Cut Nyak Dien saat itu sudah tua dan memiliki penyakit encok dan rabun, sehingga satu pasukannya yang bernama Pang Laot melaporkan keberadaannya karena iba.[2][3] Ia akhirnya ditangkap dan dibawa ke Banda Aceh. Di sana ia dirawat dan penyakitnya mulai sembuh. Namun, keberadaannya menambah semangat perlawanan rakyat Aceh. Ia juga masih berhubungan dengan pejuang Aceh yang belum tertangkap. Akibatnya, Dhien dibuang ke Sumedang. Tjoet Nyak Dhien meninggal pada tanggal 6 November 1908 dan dimakamkan di Gunung Puyuh, Sumedang." +
				"</br></br><b>Kehidupan Awal</b>" +
				"</br></br>Cut Nyak Dhien dilahirkan dari keluarga bangsawan yang taat beragama di Aceh Besar, wilayah VI Mukim pada tahun 1848. Ayahnya bernama Teuku Nanta Seutia, seorang uleebalang VI Mukim, yang juga merupakan keturunan Datuk Makhudum Sati, perantau dari Minangkabau. Datuk Makhudum Sati mungkin datang ke Aceh pada abad ke 18 ketika kesultanan Aceh diperintah oleh Sultan Jamalul Badrul Munir. Oleh sebab itu, Ayah dari Cut Nyak Dhien merupakan keturunan Minangkabau[2][4]. Ibu Cut Nyak Dhien adalah putri uleebalang Lampagar.Pada masa kecilnya, Cut Nyak Dhien adalah anak yang cantik.[2] Ia memperoleh pendidikan pada bidang agama (yang dididik oleh orang tua ataupun guru agama) dan rumah tangga (memasak, melayani suami, dan yang menyangkut kehidupan sehari-hari yang dididik baik oleh orang tuanya). Banyak laki-laki yang suka pada Cut Nyak Dhien dan berusaha melamarnya. Pada usia 12 tahun, ia sudah dinikahkan oleh orangtuanya pada tahun 1862 dengan Teuku Cek Ibrahim Lamnga[2][4], putra dari uleebalang Lamnga XIII. Mereka memiliki satu anak laki-laki." +
				"</br></br><b>Perlawanan saat Perang Aceh</b>" +
				"</br></br>Pada tanggal 26 Maret 1873, Belanda menyatakan perang kepada Aceh, dan mulai melepaskan tembakan meriam ke daratan Aceh dari kapal perang Citadel van Antwerpen. Perang Aceh pun meletus. Pada perang pertama (1873-1874), Aceh yang dipimpin oleh Panglima Polim dan Sultan Machmud Syah bertempur melawan Belanda yang dipimpin Johan Harmen Rudolf Köhler. Saat itu, Belanda mengirim 3.198 prajurit. Lalu, pada tanggal 8 April 1873, Belanda mendarat di Pantai Ceureumen di bawah pimpinan Köhler, dan langsung bisa menguasai Masjid Raya Baiturrahman dan membakarnya. Kesultanan Aceh dapat memenangkan perang pertama. Ibrahim Lamnga yang mbertarung di garis depan kembali dengan sorak kemenangan, sementara Köhler tewas tertembak pada April 1873." +
				"</br></br>Pada tahun 1874-1880, di bawah pimpinan Jenderal Jan van Swieten, daerah VI Mukim dapat diduduki Belanda pada tahun 1873, sedangkan Keraton Sultan jatuh pada tahun 1874. Cut Nyak Dhien dan bayinya akhirnya mengungsi bersama ibu-ibu dan rombongan lainnya pada tanggal 24 Desember 1875. Suaminya selanjutnya bertempur untuk merebut kembali daerah VI Mukim." +
				"</br></br>Ketika Ibrahim Lamnga bertempur di Gle Tarum, ia tewas pada tanggal 29 Juni 1878. Hal ini membuat Cut Nyak Dhien sangat marah dan bersumpah akan menghancurkan Belanda." +
				"</br></br>Teuku Umar, tokoh pejuang Aceh, melamar Cut Nyak Dhien. Pada awalnya Cut Nyak Dhien menolak. Namun, karena Teuku Umar mempersilakannya untuk ikut bertempur dalam medan perang, Cut Nyak Dien akhirnya menerimanya dan menikah lagi dengan Teuku Umar pada tahun 1880. Hal ini membuat meningkatnya moral semangat perjuangan Aceh melawan Kaphe Ulanda (Belanda Kafir). Nantinya, Cut Nyak Dhien dan Teuku Umar memiliki anak yang diberi nama Cut Gambang." +
				"</br></br>Perang dilanjutkan secara gerilya dan dikobarkan perang fi'sabilillah. Sekitar tahun 1875, Teuku Umar melakukan gerakan dengan mendekati Belanda dan hubungannya dengan orang Belanda semakin kuat. Pada tanggal 30 September 1893, Teuku Umar dan pasukannya yang berjumlah 250 orang pergi ke Kutaraja dan 'menyerahkan diri' kepada Belanda. Belanda sangat senang karena musuh yang berbahaya mau membantu mereka, sehingga mereka memberikan Teuku Umar gelar Teuku Umar Johan Pahlawan dan menjadikannya komandan unit pasukan Belanda dengan kekuasaan penuh. Teuku Umar merahasiakan rencana untuk menipu Belanda, meskipun ia dituduh sebagai penghianat oleh orang Aceh. Bahkan, Cut Nyak Meutia datang menemui Cut Nyak Dhien dan memakinya.[1][2] Cut Nyak Dien berusaha menasehatinya untuk kembali melawan Belanda. Namun, Teuku Umar masih terus berhubungan dengan Belanda. Umar lalu mencoba untuk mempelajari taktik Belanda, sementara pelan-pelan mengganti sebanyak mungkin orang Belanda di unit yang ia kuasai. Ketika jumlah orang Aceh pada pasukan tersebut cukup, Teuku Umar melakukan rencana palsu pada orang Belanda dan mengklaim bahwa ia ingin menyerang basis Aceh." +
				"</br></br>Teuku Umar dan Cut Nyak Dhien pergi dengan semua pasukan dan perlengkapan berat, senjata, dan amunisi Belanda, lalu tidak pernah kembali. Penghianatan ini disebut Het verraad van Teukoe Oemar (pengkhianatan Teuku Umar).Teuku Umar yang mengkhianati Belanda menyebabkan Belanda marah dan melancarkan operasi besar-besaran untuk menangkap baik Cut Nyak Dhien dan Teuku Umar.[1][2] Namun, gerilyawan kini dilengkapi perlengkapan dari Belanda. Mereka mulai menyerang Belanda sementara Jend. Van Swieten diganti. Penggantinya, Jend. Jakobus Ludovicius Hubertus Pel, dengan cepat terbunuh dan pasukan Belanda berada pada kekacauan.[1] Belanda lalu mencabut gelar Teuku Umar dan membakar rumahnya, dan juga mengejar keberadaannya." +
				"</br></br>Dien dan Umar terus menekan Belanda, lalu menyerang Banda Aceh (Kutaraja) dan Meulaboh (bekas basis Teuku Umar), sehingga Belanda terus-terusan mengganti jendral yang bertugas.[1] Unit 'Maréchaussée' lalu dikirim ke Aceh. Mereka dianggap biadab dan sangat sulit ditaklukan oleh orang Aceh. Selain itu, kebanyakan pasukan 'De Marsose' merupakan orang Tionghoa-Ambon yang menghancurkan semua yang ada di jalannya.[1] Akibat dari hal ini, pasukan Belanda merasa simpati kepada orang Aceh dan Van der Heyden membubarkan unit 'De Marsose'.[1] Peristiwa ini juga menyebabkan kesuksesan jendral selanjutnya karena banyak orang yang tidak ikut melakukan jihad kehilangan nyawa mereka, dan ketakutan masih tetap ada pada penduduk Aceh." +
				"</br></br>Jendral Joannes Benedictus van Heutsz memanfaatkan ketakutan ini dan mulai menyewa orang Aceh untuk memata-matai pasukan pemberontak sebagai informan sehingga Belanda menemukan rencana Teuku Umar untuk menyerang Meulaboh pada tanggal 11 Februari 1899. Akhirnya, Teuku Umar gugur tertembak peluru. Ketika Cut Gambang, anak Cut Nyak Dhien, menangis karena kematian ayahnya, ia ditampar oleh ibunya yang lalu memeluknya dan berkata:" +
				"</br></br>Sebagai perempuan Aceh, kita tidak boleh menumpahkan air mata pada orang yang sudah syahid" +
				"</br></br>Cut Nyak Dien lalu memimpin perlawanan melawan Belanda di daerah pedalaman Meulaboh bersama pasukan kecilnya dan mencoba melupakan suaminya. Pasukan ini terus bertempur sampai kehancurannya pada tahun 1901 karena tentara Belanda sudah terbiasa berperang di medan daerah Aceh. Selain itu, Cut Nyak Dien sudah semakin tua. Matanya sudah mulai rabun, dan ia terkena penyakit encok dan juga jumlah pasukannya terus berkurang, serta sulit memperoleh makanan. Hal ini membuat iba para pasukan-pasukannya." +
				"</br></br>Anak buah Cut Nyak Dhien yang bernama Pang Laot melaporkan lokasi markasnya kepada Belanda karena iba.[2][3] Akibatnya, Belanda menyerang markas Cut Nyak Dien di Beutong Le Sageu. Mereka terkejut dan bertempur mati-matian. Dhien berusaha mengambil rencong dan mencoba untuk melawan musuh. Sayangnya, aksi Dhien berhasil dihentikan oleh Belanda.[5][6] Cut Nyak Dhien ditangkap, sementara Cut Gambang berhasil melarikan diri ke hutan dan meneruskan perlawanan yang sudah dilakukan oleh ayah dan ibunya.";
		
		WebView webView1 = (WebView) findViewById(R.id.webview5);
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

}
