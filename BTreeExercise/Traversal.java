package BTreeExercise;

public class Traversal {
    public static void infixTraverse(Node node){
        if(node == null){
            return;
        }
        infixTraverse(node.getLeft());
        System.out.print(node.getValue()+", ");
        infixTraverse(node.getRight());
    }
}
