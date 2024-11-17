import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("print input something");
    String input = scanner.nextLine().trim().toLowerCase();
    boolean palindrome = false;

    for (int i = 0; i<input.length()/2; i++) {
      if (input.charAt(i) == input.charAt(input.length() - i - 1)) {
        palindrome = true;
        break;
      }
    }

    if (!palindrome) {
      System.out.println(input + "is not palindrome");
    } else
      System.out.println(input + "is palindrome");
    scanner.close();
  }
}
