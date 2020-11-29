package edu.oakland.production.database;

import edu.oakland.helper.admin.LocationDataPoint;
import edu.oakland.helper.admin.TrackData;


public class DatabasePersistentStorageClass {

  LocationDataPoint ldp;
  TrackData td; 
  String storedMode;

  public int locateRfidData(){
  	return 0;
  }

  public LocationDataPoint getLocationDataPoint(int offset) {
  	return null;
  }

  public void storeLocationDataPoint(LocationDataPoint locationDataPoint) {
    ldp = locationDataPoint;
  }

  public TrackData getTrackData(int offset) {
  	return null;
  }

  public void storeTrackData(TrackData trackData) {
  	td = trackData;
  }

  public String getMode() {
  	return "";
  }

  public void storeMode(String mode) {
    storedMode = mode;
  }

  public String getNextSat(String currentSat) {
  	return "";
  }


}

