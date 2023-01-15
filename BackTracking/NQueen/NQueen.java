package BackTracking.NQueen;

import java.util.*;
class NQueen {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out. println("Enter board size");
        int n=sc.nextInt();
        int[][]  board = new int[n][n];
        checkQueen(board ,n,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out. print(board[i][j] +" ");
            }
            System.out. println();
        }
    }

    private static boolean checkQueen(int[][] board, int n,int col){

        if(col >= n){
            return true;
        }

        for(int row=0;row<n;row++){
            if(checkQueenSafeAtThisPosition(board, row ,col,n)){
                board[row][col]=1;
                if(checkQueen(board,n,col+1)==true){
                    return true;
                }
                board[row][col]=0;
            }
        }
        return false;
    }

    private static boolean checkQueenSafeAtThisPosition(int[][] board,int row,int col,int n){

        //check horizionatlly no queen there
        for(int i=0;i<n;i++){
            if(board[row][i]==1){
                return false;
            }
        }
        //check queen left diagonally up
        int i=row-1,j=col-1;
        while(i>=0 && j>= 0){
            if(board[i][j] == 1){
                return false;
            }
            i--;
            j--;
        }

        //check queen left diagonally down
        i=row-1;j=col+1;
        while(i>=0 && j< n){
            if(board[i][j] == 1){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}

