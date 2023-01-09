package BTreeExercise.DiameterOfBTree;

import java.util.Arrays;

/**
 *The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * Find diameter of tree in Time Complexity O(n)
 */
public class DiameterOfBTree {

    static int maxDiameter=0;
    public static void main(String[] args) {
        TreeNode t1= new TreeNode(1);
        TreeNode t2= new TreeNode(2);
        TreeNode t3= new TreeNode(3);
        TreeNode t4= new TreeNode(4);
        TreeNode t5= new TreeNode(5);
        TreeNode t6= new TreeNode(6);
        TreeNode t7= new TreeNode(7);
        TreeNode t8= new TreeNode(8);
        TreeNode t9= new TreeNode(9);
        TreeNode t10= new TreeNode(10);
        TreeNode t13= new TreeNode(13);
        TreeNode t14= new TreeNode(14);
        t9.left=t2;
        t9.right=t10;
        t2.left=t1;
        t2.right=t6;
        t6.left=t4;
        t6.right=t7;
        t4.left=t3;
        t4.right=t5;
        t7.right=t8;
        t10.right=t14;
        t14.left=t13;

        diameterOfBTree(t9,0);
        System.out.println("diameter of Btree"+maxDiameter);
    }

    private static int diameterOfBTree(TreeNode node,int distanceFromNode) {
        if(node == null){
            return 0;
        }


        int leftMostChildDistanceFromCurrentNode= diameterOfBTree(node.left,distanceFromNode+1);
        int rightMostChildDistanceFromCurrentNode= diameterOfBTree(node.right,distanceFromNode+1);
        if(maxDiameter< (leftMostChildDistanceFromCurrentNode+rightMostChildDistanceFromCurrentNode+1)){
            maxDiameter=leftMostChildDistanceFromCurrentNode+rightMostChildDistanceFromCurrentNode+1;
        }
        return 1+Math.max(leftMostChildDistanceFromCurrentNode,rightMostChildDistanceFromCurrentNode);

    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}