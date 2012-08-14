package com.frisbeeworld.arewethereyet;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AddTripActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_trip);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_add_trip, menu);
        return true;
    }
}
