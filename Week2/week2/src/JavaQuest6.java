public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 number in Fibonacci Sequence
    // 0 1 1 2 3 5 8 13 21 34 55 89 144 ........

    int count = 0;
    int firstNumber = 0;
    int secondNumber = 1;

    for (int i = 0; i < 500; i++) {
      int thirdNumber = firstNumber + secondNumber;
      System.out.println(thirdNumber + " ");
      firstNumber = secondNumber;
      secondNumber = thirdNumber;
      count++;
      if (count > 15)
        break;
    }
    System.out.println();

    // Aproch 2
    // while loop to print first 15 number in Fibonacci Squence
    count = 15;
    firstNumber = 0;
    secondNumber = 1;
    int i = 0;
    System.out.println();
    System.out.println(firstNumber + " " + secondNumber + " ");
    while (i < 13) {
      int thirdNumber = firstNumber + secondNumber;
      System.out.println(thirdNumber + " ");
      firstNumber = secondNumber;
      secondNumber = thirdNumber;
      i++;
    }

  }
}
