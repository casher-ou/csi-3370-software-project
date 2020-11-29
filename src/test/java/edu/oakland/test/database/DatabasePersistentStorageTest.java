package edu.oakland.test.database;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.oakland.helper.admin.LocationDataPoint;
import edu.oakland.production.database.DatabasePersistentStorage;
import edu.oakland.production.database.DatabasePersistentStorageClass;
import java.time.LocalDateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Database PersistentStorage Test")
public class DatabaseGisInterfaceTest {


  @Test
  @DisplayName("RFID data in is RFID data out")
  void rfidDataInIsRfidDataOut() {
    
  }

  @Test
  @DisplayName("offset matches data point")
  void offsetMatchDataPoint() {
    
  }

  @Test
  @DisplayName("Location Data Point In Is Data Point Out")
  void locationDataPointInIsDataPointOut() {
  	/*
    DatabasePersistentStorage dps;
    DatabaseGisManagerStub dgms = new DatabaseGisManagerStub();
    DatabaseGisInterfaceClass dgi = new DatabaseGisInterfaceClass(dgms);
    LocationDataPoint ldp = new LocationDataPoint(0, 0, LocalDateTime.of(
        (int) (Math.random() * 50 + 1970),
        (int) (Math.random() * 12 + 1),
        (int) (Math.random() * 28 + 1),
        (int) (Math.random() * 24),
        (int) (Math.random() * 60)
    ));
    int i = 0;
    dgi.receiveStoreRequest(ldp);
    assertEquals(null, dgms.getLocationDataPoint(i)); //Using dps cuz dgm doesn't have getLDP method
    */
  }

  @Test
  @DisplayName("Offset matches track data")
  void offsetMatchTrackData() {
    
  }

  @Test
  @DisplayName("Offset matches track data")
  void offsetMatchTrackData() {
    
  }

  @Test
  @DisplayName("Track Data In Is Track Data Out")
  void trackDataInIsTrackDataOut() {
    
  }

  @Test
  @DisplayName("read Mode In Is Mode Out")
  void readModeInIsModeOut() {
    
  }

  @Test
  @DisplayName("write Mode In Is Mode Out")
  void writeModeInIsModeOut() {
    
  }

  @Test
  @DisplayName("current Satellite matches next satellite")
  void currentSatMatchNextSat() {
    
  }

  @Test
  @DisplayName("cannot store null location data point")
  void cannotStoreNullLocationDataPoint() {
    
  }

  @Test
  @DisplayName("cannot store null track data")
  void cannotStoreNullTrackData() {
    
  }

  @Test
  @DisplayName("location data point offset out of bounds returns null")
  void locationDataPointOffsetOutOfBoundsReturnsNull() {
    
  }

  @Test
  @DisplayName("track data offset out of bounds returns null")
  void trackDataOffsetOutOfBoundsIsReturnsNull() {
    
  }

  @Test
  @DisplayName("nonexistent satellite name returns empty next")
  void nonexistentSatelliteNameReturnsEmptyNext() {
    
  }

  @Test
  @DisplayName("last satellite name in list returns empty next")
  void lastSatelliteNameInListReturnsEmptyNext() {
    
  }





}



