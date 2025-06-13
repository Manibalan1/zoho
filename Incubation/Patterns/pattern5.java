import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0;i< 2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n-2) - j;
                int bottom = (2*n-2) - i;
                int count = n- Math.min(Math.min(top,left),Math.min(right,bottom));
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
