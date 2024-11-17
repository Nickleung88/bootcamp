public class Demostring { // class name = file name
    public static void main (String[] args){
           // Integer decimal place


           // email address
           // leungchinglik@gmail.com is string value
           // emailaddress is a string variable
           String emailAddress = "leungchinglik@gmail.com";
           System.out.println(emailAddress) ; // leungchinglik@gmail.com

           // NOt OK
           // Because 2 is an int value, we cannot assign int value to String variable.
           // String x = 2;

           // String Operation: + 
           String x1 = "hello";
           String x2 = "world";
           String x3 = x1 + x2;
           System.out.println("x3=" + x3 +", x1=" + x1);
            // "x3=helloworld, x1=hello, x2=world"

            boolean result = x1.equals("hello");
            System.out.println (result); //true

            boolean result2 = x1.equals("hello!");
            System.out.println (result2); // false

            //! length()
    
            int len = x1.length();
            System.out.println(len);//5

            // ! charAt (index)
            // index starts from 0 to length -1
            System.out.println (x1.charAt(4)); //0
            System.out.println (x1.charAt(0)); //h
            System.out.println (x1.charAt(x1.length()-1)); //0


            //equals()
            boolean result = "hello".equals(x1);


            int age = 60;
            String sentence = "I am at age " + age; //String + int = String
            System.out.println (sentence); 


            // ! toUpperCase()
            System.out.println(x1.toUpperCase()); //' HELLO
            System.out.println("Hello".toLowerCase()); //' hello

            //Chain Method
            System.out.println("Peter".toLowerCase().length()); //5
            System.out.println("Peter".toLowerCase().length()>4); //true


            // ! concat()
            System.out.println("Nick".concat("Leung")); // NickLeung
            String fullName = "Nick" + "Leung";
            System.out.println(fullName);

            String email = "nickleung@gmail.com";
            System.out.println(email.contains("gmail"));//True



    }
    
}