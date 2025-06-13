import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int col = (n*2)-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i+j>=n-1 && n-j+i>=1)
                {
                    System.out.print(Math.abs(n-j-1));
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
