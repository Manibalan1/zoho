import java.util.List;
public class Billing {
    int billId;
    Customer customer;
    List <Product> products;
    double price;
    int discountAllowed = 0;
    Billing(int billId , Customer customer , List <Product> products)
    {
        this.billId = billId;
        this.customer = customer;
        this.products = products;
    }
    void calculateAmount()
    {
        for(int i=0;i<products.size();i++)
        {
            price = price + products.get(i).price + (products.get(i).gst*products.get(i).price)/100;
        }
        if(price>2000.0)
        {
            discountAllowed = 10;
            price = price - (10.0*price/100.0);
        }
    }
    void getPrice()
    {
        System.out.println("Price "+price);
    }
}