package edu.oakland.test.middleware02;

import edu.oakland.helper.admin.LocationDataPoint;
import edu.oakland.helper.admin.TrackData;
import edu.oakland.production.middleware02.MiddlewareCommLinkManager;


public class MiddlewareCommLinkManagerStub implements MiddlewareCommLinkManager{
  public TrackData checkCurrentRfid(int rfid) {
      TrackData tD = new TrackData(new LocationDataPoint[0]);
      tD.setStatusMessage(String.valueOf(rfid));
      System.out.println(tD);
      return tD;

  }
    /*
    stubMethod(rfid) {
  new TrackData()
  trackData.setMessage(rfid)
  return trackData;
}*/
}
