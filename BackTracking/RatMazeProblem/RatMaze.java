package BackTracking.RatMazeProblem;

import java.util.Scanner;

public class RatMaze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out. println("Enter maze size");
        int n=sc.nextInt();
        int[][] maze = {{0,0,-1,0},{0,-1,0,-1},{0,0,-1,-1},{-1,0,0,0}};

        int[][] maze1 = {{1,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

        findPath(maze,4,0,0);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out. print(maze[i][j] +" ");
            }
            System.out. println();
        }
    }

    private static boolean findPath(int[][] maze, int n,int row,int col){

        if(row==n-1 && col == n-1){
            maze[row][col]=1;
            return true;
        }
        if(isValidPath(maze,n,row,col)){
            maze[row][col]=1;
            if(findPath(maze,n,row,col+1)){
               return true;
            }
            if(findPath(maze,n,row+1,col)){
                return true;
            }
            maze[row][col]=0;
            return false;
        }
        return false;
    }
    private static boolean isValidPath(int[][] maze, int n,int row,int col){
        if(row<n && col<n && maze[row][col]!=-1){
            return true;
        }else{
            return false;
        }
    }

}
