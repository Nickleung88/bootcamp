import java.util.LinkedList;
import java.util.List;

public class Customer {
 private Long id; 
 private Boolean isVip;
 private List<Order> order;


 public Customer (Long id, Boolean isVip){
  this.id=id;
  this.isVip=isVip;
  this.order = new LinkedList<>();
 }

 public void addOrder (Order order)
  this.order.add(order)

  public boolean isVip(){
    return this.isVip;
  }
 
  public void updateOrder (Long orderID, Double newAmount){
    for ()
  }


 public static void main(String[] args) {
  //create Order Listg with the following orders
  //Create Customer List

  // Customer 1
  // 1. Order (1L, 100.0);
  // 2. Order (2L, 95.0);
  // 3. Order (3L, 20.0);

  // Customer 2
  // 1. Order (4L, 1000.0);
  // 2. Order (5L, 89.0);
  // 3. Order (6L, 5.0);

  // //Stream
  // ..Find the customers with any order amount > 800.0
 }
}
