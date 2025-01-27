
import java.util.ArrayList;
import java.util.List;

public class VipCustomer {
private Long id;
private List<Order> orders;

public VipCustomers(Long id){
  this.id=id
  this.orders= new ArrayList<>();
}

public vodi AddOrder(Order order){
  this.orders.add(order);

  public List<Order> getOrders(){
    return this.orders;
  }
}
}
