/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {

  /**
  * Attributes
  */
  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  /**
  * Constructor for House
  * @param hasDiningRoom boolean value
  * @return an instance of House
  */
  public House(boolean hasDiningRoom) {
    super("Cushing House", "1 Mandelle Road", 4);
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
  * Accessor for hasDiningRoom
  * @return this.hasDiningRoom boolean value 
  */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /**
  * Accessor for nResidents
  * @return this.residents amount of residents in the arraylist
  */
  public int nResidents(){
    return this.residents.size();
  }

  /**
  * Allows a student to move in to a house, unless they already live in the house
  * @param s the student moving in
  * @throws RuntimeException if the student already lives in the house
  */
  public void moveIn(Student s){
    if (this.residents.contains(s)){
      throw new RuntimeException("Student already lives in this house.");
    } else {
      this.residents.add(s);
    }
  }

  /**
  * Allows a student to move out of a house, unless they do not already live in the house
  * @param s the student moving out
  * @throws RuntimeException if the student does not live in the house
  */
  public Student moveOut(Student s){
    if (this.residents.contains(s)){
      this.residents.remove(s);
      return s;
    } else {
      throw new RuntimeException("Student does not live in this house.");
    }
  }

  /**
  * Checks if Student s lives in the house
  * @param s the student 
  * @return boolean value 
  */
  public boolean isResident(Student s){
    if (this.residents.contains(s)){
      return true;
    } else {
      return false;
    }
  }

  /**
  * Main for testing methods
  */
  public static void main(String[] args) {
    Student myStudent = new Student("Ingrid Herman", "12345678", 2028);
    House myHouse = new House(false);
    myHouse.moveIn(myStudent);
    System.out.println(myHouse.isResident(myStudent));
  }

}