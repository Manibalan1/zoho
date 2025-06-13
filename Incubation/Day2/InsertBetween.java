import java.util.Scanner;

public class InsertBetween {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {1,3,4,5,6,8};
        int target = 7;
        int start = 1;
        int end = arr.length;
        int mid = 0;

        if(target>arr[arr.length-1])
        {
            System.out.println(arr[arr.length-1]+ " NULL");
            return;
        }
        else if(target<arr[0])
        {
            System.out.println("NULL "+arr[0]);
            return;
        }

        while(start<end)
        {
            mid = (end+start)/2;

            if(arr[mid]==target)
            {
                System.out.println("It is already present");
                break;
            }
            if(arr[mid]<target && arr[mid+1]>target)
            {
                System.out.println(arr[mid]+" "+arr[mid+1]);
                break;
            }
            else if(arr[mid]>target && arr[mid-1]<target)
            {
                System.out.println(arr[mid-1]+" "+arr[mid]);
                break;
            }
            if(arr[mid]>target)
            {
                end = mid;
            }
            else{
                start = mid;
            }
        }
    }
}