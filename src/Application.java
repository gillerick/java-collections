import java.util.*;

public class Application {
  public static void main(String[] args) {
    Room cambridge = new Room("Cambridge", "Premier Room", 4, 1750.4);
    Room manchester = new Room("Manchester", "Single Room", 1, 200);
    Room london = new Room("London", "Premier Suite", 2, 10000.5);
    Collection<Room> rooms = List.of(cambridge, manchester, london);

    //A good practice is to use the most abstract type possible.
    // This allows you to switch the implementation without any consequences
    Collection<String> favouriteThingsArray = new ArrayList<>();
    favouriteThingsArray.add("Books");
    favouriteThingsArray.add("Bikes");
    favouriteThingsArray.add("Code");
    favouriteThingsArray.add("Books");

    Collection<String> favouriteThingsSet = new HashSet<>(favouriteThingsArray);


    System.out.println(favouriteThingsArray);
    System.out.println(favouriteThingsSet);
    System.out.println(getPotentialRevenue(rooms));

  }

  private static double getPotentialRevenue(Collection<Room> rooms) {
    return rooms
        .stream()
        .mapToDouble(Room::getRate)
        .sum();
  }
}
