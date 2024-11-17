import java.util.Arrays;

public class demostring {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "apple";

    System.out.println(s1.compareTo(s2)); // 7 -> h - a

    String s3 = "abbbb";
    System.out.println(s3.compareTo(s2)); // -14 -> b-p


    String s9 = "hello world !!!";
    String s10 = s9.replace("o","x");
    System.out.println(s10);  //hellx wxrld !!!

    //Given a String (s9), convert to a target String, which it is an even index & it is a character, make it become BLOCK letter.
    // i.e. "hello world !!!" => HeLlO ........
    // to do
    int temp = 0;
    for(int i=0; i<s9.length();i++){
    }


    // char vs string
    char[] chs=s9.toCharArray();
    System.out.println(Arrays.toString(chs));//[h, e, l, l, o,  , w, o, r, l, d,  , !, !, !]

    //Searching Algorithm
    // -> String + for loop + charAt

    //Revise the String Algorithm
    //String -> toCharArray() -> Char[] -> edit the value in char[] ->String

    // String apple = "apple";
    // char[] ch2 = apple.toCharArray(); // performance??
    // for 
    // not done.

    long [] arr4 = new long[]{10,99, -4, 100};
    long backup2;
    System.out.println("new arr4 :" + Arrays.toString(arr4));

    for (int i=0; i<arr4.length-1;i++) {
      if (arr4[i]>arr4[i+1]){
        backup2
      }
    }






  }
}
