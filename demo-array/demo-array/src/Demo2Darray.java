
import java.util.Arrays;

public class Demo2Darray {

  public static void main(String[] args) {
    int[] arr = new int[] { 2, 100, 1 };

    int[][] arr2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 0, 0, 0 } };

    System.out.println(arr2[1][2]);

    for (int row = 0; row < arr2.length; row++) {
      for (int col = 0; col < arr2[row].length; col++) {
        System.out.println(arr2[row][col]);
      }
    }

    // string[][]

    String[][] strings = new String[][] { { "one", "two", "three" }, { "four", "five", "six" } };
    System.out.println(Arrays.deeptoString.toString(arr));
    System.out.println(Arrays.deeptoString(strings));
  }
}
