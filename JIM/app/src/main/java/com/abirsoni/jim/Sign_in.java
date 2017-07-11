package com.abirsoni.jim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Sign_in extends Activity{
 Button b1; EditText n,p; ImageButton b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signin);
		b1 =(Button) findViewById(R.id.login);
		n =(EditText) findViewById(R.id.rn);
		p =(EditText) findViewById(R.id.password);
		b2=(ImageButton) findViewById(R.id.infoo);

	}
	

}
