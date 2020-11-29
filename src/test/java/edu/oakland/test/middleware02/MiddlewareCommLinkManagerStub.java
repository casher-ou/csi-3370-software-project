package edu.oakland.test.middleware02;

import edu.oakland.helper.admin.TrackData;
import edu.oakland.production.middleware02.MiddlewareCommLinkManager;

public class MiddlewareCommLinkManagerStub implements MiddlewareCommLinkManager{
    public TrackData checkCurrentRfid(int rfid){
        TrackData TD = new TrackData();
        TD.setStatusMessage(String.valueOf(rfid));
        return TD;

    }
}
