import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillingCounter {
    List <Billing> bills = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    static int billId = 0;
    void createBill(Customer customer , List <Product> products)
    {
        Billing b = new Billing(billId++ , customer , products);
        bills.add(b);
        customer.bills.add(b);
        b.calculateAmount();
    }
}