import java.util.*;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] a = randomMatrix(2,2), b = randomMatrix(2,2);
        System.out.println("A:"); print(a);
        System.out.println("B:"); print(b);
        System.out.println("Sum:"); print(add(a,b));
        System.out.println("Diff:"); print(subtract(a,b));
        System.out.println("Product:"); print(multiply(a,b));
    }
    static int[][] randomMatrix(int r, int c) {
        int[][] m = new int[r][c];
        Random rand = new Random();
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) m[i][j]=rand.nextInt(10);
        return m;
    }
    static int[][] add(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i=0;i<a.length;i++) for (int j=0;j<a[0].length;j++) r[i][j]=a[i][j]+b[i][j];
        return r;
    }
    static int[][] subtract(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i=0;i<a.length;i++) for (int j=0;j<a[0].length;j++) r[i][j]=a[i][j]-b[i][j];
        return r;
    }
    static int[][] multiply(int[][] a, int[][] b) {
        int[][] r = new int[a.length][b[0].length];
        for (int i=0;i<a.length;i++)
            for (int j=0;j<b[0].length;j++)
                for (int k=0;k<a[0].length;k++)
                    r[i][j] += a[i][k]*b[k][j];
        return r;
    }
    static void print(int[][] m) {
        for (int[] row : m) System.out.println(Arrays.toString(row));
    }
}
