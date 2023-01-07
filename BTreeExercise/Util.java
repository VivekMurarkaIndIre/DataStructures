package BTreeExercise;

public class Util {

    public static Node sortedArrayToBTree(int[] arr, int start, int end){

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

    public static int findHeight(Node node) {
        if (node == null) {
            return 0;
        } else{
            int lHeight = findHeight(node.getLeft());
            int rHeight= findHeight(node.getRight());
            return Math.max(lHeight,rHeight)+1;
        }
    }


}
