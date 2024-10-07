public class tryanderror {
    
    public static void main (String[] args){

int i = 5;
int a; // default = 0
a = i++;
// a=i;
// i=i+1;
// a= i -> a = 5
// i++ -> 5 + 1 -> i = 6
System.out.println("using i++");
System.out.println("a = " + a); // 5
System.out.println("i = " + i);// 6 , before line 32
i = 5;
a = ++i;
//i=i+1;
//a=i;
System.out.println("using ++i");
System.out.println("a = " + a);
System.out.println("i = " + i);


System.out.println(i++);
System.out.println(++i);





int A=1;
int B=2;

boolean C = B>A;
boolean D = B<A;

System.out.println (C);
System.out.println (D);

double a1=3.5;
double a2=5.5;
System.out.println (a1*a2);


}
}