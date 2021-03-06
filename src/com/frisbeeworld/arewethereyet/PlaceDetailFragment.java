package com.frisbeeworld.arewethereyet;

import com.frisbeeworld.arewethereyet.data.TripData;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PlaceDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    TripData.Trip mItem;

    public PlaceDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = TripData.TRIP_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_place_detail, container, false);
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.place_detail)).setText(mItem.toString());
        }
        return rootView;
    }
}
