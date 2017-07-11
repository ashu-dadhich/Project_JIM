package com.abirsoni.jim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Sign extends Activity {
	 Button b1,b2,b4; ImageButton b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        
        
        b1 = (Button) findViewById(R.id.signin);
        b2 = (Button) findViewById(R.id.signup);
        b3 = (ImageButton) findViewById(R.id.infoo);
        b4=(Button) findViewById(R.id.fact);
        
        
        
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent n1= new Intent(Sign.this,Sign_in.class);
				startActivity(n1);
				
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try {
					Class co = Class.forName("com.abirsoni.jim.Newsign");
					Intent n = new Intent(Sign.this,co);
				    startActivity(n);
			}
				 catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}});
        
         b3.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View arg0) {
 				Intent n3= new Intent(Sign.this,Info.class);
 				startActivity(n3);
 				
 			}
 		});
         b4.setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View arg0) {
  				Class c;
				try {
					c = Class.forName("com.abirsoni.jim.Faculty");
					Intent n4= new Intent(Sign.this,c);
	  				startActivity(n4);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
  				
  				
  			}
  		});
         
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sign, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
