package BTreeExercise.IsBalancedBTree;

import BTreeExercise.Node;
import BTreeExercise.Util;

import java.util.Arrays;

public class IsBalancedBTree {

    public static int currentHeight=0;
    public static void main(String[] args) {
        NewNode node = new NewNode(new NewNode(null,null,10),new
                NewNode(null,new NewNode(null, new NewNode(null,null,20),17),15),13);

        System.out.println("Height of BTree = " +  findHeight(node));
        System.out.println("Is BTree balanced ? " +  isTreeBalanced(node));
    }

    public static int findHeight(NewNode node) {
        if (node == null) {
            return 0;
        } else{
            int lHeight = findHeight(node.getlNode());
            int rHeight= findHeight(node.getrNode());
            return Math.max(lHeight,rHeight)+1;
        }
    }
    public static boolean isTreeBalanced(NewNode node){
        int left, right;
        if(node == null){
            return true;
        }
        left=findHeight(node.getlNode());
        right=findHeight(node.getrNode());
        if((Math.abs(left-right)<=1) && isTreeBalanced(node.getlNode()) && isTreeBalanced(node.getrNode())){
            return true;
        }
        return false;
    }
}

