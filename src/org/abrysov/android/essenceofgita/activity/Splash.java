/**
 * 
 */
package org.abrysov.android.essenceofgita.activity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;

import org.abrysov.android.essenceofgita.MainActivity;
import org.abrysov.android.essenceofgita.R;

/**
 * @author Alexander Brysov
 *
 */
public class Splash extends Activity implements OnClickListener{
	
	private static final String TAG = "_eg_Splash.class";

	private FrameLayout mRuVersion = null;
	private FrameLayout mEnVersion = null;
	
	SharedPreferences.Editor editor = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		SharedPreferences pref = getSharedPreferences(MainActivity.LOCAL_DATA, 0);
		editor = pref.edit();
		
		mRuVersion = (FrameLayout)findViewById(R.id.splash_fl_ru);
		mRuVersion.setOnClickListener(this);
		
		mEnVersion = (FrameLayout)findViewById(R.id.splash_fl_en);
		mEnVersion.setOnClickListener(this);
		
	}

	public void onClick(View v) {
		
		switch (v.getId()) {
		
		case R.id.splash_fl_ru:
			editor.putBoolean("en", false);
			Log.d(TAG, "en == false");
			editor.commit();
			finish();
			break;
			
		case R.id.splash_fl_en:
			editor.putBoolean("en", true);
			Log.d(TAG, "en == true");
			editor.commit();
			finish();
			break;

		default:
			break;
		}
	}

}
