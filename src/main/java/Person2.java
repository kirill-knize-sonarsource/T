import java.util.Random;

public class Person2 {
  static Random random = new Random();
  static String[] names = {"Joe", "Jane", "Ann", "John"};
  int age;
  String name;
  long timestamp = random.nextLong();

  @Override
  public String toString() {
    return "Person{" +
      "age=" + age +
      ", name='" + name + '\'' +
      ", timestamp=" + timestamp +
      '}';
  }


}
