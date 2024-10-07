public class Demochar {

public static void main (String[] args) {

    String s = "hello";
    String s2 = 

    char c2 ='h';
    System.out.println(c2);//h

    char c = 'a';
    System.out.println(c);// a

    // v = " " ; not support empty

    char r1 = '0';

    // int vs char
    // ! char => int => long => float => double
    char x = 'p';
    System.out.println(x+1);// 113

    char x2 = '0';
    System.out.println(x2+0);// 48

    char x3 = 'a';
    System.out.println(x3+0);// 97

    char x4 = 'A';
    System.out.println(x4+0);// 65

    int i10 = x4+5;
    System.out.println(i10);// 70

    long l8 = x3+9; //char + int -> int+int -> int -> long
    System.out.println(l8);// 106   

    char h = '你';
    System.out.println(h+0);// 20320   

    int y = 40000;
    char h2 = (char)y;
    System.out.println(h2);// 



 
}
}