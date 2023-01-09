package BTreeExercise.SerializaAndDeserialize;

import BTreeExercise.Traversal;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeserialize {
    static int currIndex=-1;
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
        List<Integer> list = new ArrayList<>();
        serialize(t9,list);
        TreeNode rootNode= deSerialize(list);


    }

    public static void serialize(TreeNode node, List list){
        if(node == null){
            list.add(-1);
            return;
        }
        list.add(node.val);
        serialize(node.left,list);
        serialize(node.right,list);

    }

    private static TreeNode deSerialize(List<Integer> list) {
        currIndex++;
        if(list.get(currIndex) == -1){
            return null;
        }
        TreeNode node = new TreeNode(list.get(currIndex));
        node.left=deSerialize(list);
        node.right=deSerialize(list);
        return node;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}