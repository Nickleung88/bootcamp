import java.util.Scanner;

public class Demoif {
    public static void main(String[] args) {
        
        String gender3 = "M";
        String gender4 = "MC";

        int age = 18;
        boolean isAdult = age >= 18;
        System.out.println("isAdult:" + isAdult);

        // == only use for primitive -> byte, short, int, long, float, double, boolean, char

        String str1 = new String ("");
        String str2 = new String ("");
        
        String str5 = "happy";
        String str6 = "happy";
        String str7 = "new";
        String str8 = "year";
        System.out.println("case 5:" + str5.compareTo(str5)); // +, -, 0      
        System.out.println("case 7:" + str5.compareTo(str7)); //-6

        //ASCII
        System.out.println((char)48);
        System.out.println((char)65);
        System.out.println((char)97);

        //substring(int beginIndex)
        //substring(Int beginIndex, endIndex)
        String str9="Diamond Hill";
        System.out.println("case 1: " + str9.substring(5)); //output: nd HIll
        System.out.println("case 2: " + str9.substring(3,10)); //output: mond Hi => end Index-1

        //Chain method
        System.out.println("Case 3:" + str9.substring(3,10).equals("mond"));
        System.out.println("Case 3:" + str9.substring(3,10).equals("mond Hi"));
        System.out.println();
   

        String Str9= "Diamond hill";
        //startswith (String prefix, int toffset)
     
        System.out.println("startswith case 2:"+str9.startsWith("D"));
        System.out.println("startswith case 1:"+str9.startsWith("D",0)); // True
        System.out.println("startswith case 1:"+str9.startsWith("D",1)); // false

        //endswith
        System.out.println("endswith case 1:"+str9.endsWith("D")); 
        System.out.println("endswith case 1:"+str9.endsWith("l")); 


        //Condition
        char (grade) = 'B';

        switch (grade) 

     


        

         {



        }
    }
}
