public class Dog extends Animal {
  // private int age;
  private String name;

  // implicitly empty constructor
  public Dog() {
    // super(); // call the parent constructor
  }

  public Dog(int age, String name) {
    // this.age = age;
    super(age); // call the parent constructor
    // ! super() go first
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    // 1. constructor
    // call parent constructor to create Animal object,
    // and then associate the Dog object with the Animal Object
    Dog d1 = new Dog(13, "Sally");
    System.out.println(d1.getAge()); // 13

    // 2. setter
    d1.setAge(10);
    // d1.age; // ERROR, because age is PRIVATE attribute in parent class

    System.out.println(d1.getAge()); // 10

    new Dog();
  }
}