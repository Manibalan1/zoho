import java.util.Scanner;
public class PrintSubStringMisMatch {
    static void print(int left , int right , String str)
    {
        for(int i=left;i<right;i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        String ans1 = "";
        String ans2 = "";

        int i = 0;

        while (i < str1.length()) {
            if (str1.charAt(i) != str2.charAt(i)) {
                ans1 = ans1 + str1.charAt(i);
                ans2 = ans2 + str2.charAt(i);
            } else {
                if (ans1.length() > 0) {
                    System.out.println(ans1);
                    System.out.println(ans2);
                    ans1 = "";
                    ans2 = "";
                }
            }
            i++;
        }
        if (ans1.length() > 0) {
            System.out.println(ans1);
            System.out.println(ans2);
        }
    }
}