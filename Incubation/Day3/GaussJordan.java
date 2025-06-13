public class GaussJordan {
    public static void main(String[] args) {
        int n = 3;
        double[][] mat = {{2, 1, -1, 8},
                {-3, -1, 2, -11},
                {-2, 1, 2, -3}};

        for (int i = 0; i < n; i++) {
            double diag = mat[i][i];
            for (int j = 0; j <= n; j++) {
                mat[i][j] = mat[i][j] / diag;
            }
            print(mat);

            for (int j = 0; j < n; j++) {
                if (j != i) {
                    double num = mat[j][i];
                    for (int k = 0; k <= n; k++) {
                        mat[j][k] = mat[j][k] - num * mat[i][k];
                    }
                    print(mat);
                }
            }
        }
    }
    public static void print(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}