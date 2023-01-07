package BTreeExercise.NodeAtKHeight;

import BTreeExercise.IsBalancedBTree.NewNode;
import BTreeExercise.Node;
import BTreeExercise.Util;

public class NodeAtKHeight {
    static int current=0;
    public static void main(String[] args) {
        NewNode node = new NewNode(new NewNode(null,null,10),new
                NewNode(null,new NewNode(new NewNode(null,null,16), new NewNode(null,null,20),17),15),13);

        findNodeAtKHeight(node,5);
    }
    public static void findNodeAtKHeight(NewNode node,int k) {
        if (node == null) {
            return ;
        }
        current++;
        if(current == k){
            System.out.print( node.getValue() + ", ");
            current--;
            return ;
        }
        findNodeAtKHeight(node.getlNode(),k);
        findNodeAtKHeight(node.getrNode(),k);


    }

}
