class Sudoku {
    int[][] cellStructure= {{1,1,1,2,2,2,3,3,3},
    {1,1,1,2,2,2,3,3,3},
    {1,1,1,2,2,2,3,3,3},
    {4,4,4,5,5,5,6,6,6},
    {4,4,4,5,5,5,6,6,6},
    {4,4,4,5,5,5,6,6,6},
    {7,7,7,8,8,8,9,9,9},
    {7,7,7,8,8,8,9,9,9},
    {7,7,7,8,8,8,9,9,9}}

    int[][] row= new int[9][10];
    int[][] col= new int[9][10];
    int[][] cell= new int[9][10];
    public static void main(String args[]){

        int[][] sudoku = {{5,3,-1,-1,7,-1,-1,-1,-1},
        {6,-1,-1,1,9,5,-1,-1,-1},
        {-1,9,8,-1,-1,-1,-1,6,-1},
        {8,-1,-1,-1,6,-1,-1,-1,3},
        {4,-1,-1,8,-1,3,-1,-1,1},
        {7,-1,-1,-1,2,-1,-1,-1,6},
        {-1,6,-1,-1,-1,-1,2,8,-1},
        {-1,-1,-1,4,1,9,-1,-1,5},
        {-1,-1,-1,-1,8,-1,-1,7,9}};


        solveSudoku(sudoku,0,0);
        printMatrix(row);
        printMatrix(col);
        printMatrix(cell);
    }

    public static void printMatrix(int[][] matrix){
        for(int x=0;x<9;x++){
            for(y=0;y<9;y++){
                System.out.print(matrix[x][y]+" ,");
            }
            System.out.println();
        }
    }

    public static void solveSudoku(int[][] sudoku,int i, int j){
        if(i == 9 || j == 9){
            return;
        }

        if(sudoku[i][j]!=-1){
            int numHere = sudoku[i][j];
            row[i][numHere]=1;
            row[j][numHere]=1;
            cell[cellStructure[i+1][j+1]][numHere]=1;
        }
        if(i+1 < 9 )
        solveSudoku(sudoku,i+1,j);
        if(j+1 < 9 )
        solveSudoku(sudoku,i,j+1);

    }

    public static doNothing(int[][] sudoku,int i, int j){
       
            for(int k=1;k<=9;k++){
                if(validNumberAtThisPos(k,sudoku,i,j)){
                    row[i][k]=1;
                    row[j][k]=1;
                    cell[cellStructure[i+1][k]][numHere]=1;
                

                }
            }
        
    }

    public static boolean validNumberAtThisPos(int num,int[][] sudoku,row,col){
        if(row[row][num]==1 || row[col][num]==1 || row[cellStructure[i+1][j+1]][num]==1 ){
            return false;
        }

        return true;

    }
}