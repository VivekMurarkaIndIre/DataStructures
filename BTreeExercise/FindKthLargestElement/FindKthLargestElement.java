package BTreeExercise.FindKthLargestElement;

import BTreeExercise.Node;
import BTreeExercise.Traversal;
import BTreeExercise.Util;

public class FindKthLargestElement {


    public static int  count=0;
    public static void main(String[] args) {

        int arr[]= {13,14,22,23,25,26,28,32,40};

        Node node= Util.sortedArrayToBTree(arr,0,arr.length-1);
        Traversal.infixTraverse(node);
        System.out.println();
        findKthlargetElement(node,3);

    }



    public static void findKthlargetElement(Node node,int k){

        if(node == null){
            return;
        }
        findKthlargetElement(node.getRight(),k);
        count= count+1;
        if(count==k){
            System.out.println(node.getValue());
        }
        findKthlargetElement(node.getLeft(),k);

    }

}
