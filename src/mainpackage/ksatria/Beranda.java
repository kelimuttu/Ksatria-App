package mainpackage.ksatria;

import ksatria.quiz.QuizActivity;

import ksatria.tabsswipe.adapter.TabsPagerAdapter;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

//import com.parse.Parse;


public class Beranda extends FragmentActivity implements
ActionBar.TabListener {
	
	public int score;
	private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    private ActionBar actionBar;
    // Tab titles
    private String[] tabs = { "BELAJAR", "BERMAIN" };
    

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_beranda);
		/*DatabaseHandler db = new DatabaseHandler(this);
		
		Log.d("Insert: ", "Inserting ..");
        db.addSkor (new Skor(0));
		
		Parse.initialize(this, "99X2VFcUmkWhCWogFdCX2VpHR23EPsrNeUbd8ISk", "MXdnmAcJ3LUuvHcBQAlAMKLDKG1DeYDIOIePvA1O");
		*/
		
		// Initilization
        viewPager = (ViewPager) findViewById(R.id.pager);
        actionBar = getActionBar();
        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());
 
        viewPager.setAdapter(mAdapter);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);       
 
        // Adding Tabs
        for (String tab_name : tabs) {
            actionBar.addTab(actionBar.newTab().setText(tab_name)
                    .setTabListener(this));
        }
 
        /**
         * on swiping the viewpager make respective tab selected
         * */
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
 
            @Override
            public void onPageSelected(int position) {
                // on changing the page
                // make respected tab selected
                actionBar.setSelectedNavigationItem(position);
            }
 
            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }
 
            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
	}
	
	@Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    }
 
    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        // on tab selected
        // show respected fragment view
        viewPager.setCurrentItem(tab.getPosition());
    }
 
    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.beranda, menu);
        return super.onCreateOptionsMenu(menu);
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
        	    case R.id.tentang:
                Tentang.Launch(this);
                break;
        }
        return true;
    }
	
	public void changeActivity(View v) {
		Intent it; 
		if(findViewById(R.id.TestButton1) == v){
			it = new Intent(this, Ksatria1.class);
		} else if(findViewById(R.id.TestButton2) == v){
			it = new Intent(this, Ksatria2.class);
		} else if(findViewById(R.id.TestButton3) == v){
			it = new Intent(this, Ksatria3.class);
		} else if(findViewById(R.id.TestButton4) == v){
			it = new Intent(this, Ksatria4.class);
		} else if(findViewById(R.id.TestButton5) == v){
			it = new Intent(this, Ksatria5.class);
		} else if(findViewById(R.id.ButtonImage1) == v){
			it = new Intent(this, QuizActivity.class);
		} else if(findViewById(R.id.ButtonImage2) == v){
			it = new Intent(this, Beranda.class);
		} else {
			it = new Intent(this, Beranda.class);
		}
		startActivity(it);
	}

}
