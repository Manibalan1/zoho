import java.util.Scanner;

public class FloorCeil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ;i++)
        {
            arr[i] = in.nextInt();
        }
        int floor = -1;
        int ceil = -1;

        for(int i =0 ;i<n ;i++)
        {
            if(arr[i]<=num)
            {
                floor = Math.max(arr[i],floor);
            }
            if(arr[i]>=num)
            {
                if(ceil == -1)
                {
                    ceil = arr[i];
                }
                ceil = Math.min(ceil,arr[i]);
            }
        }
        System.out.println(floor+" "+ceil);
    }
}