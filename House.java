/* This is a stub for the House class */

import java.util.ArrayList;
import java.util.Arrays;

public class House extends Building{

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
 /**
 * creates the object 'House' with the following attributes
 * @param string name
 * @param string address
 * @param int nFloors
 * @param boolean hasDiningRoom
 * @param ArrayList residents
 */
  public House(String name, String address, int nFloors, boolean hasDiningRoom, ArrayList<String> residents) {
    super(name, address, nFloors);
    System.out.println("You have built a house: 🏠");
    this.residents = new ArrayList<String>(residents);
    this.hasDiningRoom = hasDiningRoom;
  }

 /**
 * method to check whether the house has a dining room
 * @param house
 * @return boolean: hasDiningRoom
 */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
 /**
 * returns the number of residents
 * @param house
 * @return int: number of residents
 */
  public int nResidents(){
    return this.residents.size();
  }
 /**
 * adds person to the list of residents
 * @param name, house
 */
  public void moveIn(String name){
    if (this.residents.contains(name)){
      throw new RuntimeException(name + "is already a resident");
    }
    this.residents.add(name);
  }

 /**
 * removes person from the list of residents
 * @param name, house
 */
  public String moveOut (String name){
    if (!this.residents.contains(name)){
      throw new RuntimeException(name + "doesn't live here");
    }
    this.residents.remove(name);
    return name;
  }
 /**
  * checks if a person lives in the building
  * @param person, house
  * @return boolean: isResident
  */
  public boolean isResident(String person){
    return (this.residents.contains(person));
  }

  public static void main(String[] args) {
    ArrayList<String> residents = new ArrayList<>(Arrays.asList("Negin", "Maya"));
    House Wilson = new House("Wilson", "Smith college", 3, true, residents);
    Wilson.moveIn("Steph");
    System.out.println(Wilson.isResident("Steph"));
    Wilson.moveOut("Steph");
    System.out.println(Wilson.isResident("Steph"));
  }

}