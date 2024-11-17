public class Demostring2 {
    public static void main (String[] args) {




    // trim () -> space remove
    String str6 = "    Bootcamp      ";
    System.out.println("before :" + str6.trim());

    //toLowerCase()
    String str9 = "ASJKDHASKJD";
    System.out.println(str9);
    System.out.println("Result of toLowercase:" + str9.toLowerCase());

    String str10 = "AdsDsDsV";
    System.out.println(str10);
    System.out.println("Result of toUppercase:" + str10.toLowerCase().toUpperCase());

    String str11 = "happy";
    String str12 = "new year";
    System.out.println(str11+str12);
    //concat()
    System.out.println("Concat  result =" + str11.concat(str12));
    System.out.println("Concat  result =" + str11.concat(" ").concat(str12));

    //Expect Result :
    //1. VENTUREIXLAB, JAVA
    //2. venturenixlab, java
    //3. V*NTURE*NIXLAB, JAVA!!!

    String str1 ="VenturenixLAB, Coding";
    
    System.out.println(str1.toUpperCase().replace("CODING","JAVA"));     // step 1: toUppercase() first, then replace

    System.out.println(str1.toLowerCase().replace("coding","java"));
    System.out.println(str1.replace("Coding","java").toLowerCase());


    System.out.println(str1.toUpperCase().replace('E', '*').replace("CODING","JAVA").concat("!!!"));



    }
}
