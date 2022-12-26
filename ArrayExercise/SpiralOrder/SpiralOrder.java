package ArrayExercise.SpiralOrder;

import java.util.Arrays;

public class SpiralOrder {
    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       // int[][] matrix={{6},{9},{7}};
        int colLength = matrix[0].length-1;
        int rowLength=  matrix.length-1;
        int m=0,n=0,o=colLength,p=rowLength,i=0,j=0;

        while(m<=p || n<=o) {
            i=m;
            for (j = n; j < o; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            j = o;
            for (i = m; i < p; i++) {
                System.out.print(matrix[i][j] + ",");
            }
            if(p != m) {
                i = p;
                for (j = o; j > n; j--) {
                    System.out.print(matrix[i][j] + ",");
                }
            }
            if(o != n ) {
                j = n;
                for (i = p; i > m; i--) {
                    System.out.print(matrix[i][j] + ",");
                }
            }
            m++;
            n++;
            o--;
            p--;

        }
        if(matrix.length%2 == 1 && matrix[0].length %2 ==1 ) {
            System.out.print(matrix[i][j] + ",");
        }
    }
}
