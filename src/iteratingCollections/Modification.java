package iteratingCollections;

import collectionMethods.challenge.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Modification {
  public static void main(String[] args) {

    Room manchester = new Room("Manchester", "Suite", 5, 250.00, true);
    Room piccadilly = new Room("Piccadilly", "Premiere Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);

    Collection<Room> rooms = new ArrayList<>(Arrays.asList(manchester, piccadilly, oxford));

    //Method 1
    Collection<Room> toRemoveRooms = new ArrayList<>();
    for (Room room: rooms) {
      if (room.isPetFriendly()) {
        toRemoveRooms.add(room);
      }
    }

    rooms.removeAll(toRemoveRooms);

    rooms.forEach(r -> System.out.println(r.getName()));

    //Method 2
    Iterator<Room> iterator = rooms.iterator();
    while (iterator.hasNext()){
      Room room = iterator.next();
      if (room.isPetFriendly()) {
        iterator.remove();
      }
    }
  }
}
