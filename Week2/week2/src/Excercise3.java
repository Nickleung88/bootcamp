import java.util.Random;
import java.util.Scanner;

public class Excercise3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int targetNumber = random.nextInt(100)+1;
    int guess = 0;
    int lowerBound = 0;
    int higherBound = 100;


    while(guess != targetNumber){
      System.out.println("Guess a number between " + lowerBound +" and " + higherBound +".");
      guess = scanner.nextInt();

      if (guess>targetNumber){
        System.out.println(guess + " is too high");
      }else if (guess<targetNumber){
        System.out.println(guess + " is too low");
      }else {
        System.out.println(guess +" is target number");
      }
    }
    scanner.close();

  }
}
