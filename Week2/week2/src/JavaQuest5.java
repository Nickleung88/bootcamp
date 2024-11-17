import java.util.Scanner;

public class JavaQuest5 {
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp.";
    char target = 'c';
    int count=0;
    for (int i=0; i<str.length();i++){
      if (str.charAt(i)==target){
        count++;
        }
    }
    if (count>0){
      System.out.println("\nWe found "+count+" charcter c in the string.\n");
    }else{
      System.out.println("\n Not found\n");
    }
    Scanner input = new Scanner(System.in);
    









  }
}
