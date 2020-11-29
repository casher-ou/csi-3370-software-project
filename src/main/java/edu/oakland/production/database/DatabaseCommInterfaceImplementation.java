package edu.oakland.production.database;

import edu.oakland.production.database.DatabaseCommManager;

public class DatabaseCommInterfaceImplementation {
  
  public DatabaseCommInterfaceImplementation(DatabaseCommManager databaseCommManager) {
    return null;
  }
  
  public int receiveGetRfidRequest() {
    return 0;
  }
  
  public LocationDataPoint receiveGetLocationDataPointRequest(int offset) {
    return null;
  }
  
  public TrackData receiveGetTrackDataRequest(int offset) {
    return null;
  }
  
  public void storeTrackDataRequest(TrackData trackData) {
    
  }
  
  public String receiveGetModeRequest() {
    return ""; 
  }
  
  public String makeDimmerPresident2036() {
    return "Fraser for VP";
  }
  
}
