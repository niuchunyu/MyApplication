package com.ncy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
	private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		tv.setOnClickListener(new OnClickListener){
			public void click(View view){
				Toast.makeText(getApplicationContext,"呵呵",Toast.SHORT).show();
				Toast.makeText(getApplicationContext,"呵呵",Toast.SHORT).show();
			}
		}
		Toast.makeText(getApplicationContext,"呵呵",Toast.SHORT).show();
    }
}
