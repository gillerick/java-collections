package iteratingCollections;

import collectionMethods.challenge.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Streams {
  public static void main(String[] args) {

    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room manchester = new Room("Manchester", "Suite", 5, 250.00, true);
    Room piccadilly = new Room("Piccadilly", "Premiere Room", 3, 125.00);

    Collection<Room> rooms = new ArrayList<>(Arrays.asList(manchester, oxford, piccadilly));

    rooms.stream()
        .filter(Room::isPetFriendly)
        .forEach(room -> System.out.println(room.getName()));

    //Operation 1: Add all pet friendly rooms to a new collection
    Collection<Room> petFriendlyRooms = new ArrayList<>();
    rooms.stream()
        .filter(Room::isPetFriendly)
        .forEach(petFriendlyRooms::add);

    petFriendlyRooms
        .forEach(r -> System.out.println(r.getName()));

    //Operation 1: Alternative solution
    Collection<Room> petFriendlyRooms2 = rooms.stream()
        .filter(Room::isPetFriendly)
        .collect(Collectors.toList());

    petFriendlyRooms2.stream()
        .map(Room::getName)
        .forEach(System.out::println);

    //Operation 2: Get total revenue
    double total = petFriendlyRooms2.stream()
        .mapToDouble(Room::getRate)
        .sum();

    System.out.printf("Total revenue %s", total);

  }
}
