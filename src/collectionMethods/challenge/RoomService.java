package collectionMethods.challenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class RoomService {

  //1. Declare a collection to store Room Inventory
  Collection<Room> rooms = new ArrayList<>();

  public RoomService() {
    //2. Initialize Collection and assign it to the Room Inventory
    Room cambridge = new Room("Cambridge", "Premier Room", 4, 1750.4);
    Room manchester = new Room("Manchester", "Single Room", 1, 200);
    Room london = new Room("London", "Premier Suite", 2, 10000.5);
    rooms.addAll(Arrays.asList(cambridge, manchester, london));
  }

  public Collection<Room> getInventory() {
    //3. Return the Room Inventory
    return rooms;
  }

  public void createRoom(String name, String type, int capacity, double rate) {
    //4. Add a new Room to the Room Inventory using the provided parameters
    rooms.add(new Room(name, type, capacity, rate));
  }

  public void createRooms(Room[] newRooms){
    rooms.addAll(Arrays.asList(newRooms));
  }

  public void removeRoom(Room room){
    rooms.remove(room);
  }
}
