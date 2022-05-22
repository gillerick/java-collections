package collectionMethods.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class RoomService {

  //1. Declare a collection to store Room Inventory
  Collection<Room> inventory = new ArrayList<>();

  public RoomService() {
    //2. Initialize Collection and assign it to the Room Inventory
    Room cambridge = new Room("Cambridge", "Premier Room", 4, 1750.4);
    Room manchester = new Room("Manchester", "Single Room", 1, 200);
    Room london = new Room("London", "Premier Suite", 2, 10000.5);
    inventory.addAll(Arrays.asList(cambridge, manchester, london));
  }

  public Collection<Room> getInventory() {
    //Using a conversion constructor here protects our inventory from modification given collections are mutable
    return new ArrayList<>(this.inventory);
  }

  public void createRoom(String name, String type, int capacity, double rate) {
    //4. Add a new Room to the Room Inventory using the provided parameters
    this.inventory.add(new Room(name, type, capacity, rate));
  }

  public void createRooms(Room[] rooms) {
    this.inventory.addAll(Arrays.asList(rooms));
  }

  public void removeRoom(Room room) {
    this.inventory.remove(room);
  }
}
