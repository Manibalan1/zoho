import java.util.Arrays;

public class ArraySwap {
    static void swap(int start, int end, int arr[])
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,10,9,8,7,6,5,4,3};
        int swapCount = 4;
        int len = arr.length;

        int start = 0;
        int end = swapCount;

        while(swapCount<=len)
        {
            swap(start,end-1,arr);
            start = end;
            end = end + swapCount;
            len = len - swapCount;
        }
        System.out.println(Arrays.toString(arr));
    }
}
