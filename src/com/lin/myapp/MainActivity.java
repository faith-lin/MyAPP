package com.lin.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import com.lin.myapp.constants.Constants;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void callMe(View view){
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText=(EditText) findViewById(R.id.edit_message);
    	String telNumber=editText.getText().toString();
    	intent.putExtra(Constants.EDIT_MESSAGE, telNumber);
    	startActivity(intent);
    }
    
    
}
