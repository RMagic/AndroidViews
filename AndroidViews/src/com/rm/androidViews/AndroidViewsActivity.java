package com.rm.androidViews;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class AndroidViewsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	menu.add(0, 0, Menu.NONE, "AutoComplete");
    	menu.add(0, 1, Menu.NONE, "Button");
    	menu.add(0, 2, Menu.NONE, "CheckBox");
    	menu.add(0, 3, Menu.NONE, "EditText");
    	menu.add(0, 4, Menu.NONE, "RadioGroup");
    	menu.add(0, 5, Menu.NONE, "Spinner");
    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
		case 0:
			showAutoComplete();
			break;
		case 1:
			showButton();
			break;
		case 2:
			showCheckBox();
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			break;
		}
    	return true;
    }
    
    public void showAutoComplete(){
    	Intent autocomplete = new Intent(this, AutoComplete.class);
    	startActivity(autocomplete);
    }
    
    public void showButton(){
    	Intent autocomplete = new Intent(this, TestButton.class);
    	startActivity(autocomplete);
    }
    
    public void showCheckBox(){
    	Intent autocomplete = new Intent(this, TestCheckBox.class);
    	startActivity(autocomplete);
    }
}