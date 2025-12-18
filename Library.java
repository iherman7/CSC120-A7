/* This is a stub for the Library class */

import java.util.ArrayList;
import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements{
  
  /**
  * Attributes
  */
  private Hashtable<String, Boolean> collection;
  
  /**
  * Constructor for Library
  * @param name name of library
  * @param address address of library
  * @param nFloors number of floors in library
  * @return an instance of Library
  */
  public Library(String name, String address, int nfloors) {
    super(name, address, nfloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }
  
  /**
  * Adds a title to the collection
  * @param title to be added to the collection
  */
  public void addTitle(String title){
    this.collection.put(title, true);
  }

  /**
  * Removes a title from the collection
  * @param title to be removed
  * @return title after removing it
  */
  public String removeTitle(String title) {
    this.collection.remove(title);
    return title;
  }

  /**
  * Allows a title to be checked out of the collection by changing its value to false
  * @param title to be checked out
  */
  public void checkOut(String title){
    this.collection.replace(title, false);
  }

  /**
  * Allows a title to be returned to the collection by changing its value to true
  * @param title to be returned
  */
  public void returnBook(String title){
    this.collection.replace(title, true);
  }

  /**
  * Checks if a title is in the collection
  * @param title to be checked
  * @return boolean value
  */
  public boolean containsTitle(String title){
    return(this.collection.contains(title));
  }

  /**
  * Checks if a title is available (if its value is true)
  * @param title to be checked
  * @return boolean value
  */
  public boolean isAvailable(String title){
    return(this.collection.get(title));
  }

  /**
  * Prints the entire collection
  */
  public void printCollection(){
    System.out.println(this.collection.toString());
  }

  /**
  * Main for testing methods
  */
  public static void main(String[] args) {
    Library myLibrary = new Library("Neilson Library", "1 Chapin Way", 4);
    myLibrary.addTitle("CSC 120 by Unknown");
    myLibrary.printCollection();
    myLibrary.checkOut("CSC 120 by Unknown");
    myLibrary.printCollection();
    System.out.println(myLibrary.isAvailable("CSC 120 by Unknown"));
  }
}