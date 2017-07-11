package com.abirsoni.jim;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Signup extends Activity {
  EditText rn,batch,branch,n,p1,p2;Button b1; ImageButton b2;
  String pa1,pa2,r,bat,bran,Name;int roll;
  SQLiteDatabase db;
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        rn = (EditText) findViewById(R.id.rnum);
        batch = (EditText) findViewById(R.id.batch);
        branch = (EditText) findViewById(R.id.branch);
        n = (EditText) findViewById(R.id.name);
        p1 = (EditText) findViewById(R.id.pass);
        p2 = (EditText) findViewById(R.id.repass);
        b1 = (Button) findViewById(R.id.signup);
        b2 = (ImageButton) findViewById(R.id.infoo);
        pa1 = p1.getText().toString().trim();
        pa2 = p2.getText().toString().trim();


       /* b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(pa1.equals(pa2))
                {
                roll = Integer.parseInt(rn.getText().toString());
                bat = batch.getText().toString();
                Name = n.getText().toString();
                bran = branch.getText().toString();

                final Response.Listener<String>responseListener = new Response.Listener<String>(){
 @Override
                    public void onResponse(String s) {
     try {
         JSONObject jsonResponse = new JSONObject(s);
         boolean success = jsonResponse.getBoolean("success");
         if(success){
             Intent n = new Intent(Signup.this,Sign.class);
             startActivity(n);
         }
         else{
             AlertDialog.Builder builder = new AlertDialog.Builder(Signup.this);
             builder.setMessage("Failed to Register").setNegativeButton("Retry",null).create().show();
         }

     } catch (JSONException e) {
         e.printStackTrace();
     }
 }
  };
    RegisterRequest registerRequest = new RegisterRequest(roll, Name, bat, bran, pa1,responseListener);
    RequestQueue queue = Volley.newRequestQueue(Signup.this);
                    queue.add(registerRequest);

            }}
        });*/


    }
}
