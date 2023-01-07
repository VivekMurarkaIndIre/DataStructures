package BTreeExercise.IsBalancedBTree;

public class NewNode {
    NewNode lNode;
    NewNode rNode;
    int value;

   public NewNode(NewNode lNode, NewNode rNode, int value) {
        this.lNode = lNode;
        this.rNode = rNode;
        this.value = value;
    }

    public NewNode getlNode() {
        return lNode;
    }

    public NewNode getrNode() {
        return rNode;
    }

    public int getValue() {
        return value;
    }
}
