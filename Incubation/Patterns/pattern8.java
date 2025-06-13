import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int rowStart = 0;
        int count = 1;
        for(int i=0;i<n;i++)
        {
            rowStart = count;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(rowStart+" ");
                rowStart=rowStart+(j+i+1);
            }
            System.out.println();
            count=count+i+1;
        }
    }
}