package com.frisbeeworld.arewethereyet.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripData {

    public static class Trip {

        public String id;
        public String content;

        public Trip(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public static List<Trip> ITEMS = new ArrayList<Trip>();
    public static Map<String, Trip> ITEM_MAP = new HashMap<String, Trip>();

    static {
        addItem(new Trip("1", "Item 1"));
        addItem(new Trip("2", "Item 2"));
        addItem(new Trip("3", "Item 3"));
    }

    private static void addItem(Trip item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
}
