public class Trip {
    int tripId;
    Employee employee;
    Driver driver;
    Cab cab;
    double distance;
    double cost;
    String date;
    Trip(int tripId , Employee employee , Driver driver , Cab cab ,double distance , String date)
    {
        this.tripId = tripId;
        this.employee = employee;
        this.driver = driver;
        this.cab = cab;
        this.distance = distance;
        this.date = date;
    }
    double calculateCost()
    {
        cost = distance*cab.getPrice();
        return cost;
    }
}