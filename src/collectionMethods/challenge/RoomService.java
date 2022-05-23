package collectionMethods.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;


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

  public boolean hasRoom(Room room) {
    return this.inventory.contains(room);
  }

  //A lambda is a function that only specifies a parameter and a body (with an arrow token between parameter & body)
  public Collection<Room> getByType(String type) {
    Collection<Room> copy = new HashSet<>(this.inventory);
    copy.removeIf(room -> !room.getType().equals(type));
    return copy;
  }

  public void applyDiscount(final double discount) {
    //Reduces the rate of each room by the provided discount
    this.inventory.forEach(r -> r.setRate(r.getRate() * (1 - discount)));
  }

  public Collection<Room> getRoomsByCapacity(final int requiredCapacity) {
    //Return a new collection of rooms that meet or exceed the provided capacity
    Collection<Room> matches = new HashSet<>(this.inventory);
    for (Room room : inventory) {
      if (room.getCapacity() >= requiredCapacity) {
        matches.add(room);
      }
    }
    return matches;
  }

  public Collection<Room> getRoomByRateAndType(final double rate, final String type) {
    //Returns a new collection of rooms with rate below the provided rate and that match the provided type
    return this.inventory.stream()
        .filter(r -> r.getRate() < rate)
        .filter(r -> r.getType().equals(type))
        .collect(Collectors.toList());

  }
}
