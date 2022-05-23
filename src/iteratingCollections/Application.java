package iteratingCollections;

import collectionMethods.challenge.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Application {
  public static void main(String[] args) {

    Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
    Room manchester = new Room("Manchester", "Suite", 5, 250.00);
    Room piccadilly = new Room("Piccadilly", "Premiere Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);

    Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, manchester, piccadilly, oxford));

    //It is important to note that this factory method returns a new instance of an iterator
    Iterator<Room> iterator = rooms.iterator();
    System.out.println(iterator.next().getName()); //Cambridge
    System.out.println(iterator.next().getName()); //Manchester
    System.out.println(iterator.next().getName()); //Piccadilly
    System.out.println(iterator.next().getName()); //Oxford

    //The above example is typically done as shown below
    while(iterator.hasNext()){
      Room room = iterator.next();
      System.out.println(room.getName());
    }

    //Using for loop
    for (Room room: rooms){
      System.out.println(room.getName());
    }
  }
}
