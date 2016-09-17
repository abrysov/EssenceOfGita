/**
 * 
 */
package org.abrysov.android.essenceofgita.activity;

import org.abrysov.android.essenceofgita.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * @author Alexander Brysov
 *
 */
public class Chapter02 extends Activity {
	
	private WebView mWebView = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chapter02);
	
		mWebView = (WebView)findViewById(R.id.ch02_wv);
		mWebView.loadUrl("file:///android_asset/chapter02.html");
		
		startActivity(new Intent(getApplicationContext(), Prechapter.class));
	}

}
