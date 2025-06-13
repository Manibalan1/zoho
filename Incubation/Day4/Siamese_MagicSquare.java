import java.util.Scanner;

public class Siamese_MagicSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int mat[][] = new int[n][n];
        int count = 1;

        int i = 0;
        int j = n / 2;

        while (count < n * n) {
            mat[i][j] = count;
            System.out.println(mat[i][j] + "i = " + i + " j = " + j);
            count++;
            i--;                         // move top right
            j++;
            if (i < 0 && j > n - 1)     // top right corner exit
            {
                i = i + 2;
                j = j - 1;
            }
            if (i < 0) {
                i = n - 1;
                j = j + 1;
                if (j > n - 1)         // for bottom edge
                {
                    j = n - 1;
                } else                 // for 5
                {
                    j = j - 1;
                }
            }
            if (j > n - 1) {
                j = 0;
            }
            if (mat[i][j] != 0)        // right full
            {
                i = i + 2;
                j = j - 1;
            }
            if (i < 0 && j <= n - 1)   // top exit
            {
                i = n - 1;
                j = j + 1;
            }
            if (i >= 0 && j >= n)      // right exit
            {
                i = i - 1;
                j = 0;
            }
        }
        mat[i][j] = count;
        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 < n; j1++) {
                System.out.print(mat[i1][j1] + " ");
            }
            System.out.println();
        }
    }
}