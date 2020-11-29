package edu.oakland.test.middleware02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.oakland.production.middleware02.MiddlewareCommInterface;
import edu.oakland.production.middleware02.MiddlewareCommInterfaceImplementation;
import edu.oakland.test.middleware02.MiddlewareCommLinkManagerStub;
import edu.oakland.production.middleware02.MiddlewareCommLinkManager;
import edu.oakland.helper.admin.TrackData;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("MiddlewareCommInterfaceImplementation Unit Tests")
public class MiddlewareCommInterfaceImplementationTests {
    
  @Test
  @DisplayName("Rfid In Is the same Rfid Out")
    void rfidInIsRfIdOut() {
    int ranRfid = (int)(Math.floor(100000 + Math.random() * 900000));
    MiddlewareCommInterface mid02Interface = new MiddlewareCommInterfaceImplementation(new MiddlewareCommLinkManagerStub());
    System.out.println(ranRfid);
    //System.out.println(Rfid);
    assertEquals(ranRfid, mid02Interface.requestRfid(ranRfid));

  }

  @Test 
  @DisplayName("Verifies if middlewareManager is set to Null")
  void nullCheck(){
    assertThrows(IllegalArgumentException.class, () -> {
      new MiddlewareCommInterfaceImplementation(null);
    });
  }
}
