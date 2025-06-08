import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int c = in.nextInt();
        int arr[] = new int[c];
        for(int i =0 ;i<c;i++){
            arr[i] = in.nextInt();
        }
        for(int i =0 ;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                int a = arr[i];
                int b = arr[j];
                if(arr[i]<0)
                {
                    a=a*(-1);
                }
                if(arr[j]<0)
                {
                    b=b*(-1);
                }
                if(b<a)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
// Sort based on square of the given values  [Dont use any extra arrays]
// INPUT = [10,5,3,-2,-1,7,-5,-6,-10]
// OUTPUT = [-1,-2,3,-5,5,-6,7,-10,10]