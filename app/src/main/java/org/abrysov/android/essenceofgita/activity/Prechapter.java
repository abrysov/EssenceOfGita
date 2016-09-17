/**
 * 
 */
package org.abrysov.android.essenceofgita.activity;

import org.abrysov.android.essenceofgita.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;

/**
 * @author Alexander Brysov
 *
 */
public class Prechapter extends Activity {
	
	private FrameLayout mGeneral = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pre_chapter);
		
		mGeneral = (FrameLayout)findViewById(R.id.pre_fl_general);
		mGeneral.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				finish();
			}
		});
	}

}
