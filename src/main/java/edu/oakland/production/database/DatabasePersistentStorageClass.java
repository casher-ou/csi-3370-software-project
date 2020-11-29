package edu.oakland.production.database;

import java.time.LocalDateTime;

import edu.oakland.helper.admin.LocationDataPoint;
import edu.oakland.helper.admin.TrackData;


public class DatabasePersistentStorageClass {

  public int locateRfidData() {
	  return 0;
  }

  public LocationDataPoint getLocationDataPoint(int offset) {
	  LocationDataPoint ldp = new LocationDataPoint(0, 0, LocalDateTime.of(
    	      (int) (Math.random() * 50 + 1970),
    	      (int) (Math.random() * 12 + 1),
    	      (int) (Math.random() * 28 + 1),
    	      (int) (Math.random() * 24),
    	      (int) (Math.random() * 60)
    	    ));

	  return null;
  }

  public void storeLocationDataPoint(LocationDataPoint locationDataPoint) {
	  
  }

  public TrackData getTrackData(int offset) {
	  return null;
  }

  public void storeTrackData(TrackData trackData) {
	  
  }

  public String getMode() {
	  return "";
  }

  public void storeMode(String mode) {
	  
  }

  public String getNextSat(String currentSat) {
	  return "";
  }


}
