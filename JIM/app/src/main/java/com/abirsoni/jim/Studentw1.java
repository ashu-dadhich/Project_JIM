package com.abirsoni.jim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Studentw1 extends Activity {
Button b1,b2; ImageButton b3;

@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_studentw1);
		b1= (Button) findViewById(R.id.notice);
		b2= (Button) findViewById(R.id.query);
		b3 =(ImageButton) findViewById(R.id.infoo);
		
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
			
					
					Intent n = new Intent(Studentw1.this,Notices.class);
					startActivity(n);}}
				
		);
            b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Toast.makeText(Studentw1.this, "Coming soon in Ver. 1.0.1", Toast.LENGTH_SHORT).show();
					//Intent n = new Intent(Studentw1.this,Query.class);
					//startActivity(n);
				
				
			}
		});
            b3.setOnClickListener(new View.OnClickListener() {
    			
    			@Override
    			public void onClick(View arg0) {
    				
    				
    					Intent n = new Intent(Studentw1.this,Info.class);
    					startActivity(n);
    				
    				
    			}
    		});
		
		
		
	}

}
