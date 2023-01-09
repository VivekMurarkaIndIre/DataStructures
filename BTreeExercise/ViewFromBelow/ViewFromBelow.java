package BTreeExercise.ViewFromBelow;

import java.util.*;
public class ViewFromBelow {

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
        HashMap<Integer,NodeLevel> map = new HashMap<>();
        belowView(map,t9,0,0);

        map.entrySet().stream().forEach(k-> System.out.println(k.getValue().value));

    }

    public static void belowView(HashMap<Integer,NodeLevel> map, TreeNode node, int level,int horizontalDistance){
        if(node == null){
            return;
        }
        if(!map.containsKey(horizontalDistance)){
           NodeLevel obj = new NodeLevel(node.val,level);
           map.put(horizontalDistance,obj);
        } else if (map.get(horizontalDistance).level < level){
            map.get(horizontalDistance).value=node.val;
            map.get(horizontalDistance).level=level;
        }
        belowView(map,node.left,level+1,horizontalDistance-1);
        belowView(map,node.right,level+1,horizontalDistance+1);

    }
}

class NodeLevel{
    int value;
    int level;
    NodeLevel(int value, int level){
        this.value=value;
        this.level=level;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}