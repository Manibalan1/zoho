import java.util.Arrays;

public class sortFrequency {
    static int count(int[] arr,int n)
    {
        int count = 0;
        for(int i =0 ;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,1,2,1,3,6,3,2,5,4,3,5,3,3};

        for(int i =0 ;i<arr.length;i++)
        {
            for(int j =0;j<arr.length-1;j++)
            {
                int max1 = count(arr , arr[j]);
                int max2 = count(arr , arr[j+1]);

                if(max2>max1 || (max1==max2 && arr[j]>arr[j+1]))
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}