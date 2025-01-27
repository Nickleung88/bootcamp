public enum Direction {
 
  EAST(1, "East"),
  SOUTH(2, "South"),
  WEST(-1, "WEST"),
  NORTH(-2, "North"),
;

private int direction;
private String testAttribute;


private Direction (int i, String testAttribute){
  this.direction = i;
  this.testAttribute=testAttribute;
}

public int getDirecton(){
  return this.direction;
}

public String gettestAttribute;

public boolean isOpposite(){


}
  public static void main(String[] args) {
    
  }
}
