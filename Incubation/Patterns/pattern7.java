import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++)
        {
            int count = i;
            for(int j=0;j<n;j++)
            {
                System.out.print(count+" ");
                count++;
                if(count>n)
                {
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}