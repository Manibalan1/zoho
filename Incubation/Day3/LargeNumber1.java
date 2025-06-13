import java.util.Arrays;

public class LargeNumber1 {
    static void swap(int i , int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int count(int num)
    {
        int count = 0;
        while(num!=0)
        {
            count++;
            num = num/10;
        }
        return count;
    }
    static void compare(int i, int j , int arr[])
    {
        int num1 = arr[i];
        int num2= arr[j];
        int num1Dup = num1;
        int num2Dup = num2;
        int count1 = count(num1);
        int count2 = count(num2);

        System.out.println(count1+" "+count2);
        int combo1 = (num1Dup*((int)Math.pow(10,count2)))+(num2Dup);
        int combo2 = (num2Dup*((int)Math.pow(10,count1)))+(num1Dup);
        if(combo2>combo1)
        {
            swap(i,j,arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 30, 34, 5, 9};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                compare(j,j+1,arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}