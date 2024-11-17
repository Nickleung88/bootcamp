public class Demooperator {
    
public static void main (String[] args) {
// "!=" => not equal to
    boolean result = 3 !=2 ; //3!=2 is a statement
    System.out.println(result); //true

    // "==" -> check if equals to
    // "=" -> assignment
    boolean result2 =3 == 2;
    System.out.println(result2); //false

    // ||OR, && AND
    // event A or event B
    // event A and event B
    boolean eventA = 3<2; //false
    boolean eventB = 10%2 ==0; // true

    boolean combine = eventA && eventB;
    System.out.println(combine) ; // true

    boolean - eventA || eventB;
    System.out.println(combine); //true

    System.out.println (3 < 2 || 10%2==0); // True

    // !eventA -> opposite of eventA
    System.out.println(!eventA); // True

    









}
}
