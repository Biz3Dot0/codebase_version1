package com.example.kvrdatareport;

import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;

public class KVRSplashActivity extends Activity {

	private long splashscreenDelay =3000; //3 seconds
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kvrsplash);
		
		TimerTask task = new TimerTask()
			{
		   		@Override
		   		public void run() 
		   		  {
					    // TODO Auto-generated method stub
		   			Intent splashIntent = new Intent().setClass(KVRSplashActivity.this,MainActivity.class);
		   			startActivity(splashIntent);
		   			
		   		  }
		   	 };
		   	 Timer timer = new Timer();
		   	 timer.schedule(task, splashscreenDelay);
			}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kvrsplash, menu);
		return true;
	}

}
