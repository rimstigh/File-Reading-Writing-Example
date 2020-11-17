import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {
static ArrayList<Place> places;
static String filename;
static FileReader myFile;

public static void main(String[] args) {
  places = new ArrayList<Place>();
  filename = "populations.txt";
  String place = "", population = "", capital = "";
  try {
    myFile = new FileReader(filename);
    BufferedReader reader = new BufferedReader(myFile);
    while (reader.ready()) {  
      place = reader.readLine();
      population = reader.readLine();
      capital = reader.readLine();
      //System.out.println(place + "\t" + population + "\t" + capital);
      //System.out.printf("%-25s %-20s %-20s %n", place, population, capital);
      Place thePlace = new Place(place, Integer.parseInt(population), capital);
      places.add(thePlace);
    }
    reader.close();
  } catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
  }
  for(int i=0; i<places.size(); i++) {
  System.out.printf("%-25s %-20s %-20s %n", places.get(i).getPlace(), places.get(i).getPopulation(), places.get(i).getCapital());
  }
  //System.out.printf("%-25s %-20s %-20s %n", place, population, capital);
  places.add(new Place("Webb", 1, "Maria"));
  //initializing FileWriter 
  FileWriter toWriteFile; 
  try  { 
    toWriteFile = new FileWriter("test.txt"); 
    // Initialing BufferedWriter 
    BufferedWriter output = new BufferedWriter(toWriteFile); 
    //for(int i=0; i<places.size(); i++) {
    /*output.write(places.get(i).getPlace()); 
    output.newLine();
    output.write(Integer.toString(places.get(i).getPopulation())); 
    output.newLine();
    output.write(places.get(i).getCapital()); 
    output.newLine();
    */
    output.write("Testing");
    output.newLine();
    output.write(Integer.toString(100));
    output.newLine();
    output.flush();
    //}
    // Closing BufferWriter to end operation 
    output.close(); 
  } 
  catch (IOException excpt)  { 
    excpt.printStackTrace(); 
  } 
}
}