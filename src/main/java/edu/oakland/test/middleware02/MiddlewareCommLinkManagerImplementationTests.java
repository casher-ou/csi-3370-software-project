package edu.oakland.test.middleware02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.oakland.helper.admin.LocationDataPoint;
import edu.oakland.helper.admin.TrackData;
import java.lang.IllegalArgumentException;
import java.time.LocalDateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import edu.oakland.test.middleware02.MiddlewareCommDatabaseInterfaceStub;


@DisplayName("MiddlewareCommLinkManagerImplementation Unit Tests")
public class MiddlewareCommLinkManagerImplementationTests {
  @Test 
  @DisplayName("Rfid Does Not Match")
  void rfidDoesNotMatchStopsTestCase() {
    int ranRfid = (int)(Math.floor(100000 + Math.random() * 900000));
    MiddlewareCommLinkManager mCommLinkManager = new MiddlewareCommLinkManagerImplementation(new MiddlewareCommDatabaseInterfaceStub());
    assertEquals(ranRfid, mCommLinkManager.requestRfid(String.valueOf(rfid)));
  }

  @Test 
  @DisplayName("Store Request Sent")
  void storeRequestSent() {
      
  }

  @Test 
  @DisplayName("Empty Database Returns Empty Track Data")
  void emptyDatabaseReturnsEmptyTrackData() {
      
  }

  @Test 
  @DisplayName("Partial data Returns Partial Track Data")
  void notEnoughDataReturnsPartialTrackData() {
      
  }

  @Test 
  @DisplayName("Enough Data Returns Full Data")
  void enoughTrackDataReturnsFullData() {
      
  }

  @Test 
  @DisplayName("Comm Database Interface is not Null")
  void commDatabaseInterfaceIsNotNull() {
      assertThrows(IllegalArgumentException.class, () -> {
      new MiddlewareCommDatabaseInterface(null);
    });
  }

  @Test 
  @DisplayName("Gis Manager is Not Null")
  void gisManagerIsNotNull() {
      assertThrows(IllegalArgumentException.class, () -> {
      new MiddlewareGisManager(null);
    });
  }

  @Test 
  @DisplayName("Stored data is Stored data")
  void storedTrackDataCheck() {
      TrackData trackData = new TrackData();

  }
}