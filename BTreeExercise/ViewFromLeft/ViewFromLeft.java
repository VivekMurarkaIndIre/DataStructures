package BTreeExercise.ViewFromLeft;

import java.util.*;
public class ViewFromLeft {

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
        HashMap<Integer,TreeNode> map = new HashMap<>();
        leftView(map,t9,0);
        map.entrySet().stream().forEach(k -> System.out.print(k.getValue().val+", "));
    }

    public static void leftView(HashMap map, TreeNode node,int level){
        if(node == null){
            return;
        }

        if(!map.containsKey(level)){
            map.put(level,node);
        }
        leftView(map,node.left,level+1);
        leftView(map,node.right,level+1);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}