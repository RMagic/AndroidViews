package com.rm.androidViews;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.graphics.Color;

public class TestButton extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.button);
		
		final Button Button = (Button)findViewById(R.id.testButton);
		
		final Button changeButton = (Button)findViewById(R.id.layoutButton);
		changeButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v){
				changeOption(Button);
			}
		});
		
		final Button changeButton2 = (Button)findViewById(R.id.textColorButton);
		changeButton2.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v){
				changeOption2(Button);
			}
		});
	}
	
	public void changeOption(Button Button) {
		if (Button.getHeight() == 100) {
			Button.setHeight(30);
		} else {
			Button.setHeight(100);
		}
	}
	
	public void changeOption2(Button Button) {
		Button.setTextColor(Color.RED);
	}

}
