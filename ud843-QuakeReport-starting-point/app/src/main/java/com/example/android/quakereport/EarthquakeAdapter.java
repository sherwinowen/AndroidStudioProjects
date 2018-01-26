package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sherwin on 04/12/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


        public EarthquakeAdapter (Context context, List<Earthquake> earthquakes) {
            super(context, 0 , earthquakes);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.earthquake_list_item, parent, false);
            }

            // Find the earthquake at the given position in the list of earthquakes
            Earthquake currentEarthquake = getItem(position);

            // Find the TextView with view ID magnitude
            TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
            // Display the magnitude of the current earthquake in that TextView
            magnitudeView.setText(currentEarthquake.getMagnitude());

            // Find the TextView with view ID location
            TextView locationView = (TextView) listItemView.findViewById(R.id.location);
            // Display the location of the current earthquake in that TextView
            locationView.setText(currentEarthquake.getLocation());

            // Find the TextView with view ID location
            TextView dateView = (TextView) listItemView.findViewById(R.id.date);
            // Display the location of the current earthquake in that TextView
            dateView.setText(currentEarthquake.getDate());

            //Return the list item view that is now showing the appropriate data
            return listItemView;
        }
}
