import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int rowStart = 0;
        int count = 1;
        int count1 = 2;
        int dupCount1 = 2;
        boolean ascending = true;
        for(int i = 0; i < n; i++)
        {
            count1 = dupCount1;
            rowStart = count;
            for(int j = 1; j <=n; j++)
            {
                if(ascending)
                {
                    System.out.print(rowStart+" ");
                    rowStart = rowStart+(count1);
                    count1++;
                    if(count1==n+1)
                    {
                        count1 = n;
                        ascending = false;
                    }
                }
                else{
                    System.out.print(rowStart+" ");
                    rowStart = rowStart+(count1);
                    count1--;
                }
            }
            ascending = true;
            dupCount1++;
            if(dupCount1==n+1)     //For the last row to decrement
            {
                dupCount1--;
                ascending = false;
            }
            count = count+(i+1);
            System.out.println();
        }
    }
}


//public class Main {
//    public static void main(String[] args) {
//        int n = 5;
//
//        int temp = 1;
//        int startValue = 1;
//
//        for (int i = 1; i <= n; i++) {
//            temp = startValue;
//            int bottom = n;
//
//            for (int j = 1; j <= n; j++) {
//                if (i + j > n + 1) {
//                    temp = temp + bottom;
//                    System.out.print(temp + " ");
//                    bottom--;
//                } else {
//                    System.out.print(temp + " ");
//                    temp = temp + (i + j);
//                }
//
//                if (i + j == n + 1) {
//                    temp = temp - (i + j);
//                }
//            }
//
//            startValue = startValue + i;
//            bottom = n;
//            System.out.println();
//        }
//    }
//}