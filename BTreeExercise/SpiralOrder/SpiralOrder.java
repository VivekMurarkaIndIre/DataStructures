package BTreeExercise.SpiralOrder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralOrder {
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
        Stack<TreeNode> stack1=  new Stack<>();
        Stack<TreeNode> stack2=  new Stack<>();
        stack1.add(t9);
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            while(!stack1.isEmpty()){
                TreeNode node = stack1.pop();
                System.out.print(node.val + ", ");
                if(node.right!= null) {
                    stack2.push(node.right);
                }
                if(node.left!= null) {
                    stack2.push(node.left);
                }
            }
            while (!stack2.isEmpty()){
                TreeNode node = stack2.pop();
                System.out.print(node.val + ", ");
                if(node.left!= null) {
                    stack1.push(node.left);
                }
                if(node.right!= null) {
                    stack1.push(node.right);
                }
            }

        }
    }


}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}