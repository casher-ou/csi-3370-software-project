package edu.oakland.production.display01;

import edu.oakland.helper.admin.Satellite;

public class DisplayGpsInterfaceImplementation implements DisplayGpsInterface {

  public boolean receiveGpsSignal(Satellite satelliteSignal) {
    if (satelliteSignal.getStrength() > 4) {
      return true;
    } else {
      return false;
    }
  }

  public String reportGpsSignalLoss(Satellite satelliteSignal) {
    if (satelliteSignal.getStrength() > 4) {
      return "";
    } else {
      return "No Signal";
    }
  }

  public int recheckSignalStrength(Satellite satelliteSignal) {
    return satelliteSignal.getStrength();
  }

  public int checkSignalStrength(Satellite satelliteSignal) {
    return satelliteSignal.getStrength();
  }

} 
