package BTreeExercise.PrintBoundaryNodes;



public class PrintBoundaryNodes {

   static TreeNode rootNode;
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


        findBoundaryNode(t9,0);



    }

    private static void findBoundaryNode(TreeNode node,int num) {

        if(node == null){
            return ;
        }
        if(num == 0){
             System.out.print(node.val+", ");
             findBoundaryNode(node.left,1);
             printLeafNode(node);
             findBoundaryNode(node.right,2);
        }else if(num==1){
            //first left boundary

            if(node.left != null){
                 System.out.print(node.val+", ");
                 findBoundaryNode(node.left,1);
            }else if(node.right != null) {
                 System.out.print(node.val+", ");
                 findBoundaryNode(node.right,1);
            }

        } else if (num ==2) {
            //Now Right boundary

            if(node.right != null){
                 System.out.print(node.val+", ");
                 findBoundaryNode(node.right,2);
            }else if(node.left != null){
                 System.out.print(node.val+", ");
                 findBoundaryNode(node.left,2);
            }

        }

    }

    private static void printLeafNode(TreeNode node) {
        if(node == null){
            return;
        }
        printLeafNode(node.left);
        if(node.left == null && node.right== null) {
            System.out.print(node.val+", ");
        }
        printLeafNode(node.right);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
