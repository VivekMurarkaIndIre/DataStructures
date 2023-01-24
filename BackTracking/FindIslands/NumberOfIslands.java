package BackTracking.FindIslands;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Given a 2d grid map of '1's (land) and '0's (water), count the number of islands in Time Complexity O(Vertices + Edges)
public class NumberOfIslands {
    private static int count=0;
    private static int[] rows = {-1,-1,-1,0,0,1,1,1};
    private static int[] cols = {-1,0,1,-1,1,-1,0,1};
    public static void main(String[] args) {
        int[][] map = {{0, 0, 1, 1, 0}, {1, 0, 1, 1, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 1}, {1, 0, 1, 1, 0}};
        int[][] visitedMap = {{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        Queue<Cell> queue =  new LinkedList<>();
        findNumberOfIsland(map,0,0,queue,visitedMap);
        System.out.println("Total number of island " + count);

    }

    private static void findNumberOfIsland(int[][] map,int row,int col,Queue<Cell> queue,int[][] visitedMap ){

        if(row >= map.length || col >= map.length){
            return ;
        }


        if(map[row][col] == 1 && visitedMap[row][col] == 0){
            queue.add(new Cell(row, col));

            while(!queue.isEmpty()) {
                Cell currCell=  queue.poll();
                int currRow= currCell.row;
                int currCol= currCell.col;
                for (int i = 0; i < rows.length; i++) {
                    if((currRow + rows[i])>=0 && (currRow + rows[i])<map.length && (currCol + cols[i])>=0 && (currCol + cols[i])< map.length) {
                        if (map[currRow + rows[i]][currCol + cols[i]] == 1 && visitedMap[currRow + rows[i]][currCol + cols[i]] == 0) {
                            visitedMap[currRow + rows[i]][currCol + cols[i]] = 1;
                            queue.add(new Cell(currRow + rows[i], currCol + cols[i]));
                        }
                    }
                }
            }
            count++;
        }

        findNumberOfIsland(map,row,col+1,queue,visitedMap);
        findNumberOfIsland(map,row+1,col,queue,visitedMap);

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