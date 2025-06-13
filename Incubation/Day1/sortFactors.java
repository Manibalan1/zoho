import java.util.Arrays;

public class sortFactors {
    static int Factors(int n)
    {
        int count = 0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int arr[] = {10,12,13,9,6,8};

        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                int max1 = Factors(arr[j]);
                int max2 = Factors(arr[j+1]);

                if(max1>max2)
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