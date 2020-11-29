package edu.oakland.test.middleware02;

import edu.oakland.helper.admin.TrackData;
import edu.oakland.production.database.DatabaseCommInterface;

public class DatabaseCommInterfaceStub implements DatabaseCommInterface {
    public int receiveGetRfidRequest(Rfid rfid){
        new TrackData();
    }
}