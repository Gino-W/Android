package com.example.intent_return;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class sactivity extends Activity{
	private Button bt2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sactivity_layout);
		
		bt2 = (Button)findViewById(R.id.bt2);
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent data = new Intent();
				data.putExtra("return_data", "¹þ¹þ");
				setResult(2, data);
				finish();
			}
		});
	}

	
}
