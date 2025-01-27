public class Cat extends Animal {
  // private int age;
  private String color;
  private String name;

  public Cat() {

  }

  public Cat(int age, String name, String color) {
    super(age);
    this.color = color;
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    Cat c1 = new Cat(8, "MiuMiu", "red");
    Cat c2 = new Cat(3, "Molly", "White");

    System.out.println(c1.getName());
    System.out.println(c1.getAge());
    System.out.println(c1.getColor());

    System.out.println(c2.getName());
    System.out.println(c2.getAge());
    System.out.println(c2.getColor());

  }

}
