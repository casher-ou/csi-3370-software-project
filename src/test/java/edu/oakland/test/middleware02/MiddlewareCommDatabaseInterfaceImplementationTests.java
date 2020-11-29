package edu.oakland.test.middleware02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.oakland.production.database.DatabaseCommInterface;
import edu.oakland.production.middleware02.MiddlewareCommDatabaseInterface;

@DisplayName("MiddlewareCommDatabaseInterfaceImplementation Unit Tests")
public class MiddlewareCommDatabaseInterfaceImplementationTests {
    
    @Test
    @DisplayName("rfid In Is rfid Out")
    void rfidInIsRfidOut(){
        System.out.println("This is first test case");
        int ranRfid = (int)(Math.floor(100000 + Math.random() * 900000));
        MiddlewareCommDatabaseInterface Rfid = new MiddlewareCommDatabaseInterfaceImplementation(){
			@Override
			public int checkCurrentRfid() {
				// TODO Auto-generated method stub
				return 0;
			}
        };
    }

    @Test
    @DisplayName("MiddleWareCommDatabaseInterface is not null")
    void interfaceIsNotNull(){
        assertThrows(IllegalArgumentException.class, ()->{new MiddlewareCommDatabaseInterfaceImplementation(null);
        });
    }

    @Test
    @DisplayName("dataBaseCommInterface is not null")
    void databaseCommInterfaceIsNotNull() {
        assertThrows(IllegalArgumentException.class, () -> {new MiddlewareCommDatabaseInterfaceImplementation(null);
    });
    }
}
