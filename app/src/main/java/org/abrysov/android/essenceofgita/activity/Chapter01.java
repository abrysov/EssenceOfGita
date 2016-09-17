/**
 * 
 */
package org.abrysov.android.essenceofgita.activity;

import org.abrysov.android.essenceofgita.MainActivity;
import org.abrysov.android.essenceofgita.R;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * @author Alexander Brysov
 *
 */
public class Chapter01 extends Activity {

	private WebView mWebView = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chapter01_);

		SharedPreferences pref = getSharedPreferences(MainActivity.LOCAL_DATA, 0);
		
		mWebView = (WebView)findViewById(R.id.chapter01_wv);
		
		if (pref.getBoolean("en", true) == true){
			mWebView.loadUrl("file:///android_asset/chapter_01_en.html");
		}else{
			mWebView.loadUrl("file:///android_asset/chapter01.html");
		}

		startActivity(new Intent(getApplicationContext(), Prechapter.class));
	}
	
}
