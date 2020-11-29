package edu.oakland.helper.database;
import java.util.Scanner;
import org.json.JSONArray;

public class PersistentStorageManager {

  private String DB_FILE_NAME = "database.json";

  public DatabasePersistentStorage readPersistentData() {
    return null;
  }

  public void writePersistentData() {
  
  } 

  public DatabasePersistentStorageImplementation deserializeData(String data) {
    return null;
  }

  public String serializeData(DatabasePersistentStorageImplementation data) {
    return "";
  }

  private boolean inputFileExists() {
    return false;
  }

  private boolean outputFileExists() {
    return false;
  }

  private void createInputFile() {

  }

  private void createOutputFile() {

  }

  private String readInputFile() {
    try{

      File file = new File(DB_FILE_NAME);
      String content = new Scanner(file).useDelimiter("\\Z").next();
      return content;

    }catch (FileNotFoundException ex) {
      // File not found.
      return "";
    }
  }

  private void writeOutputFile() {

  }


}