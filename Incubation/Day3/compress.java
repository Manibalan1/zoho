import java.util.Scanner;

public class compress {
    static int count(char a , String str)
    {
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==a)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int arr[] = new int[256];
        int len = 0;
        String ans = "";

        for(int i=0;i<str.length();i++)
        {
            if(arr[str.charAt(i)]==0)
            {
                len = count(str.charAt(i) , str);
                if(len>1)
                {
                    ans = ans+len+str.charAt(i);
                }
                else
                {
                    ans = ans + str.charAt(i);
                }
                arr[str.charAt(i)]++;
            }
        }
        System.out.println(ans);
    }
}