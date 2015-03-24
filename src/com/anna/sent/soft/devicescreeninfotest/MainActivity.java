package com.anna.sent.soft.devicescreeninfotest;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.anna.sent.soft.utils.DisplayUtils;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		StringBuilder sb = new StringBuilder();
		Point sizeInDp = DisplayUtils.getScreenSizeInDpWrapped(this);
		Point sizeInPx = DisplayUtils.getScreenSizeInPx(this);
		sb.append("Width in dp = ").append(sizeInDp.x).append("\n");
		sb.append("Height in dp = ").append(sizeInDp.y).append("\n");
		sb.append("Width in px = ").append(sizeInPx.x).append("\n");
		sb.append("Height in px = ").append(sizeInPx.y).append("\n");

		TextView tv = (TextView) findViewById(R.id.textView);
		tv.setText(sb.toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}