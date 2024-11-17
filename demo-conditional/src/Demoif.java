public class Demoif {
    public static void main(String[] args) throws Exception {
       

        int customerAge=70;
        char customerGender = 'F';

        int baseFee = 100;
        //if Made, 10% charger

        
     String s2 = "heLlo world";
     boolean containW = s2.contains("w");
     boolean lengthlargerthan7 = s2.length()>7;
     boolean isPosition3Uppercase = s2.charAt(2) >= 65 && s2.charAt(2) <= 90;

     if (containW) {System.out.println("Contain w.");}
     if (lengthlargerthan7){System.out.println("*****");}
     
     if (isPosition3Uppercase) {System.out.println("upper case.");}



}
}