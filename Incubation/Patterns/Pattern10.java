import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int rowStart = 1;
        int rowPrint = 0;

        int count = 1;
        int increment = 0;

        System.out.println(1);
        for(int i =1;i<n;i++)
        {
            if(i%2!=0)
            {
                count = count + increment;
                increment = 2;
            }
            rowStart = rowStart+count;
            rowPrint = rowStart;
            for(int j=0;j<=i;j++)
            {
                System.out.print(rowPrint+" ");
                rowPrint+=2;
            }
            System.out.println();
        }
    }
}