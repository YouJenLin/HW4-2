package com.example.lin.hw5receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.TextView;

public class ActivityNotification extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(ActivityNotification.this);
		tv.setText("Greeting Hello  ");
		setContentView(tv);
	}
}
