/* This is a stub for the Library class */

import java.util.Hashtable;
import java.util.Set;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

  /**
   * Library object constructor
   * @param name
   * @param address
   * @param nFloors
   * @param collection
   */
  public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }
 /**
 * adds a book to the book collection hashtable
 * @param title, library
 */
  public void addTitle(String title){
    this.collection.put(title, true);
  }
 /**
 * removes a book from collection
 * @param title, library
 * @return book title
 */
  public String removeTitle(String title){
    this.collection.remove(title);
    return (title);
  }
 /**
 * checking out a book by changing its availabality to 'false'
 * @param title, library
 */
  public void checkOut(String title){
    if (!this.collection.contains(title)){
      throw new RuntimeException(title+ "isn't in our collection.");}
    this.collection.replace(title, false); // will replace key value
  }
 /**
 * checking in a book by changing its availabality to 'true'
 * @param title, library
 */
  public void returnBook(String title){
    this.collection.replace(title, true);
  }
 /**
  * checks if a book is in the collection
  * @param string title
  * @return boolean: true if the title in the collection
  */
  public boolean containsTitle(String title){
    return this.collection.contains(title);
  }
 /**
 * checks if the status of a book is available
 * @param string title
 * @return boolean: true if book is not checked out
 */
  public boolean isAvailable(String title){
    return this.collection.get(title);
  }
 /**
  * prints collection
  * @param librayr
  * @return set
  */
  public Set printCollection(){
    return this.collection.entrySet();
  }


    public static void main(String[] args) {
      Hashtable<String, Boolean> collection = new Hashtable<String, Boolean>();
      Library neilson = new Library("neilson", "smith", 3, collection );
      neilson.addTitle("Harry Potter");
      System.out.println(neilson.printCollection());
      neilson.checkOut("Harry Potter");
      System.out.println(neilson.printCollection());
    }
  
  }