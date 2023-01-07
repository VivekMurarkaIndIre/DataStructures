package BTreeExercise;

public class Node{

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
