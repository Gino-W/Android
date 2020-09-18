package com.example.intent_return;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button bt1;
	private TextView tv1;
	private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mContext=this;
        
        bt1 = (Button)findViewById(R.id.bt1);
        tv1 = (TextView)findViewById(R.id.tv1);
        
        bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(mContext,sactivity.class);
				startActivityForResult(intent, 1);
			}
		});
    }

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==1 && resultCode==2){
			String content = data.getStringExtra("return_data");
			tv1.setText(content);
		}
	}
    

    
}
