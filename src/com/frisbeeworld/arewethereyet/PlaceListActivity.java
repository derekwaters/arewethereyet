package com.frisbeeworld.arewethereyet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class PlaceListActivity extends FragmentActivity
        implements PlaceListFragment.Callbacks {

    private boolean mTwoPane;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_list);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        if (findViewById(R.id.place_detail_container) != null) {
            mTwoPane = true;
            ((PlaceListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.place_list))
                    .setActivateOnItemClick(true);
        }
    }

    
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.trip_list_menu, menu);
		return true;
	}

	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
    		case R.id.menu_add_place:
    			Intent addPlaceIntent = new Intent(this, AddPlaceActivity.class);
    			this.startActivity(addPlaceIntent);
    			return true;
    		case R.id.menu_add_trip:
    			Intent addTripIntent = new Intent(this, AddTripActivity.class);
    			this.startActivity(addTripIntent);
    			return true;
    	}
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(Integer id) {
        if (mTwoPane) {
            Bundle arguments = new Bundle();
            arguments.putInt(PlaceDetailFragment.ARG_ITEM_ID, id);
            PlaceDetailFragment fragment = new PlaceDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.place_detail_container, fragment)
                    .commit();

        } else {
            Intent detailIntent = new Intent(this, PlaceDetailActivity.class);
            detailIntent.putExtra(PlaceDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
