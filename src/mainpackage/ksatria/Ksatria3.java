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

public class Ksatria3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ksatria3);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		String htmlText3 = "<html><body style=\"text-align:justify\" > <style=\"background-color:transparent\"> %s </body></Html>";
		String Pahlawan3 = "Raden Adjeng Kartini (lahir di Jepara, Jawa Tengah, 21 April 1879 – meninggal di Rembang, Jawa Tengah, 17 September 1904 pada umur 25 tahun) atau sebenarnya lebih tepat disebut Raden Ayu Kartini[1] adalah seorang tokoh suku Jawa dan Pahlawan Nasional Indonesia. Kartini dikenal sebagai pelopor kebangkitan perempuan pribumi." +
				"</br></br><b>Biografi</b>" +
				"</br></br>Raden Adjeng Kartini berasal dari kalangan priyayi atau kelas bangsawan Jawa.[2] Ia merupakan putri dari Raden Mas Adipati Ario Sosroningrat, seorang patih yang diangkat menjadi bupati Jepara segera setelah Kartini lahir.[2] Kartini adalah putri dari istri pertama, tetapi bukan istri utama.[2] Ibunya bernama M.A. Ngasirah, putri dari Nyai Haji Siti Aminah dan Kyai Haji Madirono, seorang guru agama di Telukawur, Jepara.[2] Dari sisi ayahnya, silsilah Kartini dapat dilacak hingga Hamengkubuwana VI. Garis keturunan Bupati Sosroningrat bahkan dapat ditilik kembali ke istana Kerajaan Majapahit.[2] Semenjak Pangeran Dangirin menjadi bupati Surabaya pada abad ke-18, nenek moyang Sosroningrat mengisi banyak posisi penting di Pangreh Praja." +
				"</br></br>Ayah Kartini pada mulanya adalah seorang wedana di Mayong. Peraturan kolonial waktu itu mengharuskan seorang bupati beristerikan seorang bangsawan. Karena M.A. Ngasirah bukanlah bangsawan tinggi[3], maka ayahnya menikah lagi dengan Raden Adjeng Woerjan (Moerjam), keturunan langsung Raja Madura.[2] Setelah perkawinan itu, maka ayah Kartini diangkat menjadi bupati di Jepara menggantikan kedudukan ayah kandung R.A. Woerjan, R.A.A. Tjitrowikromo." +
				"</br></br>Kartini adalah anak ke-5 dari 11 bersaudara kandung dan tiri. Dari kesemua saudara sekandung, Kartini adalah anak perempuan tertua. Kakeknya, Pangeran Ario Tjondronegoro IV, diangkat bupati dalam usia 25 tahun dan dikenal pada pertengahan abad ke-19 sebagai salah satu bupati pertama yang memberi pendidikan Barat kepada anak-anaknya.[2] Kakak Kartini, Sosrokartono, adalah seorang yang pintar dalam bidang bahasa. Sampai usia 12 tahun, Kartini diperbolehkan bersekolah di ELS (Europese Lagere School). Di sini antara lain Kartini belajar bahasa Belanda. Tetapi setelah usia 12 tahun, ia harus tinggal di rumah karena sudah bisa dipingit." +
				"</br></br>Karena Kartini bisa berbahasa Belanda, maka di rumah ia mulai belajar sendiri dan menulis surat kepada teman-teman korespondensi yang berasal dari Belanda. Salah satunya adalah Rosa Abendanon yang banyak mendukungnya. Dari buku-buku, koran, dan majalah Eropa, Kartini tertarik pada kemajuan berpikir perempuan Eropa. Timbul keinginannya untuk memajukan perempuan pribumi, karena ia melihat bahwa perempuan pribumi berada pada status sosial yang rendah. Kartini bersama suaminya, R.M.A.A. Singgih Djojo Adhiningrat (1903)." +
				"</br></br>Kartini banyak membaca surat kabar Semarang De Locomotief yang diasuh Pieter Brooshooft, ia juga menerima leestrommel (paket majalah yang diedarkan toko buku kepada langganan). Di antaranya terdapat majalah kebudayaan dan ilmu pengetahuan yang cukup berat, juga ada majalah wanita Belanda De Hollandsche Lelie. Kartini pun kemudian beberapa kali mengirimkan tulisannya dan dimuat di De Hollandsche Lelie. Dari surat-suratnya tampak Kartini membaca apa saja dengan penuh perhatian, sambil membuat catatan-catatan. Kadang-kadang Kartini menyebut salah satu karangan atau mengutip beberapa kalimat. Perhatiannya tidak hanya semata-mata soal emansipasi wanita, tapi juga masalah sosial umum. Kartini melihat perjuangan wanita agar memperoleh kebebasan, otonomi dan persamaan hukum sebagai bagian dari gerakan yang lebih luas. Di antara buku yang dibaca Kartini sebelum berumur 20, terdapat judul Max Havelaar dan Surat-Surat Cinta karya Multatuli, yang pada November 1901 sudah dibacanya dua kali. Lalu De Stille Kraacht (Kekuatan Gaib) karya Louis Coperus. Kemudian karya Van Eeden yang bermutu tinggi, karya Augusta de Witt yang sedang-sedang saja, roman-feminis karya Nyonya Goekoop de-Jong Van Beek dan sebuah roman anti-perang karangan Berta Von Suttner, Die Waffen Nieder (Letakkan Senjata). Semuanya berbahasa Belanda." +
				"</br></br>Oleh orangtuanya, Kartini disuruh menikah dengan bupati Rembang, K.R.M. Adipati Ario Singgih Djojo Adhiningrat, yang sudah pernah memiliki tiga istri. Kartini menikah pada tanggal 12 November 1903. Suaminya mengerti keinginan Kartini dan Kartini diberi kebebasan dan didukung mendirikan sekolah wanita di sebelah timur pintu gerbang kompleks kantor kabupaten Rembang, atau di sebuah bangunan yang kini digunakan sebagai Gedung Pramuka. Sekolah Kartini (Kartinischool), 1918." +
				"</br></br>Anak pertama dan sekaligus terakhirnya, Soesalit Djojoadhiningrat, lahir pada tanggal 13 September 1904. Beberapa hari kemudian, 17 September 1904, Kartini meninggal pada usia 25 tahun. Kartini dimakamkan di Desa Bulu, Kecamatan Bulu, Rembang." +
				"</br></br>Berkat kegigihannya Kartini, kemudian didirikan Sekolah Wanita oleh Yayasan Kartini di Semarang pada 1912, dan kemudian di Surabaya, Yogyakarta, Malang, Madiun, Cirebon dan daerah lainnya. Nama sekolah tersebut adalah 'Sekolah Kartini'. Yayasan Kartini ini didirikan oleh keluarga Van Deventer, seorang tokoh Politik Etis." +
				"</br></br><b>Surat-surat</b>" +
				"</br></br>Setelah Kartini wafat, Mr. J.H. Abendanon mengumpulkan dan membukukan surat-surat yang pernah dikirimkan R.A Kartini pada teman-temannya di Eropa. Abendanon saat itu menjabat sebagai Menteri Kebudayaan, Agama, dan Kerajinan Hindia Belanda. Buku itu diberi judul Door Duisternis tot Licht yang arti harfiahnya 'Dari Kegelapan Menuju Cahaya'. Buku kumpulan surat Kartini ini diterbitkan pada 1911. Buku ini dicetak sebanyak lima kali, dan pada cetakan terakhir terdapat tambahan surat Kartini." +
				"</br></br>Pada tahun 1922, Balai Pustaka menerbitkannya dalam bahasa Melayu dengan judul yang diterjemahkan menjadi Habis Gelap Terbitlah Terang: Boeah Pikiran, yang merupakan terjemahan oleh Empat Saudara. Kemudian tahun 1938, keluarlah Habis Gelap Terbitlah Terang versi Armijn Pane seorang sastrawan Pujangga Baru. Armijn membagi buku menjadi lima bab pembahasan untuk menunjukkan perubahan cara berpikir Kartini sepanjang waktu korespondensinya. Versi ini sempat dicetak sebanyak sebelas kali. Surat-surat Kartini dalam bahasa Inggris juga pernah diterjemahkan oleh Agnes L. Symmers. Selain itu, surat-surat Kartini juga pernah diterjemahkan ke dalam bahasa-bahasa Jawa dan Sunda." +
				"</br></br>Terbitnya surat-surat Kartini, seorang perempuan pribumi, sangat menarik perhatian masyarakat Belanda, dan pemikiran-pemikiran Kartini mulai mengubah pandangan masyarakat Belanda terhadap perempuan pribumi di Jawa. Pemikiran-pemikiran Kartini yang tertuang dalam surat-suratnya juga menjadi inspirasi bagi tokoh-tokoh kebangkitan nasional Indonesia, antara lain W.R. Soepratman yang menciptakan lagu berjudul Ibu Kita Kartini." +
				"</br></br><b>Pemikiran</b>" +
				"</br></br>Pada surat-surat Kartini tertulis pemikiran-pemikirannya tentang kondisi sosial saat itu, terutama tentang kondisi perempuan pribumi. Sebagian besar surat-suratnya berisi keluhan dan gugatan khususnya menyangkut budaya di Jawa yang dipandang sebagai penghambat kemajuan perempuan. Dia ingin wanita memiliki kebebasan menuntut ilmu dan belajar. Kartini menulis ide dan cita-citanya, seperti tertulis: Zelf-ontwikkeling dan Zelf-onderricht, Zelf- vertrouwen dan Zelf-werkzaamheid dan juga Solidariteit. Semua itu atas dasar Religieusiteit, Wijsheid en Schoonheid (yaitu Ketuhanan, Kebijaksanaan dan Keindahan), ditambah dengan Humanitarianisme (peri kemanusiaan) dan Nasionalisme (cinta tanah air)." +
				"</br></br>Surat-surat Kartini juga berisi harapannya untuk memperoleh pertolongan dari luar. Pada perkenalan dengan Estelle 'Stella' Zeehandelaar, Kartini mengungkap keinginan untuk menjadi seperti kaum muda Eropa. Ia menggambarkan penderitaan perempuan Jawa akibat kungkungan adat, yaitu tidak bisa bebas duduk di bangku sekolah, harus dipingit, dinikahkan dengan laki-laki yang tak dikenal, dan harus bersedia dimadu." +
				"</br></br>Pandangan-pandangan kritis lain yang diungkapkan Kartini dalam surat-suratnya adalah kritik terhadap agamanya. Ia mempertanyakan mengapa kitab suci harus dilafalkan dan dihafalkan tanpa diwajibkan untuk dipahami. Ia mengungkapkan tentang pandangan bahwa dunia akan lebih damai jika tidak ada agama yang sering menjadi alasan manusia untuk berselisih, terpisah, dan saling menyakiti. '...Agama harus menjaga kita daripada berbuat dosa, tetapi berapa banyaknya dosa diperbuat orang atas nama agama itu...' Kartini mempertanyakan tentang agama yang dijadikan pembenaran bagi kaum laki-laki untuk berpoligami. Bagi Kartini, lengkap sudah penderitaan perempuan Jawa yang dunianya hanya sebatas tembok rumah." +
				"</br></br>Surat-surat Kartini banyak mengungkap tentang kendala-kendala yang harus dihadapi ketika bercita-cita menjadi perempuan Jawa yang lebih maju. Meski memiliki seorang ayah yang tergolong maju karena telah menyekolahkan anak-anak perempuannya meski hanya sampai umur 12 tahun, tetap saja pintu untuk ke sana tertutup. Kartini sangat mencintai sang ayah, namun ternyata cinta kasih terhadap sang ayah tersebut juga pada akhirnya menjadi kendala besar dalam mewujudkan cita-cita. Sang ayah dalam surat juga diungkapkan begitu mengasihi Kartini. Ia disebutkan akhirnya mengizinkan Kartini untuk belajar menjadi guru di Betawi, meski sebelumnya tak mengizinkan Kartini untuk melanjutkan studi ke Belanda ataupun untuk masuk sekolah kedokteran di Betawi." +
				"</br></br>Keinginan Kartini untuk melanjutkan studi, terutama ke Eropa, memang terungkap dalam surat-suratnya. Beberapa sahabat penanya mendukung dan berupaya mewujudkan keinginan Kartini tersebut. Ketika akhirnya Kartini membatalkan keinginan yang hampir terwujud tersebut, terungkap adanya kekecewaan dari sahabat-sahabat penanya. Niat dan rencana untuk belajar ke Belanda tersebut akhirnya beralih ke Betawi saja setelah dinasihati oleh Nyonya Abendanon bahwa itulah yang terbaik bagi Kartini dan adiknya Rukmini." +
				"</br></br>Pada pertengahan tahun 1903 saat berusia sekitar 24 tahun, niat untuk melanjutkan studi menjadi guru di Betawi pun pupus. Dalam sebuah surat kepada Nyonya Abendanon, Kartini mengungkap tidak berniat lagi karena ia sudah akan menikah. '...Singkat dan pendek saja, bahwa saya tiada hendak mempergunakan kesempatan itu lagi, karena saya sudah akan kawin...' Padahal saat itu pihak departemen pengajaran Belanda sudah membuka pintu kesempatan bagi Kartini dan Rukmini untuk belajar di Betawi." +
				"</br></br>Saat menjelang pernikahannya, terdapat perubahan penilaian Kartini soal adat Jawa. Ia menjadi lebih toleran. Ia menganggap pernikahan akan membawa keuntungan tersendiri dalam mewujudkan keinginan mendirikan sekolah bagi para perempuan bumiputra kala itu. Dalam surat-suratnya, Kartini menyebutkan bahwa sang suami tidak hanya mendukung keinginannya untuk mengembangkan ukiran Jepara dan sekolah bagi perempuan bumiputra saja, tetapi juga disebutkan agar Kartini dapat menulis sebuah buku." +
				"</br></br>Perubahan pemikiran Kartini ini menyiratkan bahwa dia sudah lebih menanggalkan egonya dan menjadi manusia yang mengutamakan transendensi, bahwa ketika Kartini hampir mendapatkan impiannya untuk bersekolah di Betawi, dia lebih memilih berkorban untuk mengikuti prinsip patriarki yang selama ini ditentangnya, yakni menikah dengan Adipati Rembang.";
		
		
		WebView webView1 = (WebView) findViewById(R.id.webview3);
		WebSettings webSettings = webView1.getSettings();
		webView1.setBackgroundColor(0x00FFFFFF);
		webView1.loadData(String.format(htmlText3, Pahlawan3), "text/html", "utf-8");
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
		if(findViewById(R.id.nextP3) == v){
			it = new Intent(this, Ksatria4.class);
		} else {
			it = new Intent(this, Ksatria3.class);
		}
		startActivity(it);
	}
	
}
