public class Cat {

  private String name; // Attribute
  private int age;// Attribute

  public String getName() {
    return this.name;
  }

  public void setName(String x) {
    this.name = x;
  }
  public int getAge() {
    return this.age;
  }public void setAge (int age){
    this.age=age;
  }public static void main(String[] args) {
    
Cat c = new Cat();
  c.setName("jwafek");
  c.setAge(10);
  System.out.println(c);

}

}