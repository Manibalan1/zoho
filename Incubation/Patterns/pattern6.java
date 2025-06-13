import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "manibalan";

        int range = str.length()/3;
        int count = 0;

        for(int i=0;i<=range;i++)
        {
            for(int j=0;j<=range;j++)
            {
                if((i==0 || i==range || i+j==range) && count<str.length())
                {
                    System.out.print(str.charAt(count));
                    count++;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
