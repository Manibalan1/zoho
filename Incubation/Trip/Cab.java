public class Cab {
    int cabId;
    String type;
    double price;
    Cab(int cabId , String type , double price)
    {
        this.cabId = cabId;
        this.type = type;
        this.price = price;
    }
    double getPrice()
    {
        return price;
    }
}