package BTreeExercise.ReverseOrder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class ReverseOrder {

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

        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(t9);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            stack.push(node);
            if(node.right != null) {
                queue.add(node.right);
            }
            if(node.left != null) {
                queue.add(node.left);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().val+ ", ");
        }


    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
