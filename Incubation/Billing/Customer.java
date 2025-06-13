import java.util.List;
public class Customer {
    int customerId;
    String customerName;
    List <Billing> bills;
    Customer(int customerId , String customerName)
    {
        this.customerId = customerId;
        this.customerName = customerName;
    }
}