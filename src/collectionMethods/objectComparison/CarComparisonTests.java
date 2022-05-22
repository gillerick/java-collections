package collectionMethods.objectComparison;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarComparisonTests {
  Collection<Car> cars;
  Car subaru, mercedes, mazda;

  @BeforeEach
  public void setUp() throws Exception {
//  System.out.format("%nPerforming %s%n", info.getTestMethod().get().getName());

    this.cars = new ArrayList<>();
    this.subaru = new Car("Subaru", "Levorg", 78000);
    this.mercedes = new Car("Mercedes", "C200", 80000);
    this.mazda = new Car("Mazda", "Atenza", 104000);

    this.cars.addAll(Arrays.asList(subaru, this.mercedes, this.mazda));
  }

  @AfterEach
  public void tearDown() throws Exception {
    System.out.format("%nResult%n");

    this.cars.stream();
  }

  @Test
  public void removeTest() {
    this.cars.remove(mercedes);
    this.cars.remove(new Car("Mercedes", "C200", 80000));

    assertEquals(1, this.cars.size());
  }

  @Test
  public void containsTest() {
    assertTrue(this.cars.contains(new Car("Subaru", "Levorg", 78000)));
    assertTrue(this.cars.contains(mercedes));
    assertTrue(this.cars.contains(mazda));
  }

  @Test
  public void removeAllIdentityTest() {
    this.cars.removeAll(Arrays.asList(
        this.subaru,
        this.mercedes,
        new Car("Mazda", "Atenza", 104000)
    ));

    assertTrue(this.cars.isEmpty());
  }
}