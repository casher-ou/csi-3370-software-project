package edu.oakland.production.database;

public class DatabaseCommInterfaceClass {
  
  public DatabaseCommInterfaceClass(DatabaseCommManager databaseCommManager) {
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
    return null; 
  }
  
}
