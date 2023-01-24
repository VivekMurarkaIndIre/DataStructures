package BackTracking.MazeProblem;

import java.util.*;
public class MazeProblem {
    private static boolean found=false;
    public static void main(String[] args) {
        int[][] maze = {{1,0,0,0,0},{1,0,1,1,1},{1,1,1,0,1},{1,0,0,0,1},{1,0,0,0,1}};
        int[][] visitedMaze = {{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};

        Stack<Cell> path = new Stack<>();

        findPathInMaze(maze,0,0,path,4,4,visitedMaze);
        if(found){
            visitedMaze[4][4]=1;
            while (!path.isEmpty()){
                Cell cell = path.pop();
                System.out.println(cell.row +" "+cell.col);
            }
        }
    }

    private static boolean findPathInMaze(int[][] maze, int row, int col, Stack<Cell> path,int targetRow, int targetCol,int[][] visitedMaze ){

        if(found || (row == targetRow && col ==  targetCol)){
            found = true;
            return found;
        }

        if(row == maze.length || col == maze.length){
            return false;
        }

        if(maze[row][col] == 0){
            visitedMaze[row][col]=0;
            return false;
        }

        if(maze[row][col] == 1){
            visitedMaze[row][col]=1;
        }
        if(!found){
           findPathInMaze(maze,row+1,col,path,targetRow,targetCol,visitedMaze);
           findPathInMaze(maze,row,col+1,path,targetRow,targetCol,visitedMaze);
           if(row-1 >0 && visitedMaze[row-1][col] != 1) {
             findPathInMaze(maze, row - 1, col, path, targetRow, targetCol, visitedMaze);
           }
        }
        if(found){
            path.push(new Cell(row, col));
        }
        return found;

    }
}
class Cell{

    int row;
    int col;
    public Cell(int row,int col){
        this.row = row;
        this.col = col;
    }
}