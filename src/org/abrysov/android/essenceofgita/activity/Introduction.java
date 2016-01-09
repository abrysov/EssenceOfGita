/**
 * 
 */
package org.abrysov.android.essenceofgita.activity;

import org.abrysov.android.essenceofgita.R;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Alexander Brysov
 *
 */
public class Introduction extends Activity{
	
	private TextView mIntroductionText = null;
	
	private Typeface tfScag = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.introdiction);
		
		tfScag = Typeface.createFromAsset(getAssets(), "fonts/scagrg__.ttf");
		
		mIntroductionText = (TextView)findViewById(R.id.intro_tv_text);
		mIntroductionText.setTypeface(tfScag , Typeface.NORMAL);
		
	}
}
