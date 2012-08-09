package com.frisbeeworld.arewethereyet.data;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripData {
	
	public enum PlaceType {
		Toilets,
		Eatery,
		Accommodation,
		Attraction
	}
	
    public static class Trip {

        public Integer id;
        public String label;
        public String source;
        public String destination;
        public List<PlaceType>	placeTypes;
        public Date createdOn;

        public Trip(Integer id, String label, String source, String destination, Date createdOn) {
            this.id = id;
            this.label = label;
            this.source = source;
            this.destination = destination;
            this.createdOn = createdOn;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    public static List<Trip> TRIPS = new ArrayList<Trip>();
    public static Map<Integer, Trip> TRIP_MAP = new HashMap<Integer, Trip>();

    static {
        addItem(new Trip(1, "Summer Holidays", "Melbourne", "Currarong", new Date()));
        addItem(new Trip(2, "Grampians Side Trip", "Melbourne", "Hall's Gap", new Date()));
        addItem(new Trip(3, "Grampians Side Trip", "Hall's Gap", "Naracoorte", new Date()));
    }

    private static void addItem(Trip item) {
        TRIPS.add(item);
        TRIP_MAP.put(item.id, item);
    }
}
