package edu.oakland.test.database;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.oakland.helper.admin.LocationDataPoint;
import edu.oakland.production.database.DatabaseGisInterface;
import edu.oakland.production.database.DatabaseGisManagerClass;
import edu.oakland.production.database.DatabasePersistentStorage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Database GisInterface Test")
public class DatabaseGisInterfaceTest {
  
  @Test
  @DisplayName("LDP going in the same LDP coming out")
  void dataPointInIsDataPointOut() {
    DatabaseGisInterface dgi = new DatabaseGisInterface();
    DatabasePersistentStorage dps = new DatabasePersistentStorage();
    LocationDataPoint ldp = new LocationDataPoint();
    ldp = null;
    int i = 0;
    dgi.recieveStoreRequest(ldp);
    assertEquals(ldp, dps.getLocationDataPoint(i));//Using dps because dgm doesn't have a getLDP method
  }

  @Test
  @DisplayName("Putting in the current satellite returns the new satellite")
  void currentSatGetsNextSat() {
    DatabaseGisInterface dgi = new DatabaseGisInterface();
    String currentSat = "GPS01";
    assertEquals("GPS02", dgi.recieveNextSatRequest(currentSat));
  }

  @Test
  @DisplayName("The Mode Requested is the Actual Mode")
  void modeInIsModeOut() {
    DatabaseGisInterface dgi = new DatabaseGisInterface();
    String n = "normal";
    assertEquals(n, dgi.receiveModeRequest(n));//supposed to return a String with the mode
  }
   
  @Test
  @DisplayName("Putting in the current satellite returns the new satellite")
  void currentSatGetsNextSat() {
    DatabaseGisManagerClass dgm = new DatabaseGisManagerClass();
    String currentSat = "GPS01";
    assertEquals("GPS02", dgm.passNextSatRequest(currentSat));
  }

}