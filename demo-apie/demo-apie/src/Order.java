public class Order {

  private int orderStatus;

  public Order (int orderStatus){
    this.orderStatus = orderStatus;
  }

  public void setOrderStatus (int orderStatus){ //Big Problem !!
    this.orderStatus = orderStatus;
  }


  public static final int Status_PAID=1;
  public static final int Status_PENDING_FOR_SHIP=1;
  public static final int Status_SHIPPING=1;
  public static final int Status_DELIVERED=1;

  public void nextStatus(){
    this.orderStatus++;
  }
  

  public static void main(String[] args) {
    Order order1 = new Order(Status_PAID);
    
    order1.setOrderStatus(Status_PENDING_FOR_SHIP); // ! 1 -> 3 ??

    order1.setOrderStatus(100);
  }
}
