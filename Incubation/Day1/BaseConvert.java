import java.util.Scanner;

public class BaseConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int base = in.nextInt();
        String res = "";

        while(n!=0)
        {
            int temp = n%base;
            if(temp>9)
            {
                res = (char)(temp+55) +res;//if greater than 9 change to A to F
            }
            else {
                res = temp + res;
            }
            n = n/base;
        }
        System.out.println(res);
    }
}