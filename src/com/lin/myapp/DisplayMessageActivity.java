package com.lin.myapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.lin.myapp.constants.Constants;

public class DisplayMessageActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent=getIntent();
		String telnum=intent.getExtras().getString(Constants.EDIT_MESSAGE);
		TextView newView=new TextView(this);
		newView.setTextSize(50f);
		newView.setText(telnum);
		setContentView(newView);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater menuImflater=this.getMenuInflater();
		menuImflater.inflate(R.menu.main_activity_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	 @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        case R.id.action_search:
            //openSearch();
            return true;
        case R.id.action_settings:
            //openSettings();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
