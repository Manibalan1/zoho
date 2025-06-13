public class Main {
    public static void main(String[] args) {

        ReportManager rm = new ReportManager();
        rm.createEmployee("Manibalan","SoftwareDeveloper");
        rm.createDriver("abc");
        rm.createCab("class A",100.0);

        rm.createTrip(1,1,1,2.0,"1.02.2025");
        rm.createReport("1.02.2025");

        rm.createEmployee("Surya","SoftwareDeveloper");
        rm.createDriver("xyz");
        rm.createCab("Class B",100.0);
        rm.createTrip(2,2,2,1.0,"1.02.2025");
        rm.createReport("1.02.2025");
    }
}