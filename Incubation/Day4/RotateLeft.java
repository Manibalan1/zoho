import java.util.Arrays;

public class RotateLeft {
    static void swap(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};
        int num = 123456;
        int num1 = 0;
        int n = 4;
        String res = "";

        int count = 0;
        while(count<n)
        {
            int temp =arr[0];
            swap(arr);
            arr[arr.length-1] = temp;
            count++;
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<n;i++)
        {
            res = (num%10) + res;
            num = num/10;
        }
        res = res + num;
        System.out.println(res);

        int result = 0;
        int n1 = 4;
        int num2 = 123456;
        int num3=0;
        int multiple = 1;
        int count1 = 0;

        for(int i=0;i<n1;i++)
        {
            result = (multiple*(num2%10))+result;
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
        System.out.println(num2+(result*multiple1));
    }
}