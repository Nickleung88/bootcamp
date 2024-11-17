import java.util.Arrays;

public class Demoarray {
  int[] array = new int[] { 1, 2, 3, 4, 5 };

  public int getLength() {
    return this.array.length;
  }

  public void add(int num) {
    int[] newArr = Arrays.copyOf(this.array, this.array.length + 1);
    newArr[newArr.length - 1] = num;
    array = newArr;
  }

  public void sub(int num) {// 3
    int[] newArr = new int[this.array.length - 1]; //1,2,3,4,5,6
    int found = 0;
    for (int i = 0; i < newArr.length; i++) {
      if (num == this.array[i])
        found = 1;
      newArr[i] = this.array[i+found];
    }
    this.array = newArr; // 2,3,4,5,6
  }

  public static void main(String[] args) {
    Demoarray arr1 = new Demoarray();
    System.out.println(arr1.getLength());
    // example. arr1.getLength()=5;
    arr1.add(6);
    System.out.println(arr1.getLength());
    arr1.sub(1);
    System.out.println(arr1.getLength());
    System.out.println(Arrays.toString(arr1.array));//[2, 3, 4, 5, 6]
  }

}
