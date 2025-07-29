import java.util.*;

public class matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int rowsa = sc.nextInt();
        System.out.print("Enter the no. of coloums:");
        int colsa = sc.nextInt();
        int[][] a = new int[rowsa][colsa];
        System.out.print("Enter the elements of first matrix:");
        for (int i = 0; i < rowsa; i++) {
            for (int j = 0; j < colsa; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the no. of rows of second matrix:");
        int rowsb = sc.nextInt();
        ;
        System.out.print("Enter the no. of coloums of second matrix:");
        int colsb = sc.nextInt();
        int[][] b = new int[rowsb][colsb];
        System.out.print("Enter the elments of second matrix:");
        for (int i = 0; i < rowsb; i++) {
            for (int j = 0; j < colsb; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        // multiplication of matrix
        if (rowsb == colsa) {
            int[][] mul = new int[rowsa][colsb];
            for (int i = 0; i < rowsa; i++) {
                for (int j = 0; j < colsb; j++) {
                    for (int k = 0; k < colsa; k++) {
                        mul[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.print("The multiplied matrix is:\n");
            for (int i = 0; i < rowsa; i++) {
                for (int j = 0; j < colsb; j++) {
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("matrix multiplication not possible");
        }
        // addition

        System.out.println("final matrix is:");
        int[][] add = new int[rowsa][colsa];

        if (rowsa == rowsb && colsa == colsb) {
            for (int i = 0; i < rowsa; i++) {
                for (int j = 0; j < colsa; j++) {
                    add[i][j] = a[i][j] + b[i][j];
                }
            }
        }
            for (int i = 0; i < rowsa; i++) {
                for (int j = 0; j < colsa; j++) {
                    System.out.print(add[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("final matrix after subtarction is:");
        int[][] sub = new int[rowsa][colsa];

        if (rowsa == rowsb && colsa == colsb) {
            for (int i = 0; i < rowsa; i++) {
                for (int j = 0; j < colsa; j++) {
                    sub[i][j] = b[i][j] - a[i][j];
                }
            }
        }
            for (int i = 0; i < rowsa; i++) {
                for (int j = 0; j < colsa; j++) {
                    System.out.print(sub[i][j] + " ");
                }
                System.out.println();
            }
    }
}
