import java.util.LinkedHashMap;

public class Main {
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    static void createCalender(int year , int day , String month , int totalDays)
    {
        Calender calender = new Calender(year , day , month , totalDays);
        calender.calculateMonth();
        calender.printCalender();
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> monthDays = new LinkedHashMap<>();
        monthDays.put("Jan", 31);
        monthDays.put("Feb", 28);
        monthDays.put("Mar", 31);
        monthDays.put("Apr", 30);
        monthDays.put("May", 31);
        monthDays.put("Jun", 30);
        monthDays.put("Jul", 31);
        monthDays.put("Aug", 31);
        monthDays.put("Sep", 30);
        monthDays.put("Oct", 31);
        monthDays.put("Nov", 30);
        monthDays.put("Dec", 31);

        int monthNum = 1;
        String  month = "Jun";
        int year = 2025;
        if (month.equals("Feb") && isLeapYear(year)) {
            monthDays.put("Feb", 29);
        }
        for (String i : monthDays.keySet()) {
            if (i.equals(month)) break;
            monthNum++;
        }
        int lastTwo = year%100;
        int firstTwo = year/100;
        int startDay= (1 + ((13*monthNum-1)/5) +lastTwo+ (lastTwo/4) +(firstTwo/4)-2*firstTwo)%7;//Zellers Formula
        if (startDay < 0)
        {
            startDay += 7;
        }
        startDay = (startDay + 6) % 7;
        createCalender(year , startDay , month , monthDays.get(month));
    }
}