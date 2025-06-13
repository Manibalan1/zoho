import java.util.Arrays;

public class SortByLargest {
    public static void main(String[] args) {
        int arr[] = {10,40,20,90,60,30,50,70,80};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}