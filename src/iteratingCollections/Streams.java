package iteratingCollections;

import collectionMethods.challenge.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Streams {
  public static void main(String[] args) {

    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room manchester = new Room("Manchester", "Suite", 5, 250.00, true);
    Room piccadilly = new Room("Piccadilly", "Premiere Room", 3, 125.00);

    Collection<Room> rooms = new ArrayList<>(Arrays.asList(manchester, oxford, piccadilly));

    rooms.stream()
        .filter(room -> room.isPetFriendly())
        .forEach(room -> System.out.println(room.getName()));
  }
}
