package edu.oakland.production.database;

import edu.oakland.helper.admin.LocationDataPoint;
import edu.oakland.production.database.DatabaseGisManagerStub;

public class DatabaseGisInterfaceClass {

  DatabaseGisManagerStub manager;

  public DatabaseGisInterfaceClass(DatabaseGisManagerStub m) {
    manager = m;
  }

  public void receiveStoreRequest(LocationDataPoint locationDataPoint) {

  }

  public String receiveModeRequest(String mode) {
    return "";
  } 

  public String receiveNextSatRequest(String currentSat) {
    return "";
  }

}
