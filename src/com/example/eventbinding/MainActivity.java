package com.example.eventbinding;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button myBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myBtn=(Button)findViewById(R.id.mybtn);
		myBtn.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Toast.makeText(MainActivity.this, "监听器中的处理方法", Toast.LENGTH_SHORT).show();
			}		
		});
	}
	
	public void clickEventHandler(View source){
		Toast.makeText(this, "自定义事件处理方法", Toast.LENGTH_SHORT).show();		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
