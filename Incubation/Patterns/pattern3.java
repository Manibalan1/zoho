import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count = 1;

        for(int i=5;i>=1;i--)
        {
            int countDup = count;
            for(int j=1;j<=n;j++)
            {
                if(j>=i)
                {
                    System.out.print(countDup);
                    countDup--;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println();
        }
    }
}