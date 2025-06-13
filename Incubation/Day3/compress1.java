import java.util.Scanner;

public class compress1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int left = 0;
        int right = 0;
        int count = 0;
        String ans = "";

        while(right<str.length())
        {
            if(str.charAt(left) == str.charAt(right))
            {
                count++;
                right++;
            }
            else
            {
                if(count>1)
                {
                    ans = ans + count + str.charAt(left);
                }
                else {
                    ans = ans + str.charAt(left);
                }
                count = 0;
                left = right;
            }
        }
        if(count>1)
        {
            ans = ans + count + str.charAt(left);
        }
        else
        {
            ans = ans + str.charAt(left);
        }
        count = 0;
        left = right;
        System.out.println(ans);
    }
}