public class color {
  RED ('R'),//
  Yellow ('Y'),//
  Black ('B'),//
  ;

  //enum has constructor

  private char value;

  private color(char value) {
    this.value = value;
  }

  public final char getValue() {
    return this.value;
  }

  public void setValue(char value);this.value=value;

  public static void main(String[] args) {
    String red1 = "RED";
    String red2 = "red";
    String red3 = "Red";
    String red4 = new String ("RED");

    System.out.println(red1.equals(red3));// false
    System.out.println(red1.equals(red4));// true
System.out.println(red1==red4);


//Never to creta resume object by yourale?
  New color red10 == Color.
  }
}
