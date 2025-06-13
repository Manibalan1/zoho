import java.util.Arrays;
import java.util.Scanner;

public class RotateRight {
    static void swap(int[] arr)
    {
        for(int i=arr.length-1;i>=1;i--)
        {
            arr[i] = arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6};
        int num = 123456;
        int n = 3;
        String res = "";
        int num1= 0;

        int count = 0;
        while(count<n)
        {
            int temp =arr[arr.length-1];
            swap(arr);
            arr[0] = temp;
            count++;
        }

        for(int i=0;i<n;i++)
        {
            res = (num%10) + res;
            num = num/10;
        }
        res = res + num;
        System.out.println(res);
        System.out.println(Arrays.toString(arr));



        int result = 0;
        int n1 = 3;
        int num2 = 123456;
        int num3=0;
        int multiple = 1;
        double count1 = 0;

        for(int i=0;i<n;i++)
        {
            result = result+(multiple*(num2%10));
            num2 = num2/10;
            multiple = multiple*10;
        }
        num3 = num2;
        while(num3!=0)
        {
            count1++;
            num3=num3/10;
        }
        int multiple1 = 1;
        for(int i=0;i<count1;i++)
        {
            multiple1 = multiple1*10;
        }
        System.out.println((result*multiple1)+num2);
    }
}
