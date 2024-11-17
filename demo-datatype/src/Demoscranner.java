import java.util.Scanner;
//import case 1 , quick fix
//import case 2, command // ctal + shirt + O -> auto import

public class Demoscranner {
 public static void main(String[] args) {
    
 
 Scanner input = new Scanner (System.in);
 System.out.println ("Please input a number: ");
 int number = input.nextInt();
//  System.out.println ("number is.. " + number);

//  if (number>100)
//  System.out.println("number is > 100");
//  System.out.println("number is < 100");
//  System.out.println("number is 100");


switch(number){

case 100:
System.out.println("number is " + 100);
break;

    
case 101:
System.out.println("number is " + number);
break;

case 99:
System.out.println("number is " + number);
break;



}


}
}