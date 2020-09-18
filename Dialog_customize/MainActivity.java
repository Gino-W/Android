package com.example.dialog_customize;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //��ȡ��ť
        bt1 = (Button) findViewById(R.id.bt1);
        //��ť���ü����¼�
        bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				showDialog();
			}
		});
    }

    //��ʾ�Զ���Ի���
    private void showDialog(){
    	LayoutInflater inflater = LayoutInflater.from(this);
    	View view = inflater.inflate(R.layout.dialog, null);
    	AlertDialog.Builder bulider = new AlertDialog.Builder(this);
    	bulider.setTitle("������Կ��");
    	bulider.setIcon(R.id.image_1);
    	bulider.setView(view);
    	AlertDialog dialog = bulider.create();
    	dialog.show();
    }
    
}
