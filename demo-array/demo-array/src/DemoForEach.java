public class DemoForEach {
  public static void main(String[] args) {
    int[] arr = new int[] {6, -21, 64, 45, 88,100};
    System.out.println("arr.length = " + arr.length);
    for (int i=1; i<arr.length-1; i++){
    System.out.println(arr[i]);
  }//??

  //for each
  // Disadvantage: you can only acces the elemen of the iteration.
  for (int x:arr){
    System.out.println(x);
  }

  String[] arr2 = new String[]{"hello", "xxx","apple"};
  //"abaababbbyabrs"
  //Find out which character appear the most number of times.
  //result:b




  //do-while loop
  //! at least do once
  int x=10;
  do{
    System.out.println("x=" +x);
    x++;
  }while (x<14); //when x<14. loop contineus.
  //x=10
  //x=11
  //x=12
  //x=13


  }
}
