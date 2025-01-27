

public enum OrderStatus {
  PAID(1),Status_PENDING_FOR_SHIP(2), Status_SHIPPING(3), Status_DELIVERED(4),;

  private final int StatusNumber;

  
private OrderStatus(int StatusNumber){
  this.StatusNumber=StatusNumber;
}

public int getStatusNumber(){
  return this.StatusNumber;
}

public OrderStatus next() {
  for (OrderStatus status: OrderStatus.values()){
    if (status.getStatusNumber() == this.StatusNumber+1)
    return status;
  }
  return this;

}

  public static void main(String[] args) {
    // OrderStatus.PAID.next();

    for (OrderStatus status:OrderStatus.values()){
      System.out.println(status);
      

    }


    //!! ordinal() -> ordering prupose
    System.out.println(OrderStatus.PAID.name());
    System.out.println(OrderStatus.PAID.next().name());
    System.out.println(OrderStatus.Status_SHIPPING.compareTo(OrderStatus.Status_SHIPPING));
    System.out.println(OrderStatus.Status_SHIPPING.compareTo(OrderStatus.Status_DELIVERED));
    System.out.println(OrderStatus.Status_DELIVERED.compareTo(OrderStatus.PAID));


    //Valueof() -> static method
    //  find the enum object, which as the same name you have provided
    System.out.println(OrderStatus.valueOf("PAID").name());

    // Runtime Error
    // System.out.println(OrderStatus.valueOf("PAI").name());

  }

}
