import java.util.Scanner;
public class circle {
  private double radius;
  public double getRadius() {
    return radius;
  }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * 3.14 * radius;
    }
}
