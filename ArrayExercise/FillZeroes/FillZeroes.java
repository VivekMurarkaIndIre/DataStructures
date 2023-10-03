import java.io.*;
import java.util.* ;



public class FillZeroes {
    public static void main(String[] args){
    int[][] matrix= {{3,4,5,6,7},
    {2,0,4,5,8},{3,4,6,0,7}};
    setZeros(matrix);
      for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println();
      }
}

    public static void setZeros(int matrix[][]) {
        // Write your code here..
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    Arrays.fill(matrix[i],0);
                    for(int row=0;row<matrix.length;row++){
                        matrix[row][j] = 0;
                    }
                }
            }
        }
    }

}