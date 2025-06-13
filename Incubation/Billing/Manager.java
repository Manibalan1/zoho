import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Manager {
    Scanner in = new Scanner(System.in);
    List <Customer> customers;
    List <Product> products;
    static int productId = 0;
    static int customerId = 0;
    void addProduct()
    {
        productId++;
        String productName = in.next();
        double price = in.nextDouble();
        double gst = in.nextDouble();
        Product p = new Product(productId , productName , price , gst);
        products.add(p);
    }
    void addCustomer()
    {
        customerId++;
        String customerName = in.next();
        Customer c = new Customer(customerId , customerName);
        customers.add(c);
    }
    void displayProducts()
    {
        for(int i =0;i<products.size();i++)
        {
            products.get(i).displayDetails();
        }
    }
}