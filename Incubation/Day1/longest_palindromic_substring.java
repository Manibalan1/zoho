import java.util.Scanner;

class longest_palindromic_substring{
    static int isPalindrome(String s , int left , int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            right++;
            left--;
        }
        return right-left-1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        if(str==null || str.length()<1)
        {
            System.out.println(str);
            return ;
        }
        int start = 0;
        int end = 0;
        for(int i = 0;i<str.length();i++)
        {
            int len1 = isPalindrome(str,i,i);
            int len2 = isPalindrome(str,i,i+1);
            int len = Math.max(len1,len2);

            if(len>end-start)
            {
                start = i-((len-1)/2);
                end = i+(len/2);
            }
        }
        for(int i = start ;i<=end;i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}