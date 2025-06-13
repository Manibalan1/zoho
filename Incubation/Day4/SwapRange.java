import java.util.Arrays;

public class SwapRange {
    public static void main(String[] args) {
        int arr[] = {2,3,5,11,13,9,21};

        int start = 6;
        int end = 2;
        int startDup = start;
        int multiple = 0;
        int count = 1;

        if(start>end)
        {
            int temp = start;
            start = end;
            end = temp;
            startDup = (-1)*start;
            multiple = start;
        }

        int temp = arr[start];
        for(int i = start;i<end;i++)
        {
            arr[end-i+startDup] = arr[end-i+startDup+1];
            startDup = startDup + (multiple*(i-count));
            count++;
        }
        arr[end] = temp;
        System.out.println(Arrays.toString(arr));
    }
}