public class Car{

  public static void main(String[] args) {

  }

  public int drive;

  public void tearDown(){}

  public void drive() {}  // Noncompliant; duplicates field name
}

class MyCar extends Car{
  public void teardown(){}  // Noncompliant; not an override. It it really what's intended?

  public void drivefast(){}

  public void driveFast(){} //Huh?
}
