package com.frisbeeworld.arewethereyet;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AddPlaceActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_place);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_add_place, menu);
        return true;
    }
}
