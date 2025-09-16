import java.util.*;

public class MatrixAdvanced {
    public static void main(String[] args) {
        int[][] m2 = randomMatrix(2,2);
        int[][] m3 = randomMatrix(3,3);
        System.out.println("2x2:"); print(m2);
        System.out.println("Transpose:"); print(transpose(m2));
        System.out.println("Determinant: " + det2x2(m2));
        System.out.println("Inverse:");
        double[][] inv2 = inverse2x2(m2);
        for (double[] row : inv2) System.out.println(Arrays.toString(row));
        System.out.println("3x3:"); print(m3);
        System.out.println("Transpose:"); print(transpose(m3));
        System.out.println("Determinant: " + det3x3(m3));
        System.out.println("Inverse:");
        double[][] inv3 = inverse3x3(m3);
        for (double[] row : inv3) System.out.println(Arrays.toString(row));
    }
    static int[][] randomMatrix(int r, int c) {
        int[][] m = new int[r][c];
        Random rand = new Random();
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) m[i][j]=rand.nextInt(10);
        return m;
    }
    static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i=0;i<m.length;i++) for (int j=0;j<m[0].length;j++) t[j][i]=m[i][j];
        return t;
    }
    static int det2x2(int[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }
    static int det3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    static double[][] inverse2x2(int[][] m) {
        double det = det2x2(m);
        if (det == 0) return new double[2][2];
        double[][] inv = {
            { m[1][1]/det, -m[0][1]/det },
            { -m[1][0]/det, m[0][0]/det }
        };
        return inv;
    }
    static double[][] inverse3x3(int[][] m) {
        double det = det3x3(m);
        if (det == 0) return new double[3][3];
        double[][] inv = new double[3][3];
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                inv[j][i] = cofactor(m,i,j)/det;
        return inv;
    }
    static int cofactor(int[][] m, int r, int c) {
        int[][] minor = new int[2][2];
        int mi=0, mj;
        for (int i=0;i<3;i++) {
            if (i==r) continue;
            mj=0;
            for (int j=0;j<3;j++) {
                if (j==c) continue;
                minor[mi][mj++] = m[i][j];
            }
            mi++;
        }
        int cof = det2x2(minor);
        if ((r+c)%2==1) cof = -cof;
        return cof;
    }
    static void print(int[][] m) {
        for (int[] row : m) System.out.println(Arrays.toString(row));
    }
}
