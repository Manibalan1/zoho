import java.util.Scanner;

public class SecondLargest {
    static boolean isChar(char ch)
    {
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            return true;
        }
        return false;
    }

    static void printString(int start , int end , String str)
    {
        for(int i=start;i<end;i++)
        {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Hi My name is ManiBalan";

        int firstStart = 0;
        int firstEnd = 0;

        int secondStart = -1;
        int secondEnd = -1;

        int i = 0;
        int j = 0;

        while(j<str.length())
        {
            if(isChar(str.charAt(j)))
            {
                j++;
            }
            else
            {
                if(j-i > firstEnd-firstStart)
                {
                    secondStart = firstStart;
                    secondEnd = firstEnd;

                    firstStart = i;
                    firstEnd = j;
                    i = j+1;
                    j++;
                }
                else if(j-i>secondEnd-secondStart && j-i<firstStart-firstEnd)
                {
                    secondStart = i;
                    secondEnd = j;
                    i = j+1;
                    j++;
                }
                else
                {
                    i = j+1;
                    j++;
                }
            }
        }
        if(j-i > firstEnd-firstStart)
        {
            secondStart = firstStart;
            secondEnd = firstEnd;

            firstStart = i;
            firstEnd = j;
        }
        else if(j-i>secondEnd-secondStart && j-i<firstStart-firstEnd)
        {
            secondStart = i;
            secondEnd = j;
        }

        if(secondStart==-1 && secondEnd==-1)
        {
            printString(firstStart,firstEnd,str);
        }
        else
        {
            printString(secondStart,secondEnd,str);
        }
    }
}