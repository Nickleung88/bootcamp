public class ExceciseRevisedwording {
  public static void main(String[] args) {
    String original = "Chan Hei Man";
    String reversed = "";
    // expect output = gnimmargorP
    // charAt()
    // String + char = String

    for (int i=original.length()-1; i>=0; i--){
      char ch = original.charAt(i);
      reversed += ch;

      //round 1: ""+g = g
      //round 2: g+m=gn
      //round 3: gn+i=gni
      //looping
    }
    System.out.println("Original String ="+ original);
    System.out.println("reversed String =" + reversed);


  }
  
}
