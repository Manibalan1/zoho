import java.util.Scanner;

public class SnakePattern {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int temp = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i%2==0)
                {
                    temp++;
                    System.out.print(temp+" ");
                }
                else {
                    System.out.print(temp+" ");
                    temp--;
                }
            }
            temp = temp+n;
            System.out.println();
        }
    }
}