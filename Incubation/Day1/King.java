import java.util.Scanner;

public class King {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        int x2 = in.nextInt();
        int y2 = in.nextInt();

        while(x1!=x2 || y1!=y2)
        {
            if(x2>x1)
            {
                x1++;
            }
            if(x2<x1)
            {
                x1--;
            }
            if(y2>y1)
            {
                y1++;
            }
            if(y2<y1)
            {
                y1--;
            }
            System.out.println(x1+" "+y1);
        }
    }
}