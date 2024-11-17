import java.util.Arrays;

public class App2 {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    for (int i : arr) {
      if (i % 2 == 0)
        System.out.println(i + " is even number");
      continue;
    }
    // 2 is even number
    // 4 is even number
    // 6 is even number
    // 8 is even number

    for (int i : arr) {
      if (i % 2 == 0) {
        System.out.println(i + " is even number");
      } else {
        System.out.println(i + " is odd number");
      }
    }
    // 1 is odd number
    // 2 is even number
    // 3 is odd number
    // 4 is even number
    // 5 is odd number
    // 6 is even number
    // 7 is odd number
    // 8 is even number

    String str = "Java, Python, JavaScript, TypeScript, R, C++, C#";
    String[] strArr = str.split(",");

    for (int i = 0; i < strArr.length / 2; i++) {
      String temp = strArr[i];
      strArr[i] = strArr[strArr.length - 1 - i];
      strArr[strArr.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(strArr));
//[ C#,  C++,  R,  TypeScript,  JavaScript,  Python, Java]
  }
}