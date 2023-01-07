package BTreeExercise.NodeAtKHeight;

import BTreeExercise.IsBalancedBTree.NewNode;

import java.util.Arrays;

public class AllNodeAtKHeightFromGivenNode {
    static int current=0;
    static boolean found= false;
    public static void main(String[] args) {
        TreeNode t7= new TreeNode(7);
        TreeNode t4= new TreeNode(4);
        TreeNode t2= new TreeNode(2);
        t2.left=t7;
        t2.right=t4;
        TreeNode t6= new TreeNode(6);
        TreeNode t0= new TreeNode(0);
        TreeNode t8= new TreeNode(8);
        TreeNode t5= new TreeNode(5);
        t5.left=t6;
        t5.right=t2;
        TreeNode t1= new TreeNode(1);
        t1.left=t0;
        t1.right=t8;
        TreeNode t3= new TreeNode(3);
        t3.left=t5;
        t3.right=t1;
        TreeNode tNode = findTNode(t3,5);

        System.out.println(found);
        if(tNode != null){
            System.out.println(found);
            findNodeAtKHeight(tNode,3);
        }
    }

    private static TreeNode findTNode(TreeNode node, int target) {
        TreeNode foundNode =null;
        if(node == null){
            return null ;
        }
        if(node.val==target){
            found=true;
            foundNode=node;
            return foundNode;
        }
        if(found == false) {
            foundNode = findTNode(node.left, target);
        }if(found == false){
            foundNode= findTNode(node.right, target);

        }
        return foundNode;
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