package ksatria.quiz;

import mainpackage.ksatria.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		//get rating bar object
				RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1); 
				bar.setNumStars(5);
				bar.setStepSize(0.5f);
				//get text view
				TextView t=(TextView)findViewById(R.id.textResult);
				//get score
				Bundle b = getIntent().getExtras();
				int score= b.getInt("score");
				//display score
				bar.setRating(score);
				switch (score)
				{
				case 1:
				case 2: t.setText("Belajar lagi yaa..");
				break;
				case 3:
				case 4:t.setText("Selamat! Kamu nyaris menjawab semua pertanyaan dengan benar");
				break;
				case 5:t.setText("Hebat! Kamu menjawab semua pertanyaan dengan benar :D ");
				break;
				}
						
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}

}
