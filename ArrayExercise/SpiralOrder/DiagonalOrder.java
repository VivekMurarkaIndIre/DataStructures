package ArrayExercise.SpiralOrder;

import java.util.Arrays;

public class DiagonalOrder {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int colLength = matrix[0].length,i,j,k;
        int rowLength=  matrix.length;

        for(k=0;k<rowLength;k++){
            i=k;
            j=0;
            while(i>=0){
                System.out.print(matrix[i][j]);
                i--;
                j++;
            }
        }
        for(k=1;k<colLength;k++){
            i=rowLength-1;
            j=k;
            while(j<=colLength-1){
                System.out.print(matrix[i][j]);
                i--;
                j++;
            }
        }

    }
}
