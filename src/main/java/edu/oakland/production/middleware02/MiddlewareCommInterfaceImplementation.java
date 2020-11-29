package edu.oakland.production.middleware02;

import edu.oakland.helper.admin.TrackData;
import edu.oakland.production.middleware02.MiddlewareCommInterface;



public class MiddlewareCommInterfaceImplementation implements MiddlewareCommInterface {
  int rfid;
  
  private MiddlewareCommLinkManager middlewareManager;

  public MiddlewareCommInterfaceImplementation(MiddlewareCommLinkManager middlewareManager){
    if(this.middlewareManager == null){
      throw new IllegalArgumentException("middlewareManager cannot be null");
    }
    
    this.middlewareManager = middlewareManager;

  }
  public TrackData requestRfid(int rfid){
    TrackData TD = new TrackData();
    return TD;
  }

} 
