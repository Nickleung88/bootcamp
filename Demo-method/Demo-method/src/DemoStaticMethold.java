public class DemoStaticMethold {
  public static void main(String[] args) {

    int result=sum(3,2);
    System.out.println(result);


    System.out.println(rectengaleArea(9, 3));

    System.out.println(findMax(new int [] {12, 123,412}));
    

      }

  public static int sum(int a, int b){
    return a+b;
  }

  public static int rectengaleArea(int length, int width){
    return length * width;
  }
  public static int findMax(int[] arr){
    int max=Integer.MIN_VALUE; //-21xxxxx
    for (int i=0; i<arr.length; i++){
      if (arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }


}
