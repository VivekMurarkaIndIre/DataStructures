package BTreeExercise.NodeAtKHeight;

import BTreeExercise.IsBalancedBTree.NewNode;

import java.util.Arrays;

public class AllNodeAtKHeightFromGivenNode {
    static int current=0;
    static boolean found= false;
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
        findTNode(t9,6,3);


    }

    private static int findTNode(TreeNode node, int target,int dist) {
        int k = dist;
        TreeNode foundNode = null;
        if (node == null) {
            return k;
        }
        if (node.val == target) {
            found = true;
            foundNode = node;
            findNodeAtKHeight(foundNode, k);
            return k;
        }
        if (!(found)) {
            k = findTNode(node.left, target, k);
        } else {
            if (k < 0) {
                return k;
            } else if (k == 0) {
                System.out.print(node.val + ", ");
            } else {
                k--;
                System.out.println();
                findNodeAtKHeight(node.right, k);
                return k;
            }
        }
        if (!found) {
            k = findTNode(node.right, target, k);
        } else {
            if (k < 0) {
                return k;
            } else if (k == 0) {
                System.out.print(node.val + ", ");
            } else {
                k--;
                System.out.println();
                findNodeAtKHeight(node.left, k);

            }
        }

        return k;
    }

    public static void findNodeAtKHeight(TreeNode node, int k) {
        if (node == null) {
            return ;
        }
        current++;
        if(current == k){
            System.out.print( node.val + ", ");
            current--;
            return ;
        }
        findNodeAtKHeight(node.left,k);

        findNodeAtKHeight(node.right,k);
        current--;


    }
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}