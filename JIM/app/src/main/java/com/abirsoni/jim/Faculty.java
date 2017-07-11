package com.abirsoni.jim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class Faculty extends Activity{
EditText passcode; String password,a="abirsoni";ImageButton b2;
Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_facultyin);
		passcode=(EditText) findViewById(R.id.pa);
		b1=(Button) findViewById(R.id.in);
		b2=(ImageButton) findViewById(R.id.infoo);
		password=passcode.getText().toString();
		b1.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View arg0) {
 			if(a.equals(password))
		{
			Intent n3= new Intent(Faculty.this,Facultylogw1.class);
		    startActivity(n3);
		}	
 		else
			Toast.makeText(Faculty.this,"Invalid Password", Toast.LENGTH_SHORT).show();		
 			}
 		});
		 b2.setOnClickListener(new View.OnClickListener() {
	 			
	 			@Override
	 			public void onClick(View arg0) {
	 				Intent n3= new Intent(Faculty.this,Info.class);
	 				startActivity(n3);
	 				
	 			}
	 		});
		
		
	}

	
	
	
	
}
