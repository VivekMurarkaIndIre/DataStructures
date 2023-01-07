package BTreeExercise.ToDoubleLinkedList;


import BTreeExercise.Node;
import BTreeExercise.Traversal;
import BTreeExercise.Util;

public class BTreeToDoubleLinekedList {
    private static   boolean rootOfLinkedList=true;
    private static Node parent;
    private static Node start;
    public static void main(String[] args) {

        int arr[]= {13,14,22,23,25,26,28,32,40};

        Node node= Util.sortedArrayToBTree(arr,0,arr.length-1);

        toDoubleLinedList(node);

        while (start.getRight() != null) {
            System.out.print(start.getValue()+", ");

        }
    }

    private static void toDoubleLinedList(Node node){
        if(node == null){
            return ;
        }
        toDoubleLinedList(node.getLeft());

        if(rootOfLinkedList){
            parent = node;
            start=parent;
            rootOfLinkedList=false;
        }else{
            node.setLeft(parent);
            parent.setRight(node);
            parent = node;
        }
        toDoubleLinedList(node.getRight());
    }

}
