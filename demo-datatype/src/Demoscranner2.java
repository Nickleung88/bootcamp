import java.util.Scanner;
//import case 1 , quick fix
//import case 2, command // ctal + shirt + O -> auto import

public class Demoscranner2 {
 public static void main(String[] args) {
    
 
 Scanner input = new Scanner (System.in);
 System.out.println ("Please input a number: ");
 int number = input.nextInt();

 boolean isAdult = number >= 18;

 if (isAdult)
 System.out.println(isAdult);
 else
 System.out.println("is not audit");


}


}
