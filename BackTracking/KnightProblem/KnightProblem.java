package BackTracking.KnightProblem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KnightProblem {

    static int[] row={2,2,-2,-2,1,1,-1,-1};
    static int[] col={-1,1,1,-1,2,-2,2,-2};
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out. println("Enter board size");
        int n=sc.nextInt();
        int[][]  board = new int[n][n];
        Node node = new Node(3,2,0);
        Queue<Node> trackMove = new LinkedList<>();
        trackMove.add(node);
        if(checkKnight(board ,trackMove,n,5,5)){
            System.out.println("Hop " + trackMove.poll().dist);
        }

    }

    private static boolean checkKnight(int[][]  board, Queue<Node> trackMove,int n,int targetX,int targetY){

        while (!trackMove.isEmpty()){
            if(trackMove.peek().x == targetX && trackMove.peek().y == targetY){

                return true;
            }
            Node node= trackMove.poll();

            for(int i=0;i<8;i++){
                int x = node.x+row[i];
                int y = node.x+col[i];

                if(isValid(x,y,n) && board[x][y]==0){
                    board[x][y]=1;
                    trackMove.add(new Node(x,y,node.dist+1));
                }

            }

        }
        return false;

    }
    private static boolean isValid(int x, int y,int n){
        if(x<n && x >=0 && y<n && y>=0){
            return true;
        }
        return false;
    }


}


class Node{

    int x;
    int y;
    int dist;
    Node(int x,int y,int dist){
        this.x= x;
        this.y=y;
        this.dist=dist;
    }
}
