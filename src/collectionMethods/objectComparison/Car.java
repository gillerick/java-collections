package collectionMethods.objectComparison;

import java.util.Objects;

public class Car {
  private String make;
  private String model;
  private int mileage;

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (!(object instanceof Car)) return false;
    Car car = (Car) object;
    return getMake().equals(car.getMake()) && getModel().equals(car.getModel());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getMake(), getModel());
  }

  public Car(String make, String model, int mileage) {
    this.make = make;
    this.model = model;
    this.mileage = mileage;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getMileage() {
    return mileage;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage;
  }
}
