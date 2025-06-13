public class Calender {
    int date =1 , year , totalDays , startDay;
    String day , month;
    String days[] = {"Sat","Sun","Mon","Tue","Wed","Thur","fri"};
    int[][] dates = new int[5][7];
    Calender(int year , int startDay , String month , int totalDays)
    {
        this.year = year;
        this.startDay = startDay;
        this.month = month;
        this.totalDays = totalDays;
    }
    void calculateMonth()
    {
        int countDay = date;
        boolean check = true;
        day = days[startDay];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(check)
                {
                    if(day.equals(days[j]))
                    {
                        dates[i][j] = countDay++;
                        check = !check;
                    }
                }
                else
                {
                    if(i==4 && j==6)
                    {
                        dates[i][j] = countDay++;
                        int startrow = 0;
                        int startcol = 0;
                        while(countDay<=totalDays)
                        {
                            dates[startrow][startcol++] = countDay;
                            countDay++;
                        }
                    }
                    else
                    {
                        dates[i][j] = countDay++;
                    }
                }
                if(countDay>totalDays)
                {
                    break;
                }
            }
        }
    }
    void printCalender()
    {
        System.out.println("Year : "+year+" "+"Month : "+month);
        for(int i=0;i<days.length;i++)
        {
            System.out.printf("%-"+(5)+"s",days[i]);
        }
        System.out.println();
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(dates[i][j]==0)
                {
                    System.out.printf("%-"+(5)+"s","-");
                }
                else
                {
                    System.out.printf("%-"+(5)+"d",dates[i][j]);
                }
            }
            System.out.println();
        }
    }
}