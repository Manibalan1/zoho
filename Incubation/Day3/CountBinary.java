public class CountBinary {
    static String countNum(long num)
    {
        String countNum = "";
        while(num!=0)
        {
            countNum = (num%2)+countNum;
        }
        return countNum;
    }
    static String count(long num , String binaryNum)
    {
        while(num!=0)
        {
            binaryNum = (countNum(num%10))+binaryNum;
            num = num/2;
        }
        return binaryNum;
    }
    static long number(int start , int end , int count , String binaryNum)
    {
        String ans = "";
        while(end<binaryNum.length())
        {
            if(binaryNum.charAt(start)== binaryNum.charAt(end))
            {
                count++;
                end++;
            }
            else
            {
                ans = ans+count;
                count = 1;
                start = end;
                end++;
            }
        }
        ans = ans+count;
        return Long.parseLong(ans);
    }
    public static void main(String[] args) {
        long num = 7;
        long ansNum = num;
        int count = 0;
        String binaryNum = "";
        while(ansNum!=10)
        {
            count++;
            binaryNum = count(ansNum,"");
            System.out.println(binaryNum);
            if(binaryNum.equals("10"))
            {
                break;
            }
            ansNum = number(0,1,1,binaryNum);
            System.out.println(ansNum);
        }
        System.out.println(count);
    }
}