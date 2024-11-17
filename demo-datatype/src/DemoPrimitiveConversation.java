public class DemoPrimitiveConversation {
  public static void main(String[] args) {
    int i = 3;
    double d1 = 9.3;
    System.out.println(i + d1); // 12.3

    // float f1 = 3.4; //3.4 is double value
    // // so , double value cannot be assigned to float type.
    // // !! beuase double is higher leve than float

    float f2 = 3.4f; // 3.4f is a float value
    double d3 = 3.44f;// assigned a lower level type to a higher level type.

    // from lowest to highest
    // byte -> short -> int -> long -> float -> double
    // char -> int -> long -> float -> double

    int i2 = 10;// int value
    long l1 = 10L;// long value
    long l2 = 10; // assign a lower level type vaue to a high level type.

    float f3 = 20L; // ok

    double d4 = 3.4d; // 3.4d -> double value

    double d5 = 3.4; // float f1 = d5;
    // ? Java: not save -> incorrefct syntax
    // not safe -> because d4 may contain a value with high precision.

    // !As a Java developer, you have a right to make it happen (take the risk)
    // Explicit conversation
    float f4 = (float) d5;
    System.out.println(f4);

    int i3 = 32768;
    short s1 = (short) i3; // short max. 32767
    System.out.println("s1=" + s1); // s1=-32768, overflow

    double d6 = 6.7;
    int i5 = (int) d6; // downcasting (take risk)
    System.out.println("i5 :" + i5); // 6, precision loss

    char c1 = 'a';
    int i6 = c1;
    System.out.println(i6); // 97

    int i7 = 97;
    // char c2 = i7; //not ok , downcast

    // value direct assignment
    // Inpliciti conversation ( OK-> from int to lower level)
    // complie-time, real-time check if the value 97 is with the range scope of type
    char c3 = 97;
    byte b1 = 97;
    short s3 = 97;

    // Inpliciti conversation ( NOT OK-> from float to lower levle)
    // int i8 = 1.9f;
    // short s4 = 1.9f;

    short s5 = 32767;
    short s6 = 10;

    // int + short -> int+ int -> int
    int result = (int) s5 + (int) s6;

    System.out.println(result); // 32777

    //!! Short + short => int + int
    //! byte + byte -> 128+1 -> -128 (overflow) -> int
    byte b10 = 127;
    byte b11 = 1;
    byte b12 = (byte) (b10+b11);
    System.out.println(b12); //-128 overflow


    


  }
}
