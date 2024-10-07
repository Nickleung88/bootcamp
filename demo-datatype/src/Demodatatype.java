public class Demodatatype {
    public static void main (String[] args) {

        //I am Nick, 你好. I go to school by bus
        // Yon can dot notes here ...
        
        // data type
        // "int" => integer 整數 (both positive & negative)
        // x -> variable 變量
        // from right to left -> assign value integear 1 to variable x
        int x = 2; 
        int y = 10;

        int a = x + y; // 12

        // Tool: System.out.println()
        // print out
        System.out.println(a);

        // Math Operation: +, -, *, /
        int result = a - y * x;
        System.out.println(result); // -8

        // Math Operation: %
        // remainder
        int remainder = 10 % 3;
        System.out.println(remainder); // 1

        // double (a number with decimal places)
       // Assign an int value to a double variable
       // int value -> double value
       // assign double value to double variable
       
       
        double w = 10.5;
        double w2 = 10;
        // shortcut: sysout
        System.out.println(w); // 10.5;
        System.out.println(w2); // 10.0;
    
        // Naming convention: camel  case
        int englishscore = 70;
        int historyscore = 85;
        int mathScore = 90;

        // averageScore
        // int + int -> int
        // int + double -> double + double -> double

        // !!!!! why 81.0????
        // Step 1:int + int + int -> int
        // Step 2:int / int -> int
        // Step 3: assign int value to double varible

        // 225
        double averageScore = (englishscore + historyscore + mathScore)/ 3.0;
        System.out.println(averageScore); // 81.0

        // Varible
        
        // Re-assignment
        x = 20;
        a = -40;

        // code block: main(String[] args) []
        // ! int x = 9 // we cannot use the same variable name within a code block
        int x2 = 9;

        // how to backup a value?
        int backup = x;
        x = 25;

        // Operations: +=, -=, *=, /=
        int e =9;

        // From right to left
        // 9 +1 => assign to variable 
        e = e + 1;
        System.out.println("e=" +e); // 10
        e += 1;
        System.out.println("e=" +e); // 11
        e = e-1;
        System.out.println("e=" +e); // 10
        e -= 1;
        System.out.println("e=" +e); // 9
        e *= 2;
        System.out.println("e=" +e); // 18
        e /= 3;
        System.out.println("e=" +e); // 6

        // ++
        e++;// incrment by 1
        System.out.println ("e=" + e); // 7

        // --
        e--;// decrment by 1
        System.out.println ("e=" + e); // 6

        // ++
        ++e;// incrment by 1
        System.out.println ("e=" + e); // 7

        // --
        --e;// decrment by 1
        System.out.println ("e=" + e); // 6

        // Declaration
       int u;
       // int default value is 0, but it not for local variable.
       u=8;
       System.out.println (u); // NOT OK, because all local variballe have to be initialized.

       // Literal notation
       Long l7 = 10L;
       float f2 = 10.3f;
       double d2 = 10.3d;

    }
}