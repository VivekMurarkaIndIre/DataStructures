package BTreeExercise.DeleteNode;

public class DeleteNode {
    static boolean found=false;
    
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
        infixTraverse(t9);
        System.out.println();
        deleteNode(t9,6);
        infixTraverse(t9);

    }
    public static void infixTraverse(TreeNode node){
        if(node == null){
            return;
        }
        infixTraverse(node.left);
        System.out.print(node.val+", ");
        infixTraverse(node.right);
    }

    private static void deleteNode(TreeNode t9, int deleteValue) {
       TreeNode node= findTNode(t9,deleteValue);
       if(node != null){
           TreeNode rightMostNode= findTheRightMostChildNode(node);
           if(rightMostNode == node){
               node = null;
           }else{
               node.val=rightMostNode.val;
           }
       }

    }

    private static TreeNode findTheRightMostChildNode(TreeNode node) {
        TreeNode foundNode =null;
        if(node == null){
            return null;
        }
        if(node.right!=null){
           foundNode= findTheRightMostChildNode(node.right);
        }
        if(node.right==null && node.left == null){
            foundNode= node;
            //how to delete this node
            node=null;

        }else if(node.right==null && node.left != null){
            foundNode=node;
            node.val= node.left.val;
            node.left=null;
        }
        return foundNode;
    }

    private static TreeNode findTNode(TreeNode node, int target) {
        TreeNode foundNode =null;
        if(node == null){
            return null ;
        }
        if(node.val==target){
            found=true;
            foundNode=node;
            return foundNode;
        }
        if(found == false) {
            foundNode = findTNode(node.left, target);
        }if(found == false){
            foundNode= findTNode(node.right, target);

        }
        return foundNode;
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}