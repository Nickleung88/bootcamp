public class Demoswitch2 {
  public static void main(String[] args) {
    
  //Normal Example

  int dayOfWeek = 4; //1-7
  String Dayname = "Monday";
  switch (dayOfWeek) {  // !! No range checking
  
    case 1:
    Dayname="Monday";
    System.out.println("Case1");
    break;

    case 3:
    Dayname="Wednesday";
    System.out.println("Case3");
    break;

    case 4:
    Dayname="Thursday";
    System.out.println("Case4");
    break;
    
  

}
 } 
}
