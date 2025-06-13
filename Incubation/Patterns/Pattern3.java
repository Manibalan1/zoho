import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 0;i < n;i++)
        {
            for(int j=0;j<(n*2)-1;j++)
            {
                int value = Math.abs(j-(n-1))+1;
                if(value<= i+1) {
                    System.out.print(value + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}