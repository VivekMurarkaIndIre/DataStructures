import java.io.*;
import java.util.* ;



public class FillZeroes {
    public static void main(String[] args){
    int[][] matrix= {{3,4,5,6,7},
    {2,0,4,5,8},{3,4,6,0,7}};
    List<Cell> myList = new ArrayList<>();
    setZeros(matrix,myList);
      for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
      }
}

    public static void setZeros(int matrix[][],List<Cell> myList ) {
        // Write your code here..
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    Cell cell = new Cell(i,j);
                    myList.add(cell);
                }
            }
        }

        for(int i=0;i<myList.size();i++){
            Cell currentCell= myList.get(i);
            Arrays.fill(matrix[currentCell.row],0);
            for(int j=0;j<matrix.length;j++){
                matrix[j][currentCell.col]=0;
            }
        }
    }


}

class Cell {
    int row;
    int col;
    public Cell(int row,int col){
        this.row=row;
        this.col=col;
    }
}
