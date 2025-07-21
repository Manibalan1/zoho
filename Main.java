import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a;
        int count = 1;
        int count1 = 0;
        for(int i = 0; i<a;i++)
        {
            count1 = count;
            for(int j = i ; j >= 0; j--)
            {
                System.out.printf("%-"+(5)+"d",count1);
                count1 = count1 -(a-j);
            }
            count = count + b;
            b--;
            System.out.println();
        }
    }
}
// input 5 Dont use arrays

//        1
//        6    2
//        10   7    3
//        13   11   8    4
//        15   14   12   9    5
