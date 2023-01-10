package BTreeExercise.MaxPathSum;

import java.util.Arrays;

public class MaxPathSum {
    static int maxSum=0;
    public static void main(String[] args) {
        TreeNode t15= new TreeNode(15);
        TreeNode t2= new TreeNode(2);
        TreeNode t3= new TreeNode(3);
        TreeNode tN4= new TreeNode(-4);
        TreeNode tN25= new TreeNode(-25);
        TreeNode tN6= new TreeNode(-6);
        TreeNode tN22= new TreeNode(-22);
        TreeNode t28= new TreeNode(28);
        TreeNode t10= new TreeNode(10);
        TreeNode t4= new TreeNode(4);
        t10.left=t2;
        t10.right=t15;
        t2.left=tN4;
        t2.right=tN6;
        tN4.left=t28;
        tN4.right=tN22;
        t15.right=tN25;
        tN25.left=t3;
        tN25.right=t4;

        maxPathSum(t10);
        System.out.println("Max path sum" + maxSum);
    }

    public static int maxPathSum(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftSum = maxPathSum(node.left);
        int rightSum=maxPathSum(node.right);

        int sum = leftSum + rightSum+ node.val;
        if(maxSum<sum){
            maxSum = sum;
        }
        int maxAmongLeftAndRight= Math.max(leftSum,rightSum);
        return Math.max(node.val, node.val+maxAmongLeftAndRight);

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}