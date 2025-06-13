public class Product {
    int productId;
    String productName;
    double price;
    double gst;
    Product(int productId , String productName , double price , double gst)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.gst = gst;
    }
    void displayDetails()
    {
        System.out.println(productId);
        System.out.println(productName);
        System.out.println(price);
        System.out.println(gst);
    }
}
