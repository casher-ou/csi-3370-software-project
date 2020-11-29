package edu.oakland.test.display01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import edu.oakland.helper.admin.Satellite;
import edu.oakland.production.display01.DisplayGpsInterfaceImplementation;

  @DisplayName("Display GPS Interface Unit Tests")
    public class DisplayGpsInterfaceImplementationTests {
      @Test
      @DisplayName("Sending indication that signal is lost...")
      void sendMessageIfSingalLost() {
      Satellite s = new Satellite();
        Random r = new Random();
        int signal = r.nextInt(4);
        s.setStrength(signal);
        DisplayGpsInterfaceImplementation d = new DisplayGpsInterfaceImplementation();
        AssertEquals(d.reportGpsSignalLoss(s),"No Signal");
      }
      @Test
      @DisplayName("Sending signal confirmation")
      void dontSendMessageIfSignalFound() {
        Satellite s = new Satellite();
        Random r = new Random();
        int signal = r.nextInt(6) + 4;
        s.setStrength(signal);
        DisplayGpsInterfaceImplementation d = new DisplayGpsInterfaceImplementation();
        AssertEquals(d.reportGpsSignalLoss(s),"");

      }
      @Test
      @DisplayName("Sending GPS Signal confirmation to reciever")
      void recievedGpsSignal() {
        Satellite s = new Satellite();
        Random r = new Random();
        int signal = r.nextInt(6) + 4;
        s.setStrength(signal);
        DisplayGpsInterfaceImplementation d = new DisplayGpsInterfaceImplementation();
        AssertEquals(d.recieveGpsSignal(s),true);
      }

      @Test
      @DisplayName("Sending Empty GPS Signal to reciever")
      void didNotRevieveGpsSignal() {
        Satellite s = new Satellite();
        Random r = new Random();
        int signal = r.nextInt(4);
        s.setStrength(signal);
        DisplayGpsInterfaceImplementation d = new DisplayGpsInterfaceImplementation();
        AssertEquals(d.recieveGpsSignal(s),false);
      }
      @Test
      @DisplayName("Checking that the reciever identifies a weak signal")
      void foundNoSignal() {
        Satellite s = new Satellite();
        Random r = new Random();
        int signal = r.nextInt(4);
        s.setStrength(signal);
        DisplayGpsInterfaceImplementation d = new DisplayGpsInterfaceImplementation();
        AssertEquals(d.checkSignalStrength(s),signal);
      }
      @Test
      @DisplayName("Checking that the reciever identifies a strong singal")
      void foundStrongSignal(){
        Satellite s = new Satellite();
        Random r = new Random();
        int signal = r.nextInt(6) + 4;
        s.setStrength(signal);
        DisplayGpsInterfaceImplementation d = new DisplayGpsInterfaceImplementation();
        AssertEquals(d.checkSignalStrength(s),signal);
      }
      @Test
      @DisplayName("Checking that the secondary reciever identifies a weak signal")
      void recheckFoundNoSignal(){
        Satellite s = new Satellite();
        Random r = new Random();
        int signal = r.nextInt(4);
        s.setStrength(signal);
        DisplayGpsInterfaceImplementation d = new DisplayGpsInterfaceImplementation();
        AssertEquals(d.recheckSignalStrength(s),signal);
      }
      @Test
      @DisplayName("Checking that the secondary reciever identifies a strong singal")
      void recheckFoundStrongSignal(){
        Satellite s = new Satellite();
        Random r = new Random();
        int signal = r.nextInt(6) + 4;
        s.setStrength(signal);
        DisplayGpsInterfaceImplementation d = new DisplayGpsInterfaceImplementation();
        AssertEquals(d.recheckSignalStrength(s),signal);
      }
    }