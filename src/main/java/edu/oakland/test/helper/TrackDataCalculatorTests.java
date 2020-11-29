package edu.oakland.test.helper.middleware02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.oakland.helper.admin.LocationDataPoint;
import edu.oakland.helper.admin.TrackData;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//Speed = (TL / 4) * 20 kts = 2/4 = 14.14 kts
//TL = SQRT[Y^2 + X^2]
//TL = 2.828


@DisplayName("TrackDataCalculator Unit Tests")
public class TrackDataCalculatorTests {
  @Test 
  @DisplayName("Calculate speed Test")
  void calculateSpeedTest() {
    float trackLength;
    int deltaX = 4;
    int deltaY = 4;
    float speed;
    float expectedSpeed = 14.14;
    trackLength = Math.sqrt((deltaX*deltaX) + (deltaY*deltaY));

    speed = (trackLength / 4) * 20;

    assertEquals(expectedSpeed, speed);
    
  }

}

