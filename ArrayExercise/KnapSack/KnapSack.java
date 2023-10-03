package ArrayExercise.KnapSack;

import java.util.*;

public class KnapSack {
    
    public static void main(String[] args){
        int maxWeight =8;
        int[] weights = {1,3,4,5};
        int[] values = {10,40,50,70};
        
        int[][] matrix = new int[weights.length][maxWeight+1];
        

        for(int i=0;i<weights.length;i++){
            matrix[i][weights[i]] = values[i];
            matrix[i][0]=0;
        }
            for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
      }

        for(int i=1;i<weights.length;i++){
            for(int j=weights[i];j<=maxWeight;j++){
                matrix[i][j] = matrix[j-weights[i]][j-weights[i]];
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
      }

        System.out.println("max weight= "+matrix[weights.length-1][maxWeight-1]);
    }
}
