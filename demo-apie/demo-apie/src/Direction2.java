public enum Direction2 {
  EAST(1),
  SOUTH(2),
  WEST(-1),
  NORTH(-2),
  ;

  private int value;
  private String testAttribute;
  

  private Direction2(int value) {
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }
  
  
public boolean Opposite(Direction2 value){
return this.value * (-1) == Direction2.getValue();
}

  public static void main(String[] args) {
    System.out.println(Direction2.WEST.Opposite(Direction2.EAST));
    
  }
}
