import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int multiple = 1;
        int arr[] = new int[10];

        while(n>0)
        {
            int count = n%10;
            for(int i =0;i<count;i++)
            {
                arr[i] = arr[i]+multiple;
            }
            multiple = multiple*10;
            n = n/10;
        }
        for(int i = 0;i<arr.length;i++){

            if(arr[i]!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}