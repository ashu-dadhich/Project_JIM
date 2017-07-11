package com.abirsoni.jim;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Query extends Activity {
	
	EditText e1,e2; Button b1; String subject,query;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_query);
		e1 = (EditText) findViewById(R.id.sub);
		e2 = (EditText) findViewById(R.id.query);
		b1 = (Button) findViewById(R.id.submit);
		subject = e1.getText().toString();
		query = e2.getText().toString();
		//yaha fir query table pr upload krge
		
		
	}
	

}
