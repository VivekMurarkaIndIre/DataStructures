package BTreeExercise.Traversal;

import java.util.*;

public class FindKthLargestElement {


    public static int  count=0;
    public static void main(String[] args) {

        int arr[]= {13,14,22,23,25,26,28,32,40};


        //Arrays.stream(arr).forEach(System.out::print);
        FindKthLargestElement t = new FindKthLargestElement();


        Node node= t.sortedArrayToBTree(arr,0,arr.length-1);
        infixTraverse(node);
        System.out.println();
        findKthlargetElement(node,3);




    }

    public Node sortedArrayToBTree(int[] arr, int start, int end){

        if(start>end){
            return null;
        }
        int mid= (start+end)/2;
        Node node = new Node();
        node.setValue(arr[mid]);
        node.setLeft(sortedArrayToBTree(arr,start,mid-1));
        node.setRight(sortedArrayToBTree(arr,mid+1,end));
        return node;
    }

    public static void infixTraverse(Node node){
        if(node == null){
            return;
        }
        infixTraverse(node.getLeft());
        System.out.print(node.getValue()+", ");
        infixTraverse(node.getRight());
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
    class Node{

        Node left;
        Node right;

        int value;
        public Node(){

        }

        public Node getLeft(){
            return left;
        }

        public Node getRight(){
            return right;
        }

        public int getValue(){
            return value;
        }

       public Node(Node left, Node right, int value){
            this.left = left;
            this.right = right;
            this.value=value;
        }
        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
