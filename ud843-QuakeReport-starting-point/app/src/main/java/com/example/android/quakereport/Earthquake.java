package com.example.android.quakereport;

/**
 * Created by sherwin on 04/12/2017.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private String mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Date of the earthquake */
    private String mDate;

    /**
     * Construct a new {@link Earthquake} object.
     *
     * @param magnitude
     * @param location
     * @param date
     */

    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     *
     * Return the magnitude of the earthquake.
     */
    public String getMagnitude() { return mMagnitude; }

    /**
     *
     * Return the location of the earthquake.
     */
    public String getLocation() { return mLocation; }

    /**
     *
     * Return the date of the earthquake.
     */
    public String getDate() { return  mDate; }

}
