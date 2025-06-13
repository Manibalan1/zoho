import java.util.ArrayList;
import java.util.List;
public class ReportManager {
    List <Trip> trips = new ArrayList<>();
    List <Employee> employees = new ArrayList<>();
    List <Driver> drivers = new ArrayList<>();
    List <Cab> cabs = new ArrayList<>();
    static int employeeId = 1;
    static int driverId = 1;
    static int cabId = 1;
    static int tripId = 1;
    void createEmployee(String name , String designation)
    {
        Employee employee = new Employee(employeeId , name , designation);
        employees.add(employee);
        employeeId++;
    }
    void createDriver(String name)
    {
        Driver driver = new Driver(driverId , name);
        drivers.add(driver);
        driverId++;
    }
    void createCab(String type , double price)
    {
        Cab cab = new Cab(cabId , type , price);
        cabs.add(cab);
        cabId++;
    }
    void createTrip(int employeeId , int driverId , int cabId , double distance , String date)
    {
        Employee employee = getEmployee(employeeId);
        Driver driver = getDriver(driverId);
        Cab cab = getCab(cabId);

        Trip trip = new Trip(tripId,employee,driver,cab,distance,date);
        trips.add(trip);
        tripId++;
    }
    Employee getEmployee(int employeeId)
    {
        for(int i=0;i<employees.size();i++)
        {
            if(employeeId==employees.get(i).employeeId)
            {
                return employees.get(i);
            }
        }
        return null;
    }
    Driver getDriver(int driverId)
    {
        for(int i=0;i<drivers.size();i++)
        {
            if(driverId==drivers.get(i).driverId)
            {
                return drivers.get(i);
            }
        }
        return null;
    }
    Cab getCab(int cabId)
    {
        for(int i=0;i<cabs.size();i++)
        {
            if(cabId==cabs.get(i).cabId)
            {
                return cabs.get(i);
            }
        }
        return null;
    }
    void createReport(String date)
    {
        for(int i=0;i<trips.size();i++)
        {
            if(trips.get(i).date.equals(date))
            {
                System.out.println("EmployeeName : "+trips.get(i).employee.name);
                System.out.println("CabType : "+trips.get(i).cab.type);
                System.out.println("DriverName : "+trips.get(i).driver.name);
                System.out.println(trips.get(i).calculateCost());
                System.out.println();
            }
        }
    }
}