import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        int arr[] = new int[126];

        if(str1.length()!=str2.length())
        {
            System.out.println("Not an Anagram");
            return;
        }
        for(int i = 0; i<str1.length();i++)
        {
            arr[str1.charAt(i)]++;
            arr[str2.charAt(i)]--;
        }
        for(int i =0;i<126;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println("Not an Anagram");
                return ;
            }
        }
        System.out.println("Anagram");
    }
}