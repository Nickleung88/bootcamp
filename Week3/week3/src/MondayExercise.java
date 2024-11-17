import java.util.Arrays;

public class MondayExercise {
  public static void main(String[] args) {
    String inputString = "Progamming";
    char targetChar = 'a'; // char -> ASCII -> int

    int count = 0;

    // objective, indexOf(), while-loop; if-else
    int index = inputString.indexOf(targetChar);// find the index of the input int/char

    while (index != -1) {
      count++;
      index = inputString.indexOf(targetChar, index + 1);
    }
    System.out.println("The charcter " + targetChar + " appears " + count + " times");

    // Exercise 2
    // Print Vowels in a String

    // Objective: Practice for-loop, charAt() , if-else, and String manipulation
    // Task: Write a program that takes a string input from the user
    // and prints all the vowels (a, e, i, o, u) present in the string using a
    // for-loop
    // and if-else. Ensure both uppercase and lowercase
    // vowels are considered.

    // Example: Input string: "Java Programming". Output: a a o a i

    String inpuString2 = "Java Programming";

    for (int i = 0; i < inpuString2.length(); i++) {
      char ch = inpuString2.charAt(i);
      if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
          ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        System.out.println(ch + " ");
      }
    }

    // Apprach 2
    String StringStr = "I am a boy";
    System.out.println(StringStr.substring(2, 4)); // am, because -1

    // Excersie 4

    String inpuString4 = "Java, Python, javascript, typescript";
    char target = 'P';

    // example use charAt()
    for (int i = 0; i < inpuString4.length(); i++) {
      if (inpuString4.charAt(i) == target)
        System.out.println("charAt (): " + i);
    }

    // example use IndexOf(): find the first occur index, can use indexOf())
    System.out.println("IndexOf() : " + inpuString4.indexOf(target));

    // Excecise 6 , nested loop

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print(i * j + " ");
        // i=1; j=1, i=1
        // i=1; j=2, i=>2
        // i=1; j=3, i=>3
        // looping...
      }
      System.out.println();// outside of inner loop
    }

    // exercise 6
    int[] intArr = new int[4]; // 0,1,2,3
    int a = 1;
    int b = 3;
    int c = 5;
    int d = 7;
    intArr[0] = a;
    intArr[1] = b;
    intArr[2] = c;
    intArr[3] = d;

    System.out.println("print Array" + intArr);// [I@31befd9f
    System.out.println("print Array" + Arrays.toString(args)); // import java.till.arrays

    for (int i = 0; i < intArr.length; i++) {// no (), not like string.length()
      System.out.println("looping array :" + intArr[i]);// use for loop to print element
    }

    // String[] strArr = {"el","e2"} ; // not suggested
    String[] arr1 = new String[4];
    String[] arr2 = new String[] { "a", "b", "c", "d" };
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = arr2[i];
    }
    System.out.println("Exercise 7.1" + Arrays.toString(arr1));

  }
}
