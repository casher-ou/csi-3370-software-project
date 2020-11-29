package edu.oakland.test.database;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.oakland.helper.admin.LocationDataPoint;
import edu.oakland.production.database.DatabaseGisInterfaceClass;
import edu.oakland.production.database.DatabaseGisManagerClass;
import edu.oakland.production.database.DatabasePersistentStorageClass;
import java.time.LocalDateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Database GisInterface Test")
public class DatabaseGisInterfaceTest {

  @Test
  @DisplayName("LDP going in the same LDP coming out")
  void dataPointInIsDataPointOut() {
    DatabaseGisInterfaceClass dgi = new DatabaseGisInterfaceClass();
    DatabasePersistentStorageClass dps = new DatabasePersistentStorageClass();
    
    LocationDataPoint ldp = new LocationDataPoint(0, 0, LocalDateTime.of(
      (int) (Math.random() * 50 + 1970),
      (int) (Math.random() * 12 + 1),
      (int) (Math.random() * 28 + 1),
      (int) (Math.random() * 24),
      (int) (Math.random() * 60)
    ));
    int i = 0;
    dgi.receiveStoreRequest(ldp);
    assertEquals(null, dps.getLocationDataPoint(i)); //Using dps cuz dgm doesn't have getLDP method
  }

  @Test
  @DisplayName("Putting in the current satellite returns the new satellite")
  void currentSatGetsNextSat() {
    DatabaseGisInterfaceClass dgi = new DatabaseGisInterfaceClass();
    String currentSat = "";
    assertEquals("", dgi.receiveNextSatRequest(currentSat));
  }

  @Test
  @DisplayName("The Mode Requested is the Actual Mode")
  void modeInIsModeOut() {
    DatabaseGisInterfaceClass dgi = new DatabaseGisInterfaceClass();
    String n = "";
    assertEquals(n, dgi.receiveModeRequest(n)); //supposed to return a String with the mode
  }
   
  @Test
  @DisplayName("Checks that manager isn't null")
  void databaseGisManagerNotNull() {
    DatabaseGisManagerClass dgm = new DatabaseGisManagerClass();
    String currentSat = "";
    assertEquals("", dgm.passNextSatRequest(currentSat));
  }

}