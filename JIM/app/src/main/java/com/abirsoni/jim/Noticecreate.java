package com.abirsoni.jim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Noticecreate extends Activity{
	EditText e1,e2;
	Button b1;
	ImageButton b2;
    String branch,notice;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_noticecreate);
		e1=(EditText) findViewById(R.id.branches);
		e2=(EditText) findViewById(R.id.update);
		b1=(Button)findViewById(R.id.submit);
		b2=(ImageButton)findViewById(R.id.infoo);		
		branch=e1.getText().toString();
		notice=e2.getText().toString();
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast.makeText(Noticecreate.this, "Soon", Toast.LENGTH_SHORT).show();
				
			}
		});
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(Noticecreate.this,Info.class);
				startActivity(i);
				
			}
		});
		
		
		
		
	}

}
