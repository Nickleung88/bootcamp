public class DemoCalculation {
  public static void main(String[] args) {
    Integer num1 = Integer.valueOf(127); //create an object of 127
    Integer num2 = Integer.valueOf(127); //within -128
    System.out.println(num1 == num2); //true
    System.out.println(num1.compareTo(num2)); //0


    Integer num3 = Integer.valueOf(128);
    Integer num4 = Integer.valueOf(128);
    System.out.println(num3 == num4); //false
    System.out.println(num3.compareTo(num4)); //0

    // in java, fob object, "==" is to check if they are the same object
    // for number,(byte, short, integer, long), -128 to 127




  }
}
