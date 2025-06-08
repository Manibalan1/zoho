import java.util.Scanner;

public class encode {
    static boolean isNumber(char a)
    {
        if(Character.isDigit(a))
        {
            return true;
        }
        return false;
    }
    static boolean isCharacter(char a)
    {
        if(Character.isLetter(a))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "2[ab]2ca";
        String num = "0";
        String str = "";

        int right = 0;

        while(right<a.length())
        {
            if(isNumber(a.charAt(right)))
            {
                if(right-1>0 && isNumber(a.charAt(right-1)))
                {
                    num=num+a.charAt(right);
                }
                else {
                    for(int i = 0;i<Integer.parseInt(num);i++)
                    {
                        System.out.print(str);
                    }
                    num = "";
                    str = "";
                }

                num = num+a.charAt(right);

            }
            else if(isCharacter(a.charAt(right)))
            {
                str = String.valueOf(a.charAt(right));
            }
            right++;
        }
        for(int i = 0;i<Integer.parseInt(num);i++)
        {
            System.out.print(str);
        }
    }
}
// decode the string Input = "2a2[ab]2ca" Output = aaababcca
// dont use any datastructures and stringbuilders . Try to solve by finding index values