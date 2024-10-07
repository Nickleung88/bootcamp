public class Demointeger {
    
public static void main (String[] args) {

    //byte b1 =3. , shot, int, long
    byte b1 = 3;
    System.out.println (b1);
    // bype is in the range between -128 and 127
    b1 = -128;
    b1 = 127;
    //b1 = -129; // cannot convert from int to byte
    // b1 = 128;

    short s1 = -32768;
    short s2 = 32767;
    //s1 = -32769; out of range 
    //s2 = 32768; out of range

    int i1 = -2_147_483_648;
    int i2 = 2_147_483_647;

    // 2 ^63
    long l1 = Long.MAX_VALUE;
    System.out.println (l1); // 9223372036854775807



    // overflow
    System.out.println (i2+1);//-2147483648
    System.out.println (i1-1);// 2147483647
    System.out.println (b1+1);// b1 -> byte + int -> int + int -> Int -> 128
}

}
