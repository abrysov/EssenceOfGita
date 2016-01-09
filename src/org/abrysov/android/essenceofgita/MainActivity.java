package org.abrysov.android.essenceofgita;

import org.abrysov.android.essenceofgita.activity.Chapter01;
import org.abrysov.android.essenceofgita.activity.Chapter02;
import org.abrysov.android.essenceofgita.activity.Chapter03;
import org.abrysov.android.essenceofgita.activity.Introduction;
import org.abrysov.android.essenceofgita.activity.Splash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity implements OnClickListener{

	public final static String LOCAL_DATA = "local_saved";
	
	private final static String TAG = "_eg_MainActivity.class";
	
	private FrameLayout mContentArea = null;
	private FrameLayout mChapter1Area = null;
	private FrameLayout mChapter2Area = null;
	private FrameLayout mChapter3Area = null;
	
	private TextView mContentText = null;
	private TextView mCh1Text = null;
	private TextView mCh2Text = null;
	private TextView mCh3Text = null;
	
	private Typeface mTextType = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 
        
        mTextType = Typeface.createFromAsset(getAssets(), "fonts/scagrg__.ttf");
       
        mContentText = (TextView)findViewById(R.id.main_tv_introduct);
        mContentText.setTypeface(mTextType, Typeface.NORMAL);
        mCh1Text = (TextView)findViewById(R.id.main_tv_ch1);
        mCh1Text.setTypeface(mTextType, Typeface.NORMAL);
        mCh2Text = (TextView)findViewById(R.id.main_tv_ch2);
        mCh2Text.setTypeface(mTextType, Typeface.NORMAL);
        mCh3Text = (TextView)findViewById(R.id.main_tv_ch3);
        mCh3Text.setTypeface(mTextType, Typeface.NORMAL);
        
        mContentArea = (FrameLayout)findViewById(R.id.main_fl_introduction);
        mContentArea.setOnClickListener(this);
        mChapter1Area = (FrameLayout)findViewById(R.id.main_fl_ch1);
        mChapter1Area.setOnClickListener(this);
        mChapter2Area = (FrameLayout)findViewById(R.id.main_fl_ch2);
        mChapter2Area.setOnClickListener(this);
        mChapter3Area = (FrameLayout)findViewById(R.id.main_fl_ch3);
        mChapter3Area.setOnClickListener(this);
        
        Intent iSplash = new Intent(getApplicationContext(), Splash.class);
        if (iSplash != null) {
        	Log.i(TAG, "splash not NULL");
        }
        startActivity(iSplash);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View v) {
			switch (v.getId()) {
			case R.id.main_fl_introduction:
				startActivity(new Intent (getApplicationContext(), Introduction.class));
				break;
				
			case R.id.main_fl_ch1:
				startActivity(new Intent (getApplicationContext(), Chapter01.class));
				break;

			case R.id.main_fl_ch2:
				startActivity(new Intent (getApplicationContext(), Chapter02.class));
				break;
			
			case R.id.main_fl_ch3:
				startActivity(new Intent (getApplicationContext(), Chapter03.class));
				break;
				

			default:
				break;
			}
	}

    
}
