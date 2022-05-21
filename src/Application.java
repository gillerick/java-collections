import java.util.Collection;
import java.util.List;

public class Application {
  public static void main(String[] args) {
    Room cambridge = new Room("Cambridge", "Premier Room", 4, 1750.4);
    Room manchester = new Room("Manchester", "Single Room", 1, 200);
    Room london = new Room("London", "Premier Suite", 2, 10000.5);
    Collection<Room> rooms = List.of(cambridge, manchester, london);

    System.out.println(getPotentialRevenue(rooms));

  }

  private static double getPotentialRevenue(Collection<Room> rooms) {
    return rooms
        .stream()
        .mapToDouble(Room::getRate)
        .sum();
  }
}
