import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int col = (n*2)-1;
        int start = n;

        for(int i=1;i<=n;i++)
        {
            int count = 1;
            for(int j=1;j<=col;j++)
            {
                if(j>=start && j<n+i)
                {
                    System.out.print(count);
                    if(j<n)
                    {
                        count++;
                    }
                    else
                    {
                        count--;
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            start--;
            System.out.println();
        }
    }
}