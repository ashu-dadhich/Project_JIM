package com.abirsoni.jim;

import java.util.Locale;
import java.lang.*;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Newsign extends Activity {
EditText rn,batch,branch,n,p1,p2;Button b1; ImageButton b2;
	  String pa1,pa2,r,bat,bran,Name;int roll;
	  SQLiteDatabase db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		
		rn=(EditText) findViewById(R.id.rnum);
		batch=(EditText) findViewById(R.id.batch);
		branch=(EditText) findViewById(R.id.branch);
		n=(EditText) findViewById(R.id.name);
		p1=(EditText) findViewById(R.id.pass);
	    p2 =(EditText) findViewById(R.id.repass);
		b1=(Button) findViewById(R.id.signup);
		b2=(ImageButton) findViewById(R.id.infoo);
		
		
		
		pa1 =p1.getText().toString();
		pa2 =p2.getText().toString();
		r=rn.getText().toString();
		
		bat  =(batch.getText().toString()).toUpperCase(Locale.US);	
		Name = (n.getText().toString()).toUpperCase(Locale.US);
		bran =(branch.getText().toString()).toUpperCase(Locale.US);
        
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(r.trim().length() != 6||
			       bat.trim().length()==0||Name.trim().length()==0||
			    		   bran.trim().length()==0|| !(pa1.equals(pa2)))
			    		{
			    		Toast.makeText(Newsign.this, "Error! Please Check your inputs", Toast.LENGTH_SHORT).show();	
			    			return;
			    		}
				else
				{
				
				Toast.makeText(Newsign.this, "You have been registered", Toast.LENGTH_SHORT).show();	
				
				rn.setText("");
				batch.setText("");
				branch.setText("");
				n.setText("");
				p1.setText("");
				p2.setText("");
		}}}
        );
            b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Class ne;
				try {
					ne = Class.forName("com.abirsoni.jim.Info");
					Intent n = new Intent(Newsign.this,ne);
					startActivity(n);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
			}}
        );
		}
	
	
	
	
	  
	
	
	
}
