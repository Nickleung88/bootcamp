import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    int[] arr = new int[5];

    // index starts from 0
    // ! So, int [5] -> index from 0 to 4
    System.out.println(arr[0]); // 0 -> because int default value 0
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);
    // Bug
    // System.out.println(arr[5]); // java.lang.ArrayIndexOutOfBoundsException.

    // Edit the values
    arr[2] = 99;
    arr[4] = 1;
    System.out.println(arr[2] + arr[4]); // 100

    // Read array by loop
    for (int i = 0; i < arr.length; i++) {// i<5, i=0,1,2,3,4
      System.out.println(arr[i]);
    }
    // 0
    // 0
    // 99
    // 0
    // 1

    // for loop to sum up all value in the int array
    int count = 0;
    for (int i = 0; i < arr.length; i++) {// i<5, i=0,1,2,3,4
      count += arr[i];
    }
    System.out.println("count :" + count);

    arr[1] = 8;
    arr[3] = 14;
    // sum up all even numbers in int array

    int sumEvenNumber = 0;
    for (int i = 0; i < arr.length; i++) {// i<5, i=0,1,2,3,4
      if (arr[i] % 2 == 0) {
        sumEvenNumber += arr[i];
      }
    }
    System.out.println("sumEvenNumber :" + sumEvenNumber);

    // swap
    // exchange the value for the head and tail of the array
    int backup = arr[0];
    arr[0] = arr[arr.length - 1];
    arr[arr.length - 1] = backup;
    System.out.println("backup :" + backup);




//move the head value to the tail
System.out.println("before swap" + Arrays.toString(arr));

for (int i=0; i< arr.length-1;i++){
  backup = arr[i];
  arr[i] = arr[i+1];
  arr[i+1] = backup;
}
System.out.println("after swap" + Arrays.toString(arr)); // 8, 99, 14, 0, 1????




    int max = Integer.MIN_VALUE; // the min value of int
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    System.out.println("max =" + max);


    //creat long array
    long[] arr2 = new long[4]; //0,1,2,3
    arr2[0] = -100;
    arr2[1] = -9;
    arr2[2] = 50;
    arr2[3] = 14;

    // counting
    int count2=0;
for (int i=0; i<arr2.length; i++){
  if (arr2[i]%2==0){
    count2++;
  }
}
System.out.println("count2=" + count2);


    //copy all even number from arr2 to arr3.
    long[] arr3=

    

  }
}
