  
  public class DemoExercise{
  public static void main (String[] args){

    int x = 31;
    int y = 42;
    int z = x+y;
    int a = y-x;
    int b = y*3+4;

    x = 60;
    y = 70;
    int sum2 = x+y;


    String varB = "false";
    String varC = "true";
    double fnumber= 130.2;
    double dnumber= -20.5;

    int reminder1=10;
    int reminder2=3;
    int reminderans1=reminder1/reminder2;
    int reminderans2=reminder1%reminder2;


    


    System.out.println ("the first one : " + x);

    System.out.println ("the second one : " + y);

    System.out.println ("the sum is : " + z);

    System.out.println ("the subtraction is : " + a);

    System.out.println ("the another sum result is : " + b);


    System.out.println ("Wrong : the another sum result is" +x+y); // "60" + "70" -> 6070
    System.out.println ("Right : the another sum result is" +sum2); // 130

    System.out.println ("the another varC is : " + varC);


    System.out.println ("the another varB is : " + varB);

    System.out.println ("the another varC is : " + varC);

    System.out.println ("the variable fnumber is: " + fnumber);

    System.out.println ("the variable dnumber is: " + dnumber);

    System.out.println ("the valuable reminder is: " + reminderans2);

    System.out.println ("the reminder result is: " + reminderans1);


    int b1 = 3100;
    int b2 = 300;

    boolean (b2>b1);
    //AND &&
    //OR ||


    //qutesion: leap year?
    int year1 = 2023; //2020. 2400

    // && || , ||要先乘除後加減
    if(( year1%100!=0 || year1%400!=0) && year1%4==0 ){
    System.out.println (year1+" is leap year");
    }else {System.out.println (year1+" is not leap year");}







        


    
  }
    


}