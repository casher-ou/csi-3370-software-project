package edu.oakland.test.middleware02;

import edu.oakland.helper.admin.TrackData;
import edu.oakland.helper.admin.LocationDataPoint;
import edu.oakland.production.middleware02.MiddlewareCommDatabaseInterface;

public class MiddlewareCommDatabaseInterfaceStub implements MiddlewareCommDatabaseInterface {

  public recieveRfid(TrackData rfid) {
    new TrackData();
    trackData.setMessage(rfid);
    return trackData;
}
  
}