package BTreeExercise.MirrorImage;


import java.util.*;

public class MirrorImage {

    public static void main(String[] args) {

        NaryTree lN1= new NaryTree(1);
        NaryTree lN2= new NaryTree(2);
        NaryTree lN3= new NaryTree(3);
        NaryTree lN4= new NaryTree(4);
        NaryTree lN5= new NaryTree(5);
        NaryTree lN6= new NaryTree(6);
        NaryTree lN7= new NaryTree(7);
        lN1.childern.add(lN2);
        lN1.childern.add(lN3);
        lN2.childern.add(lN4);
        lN3.childern.add(lN5);
        lN3.childern.add(lN6);
        lN3.childern.add(lN7);

        NaryTree rN1= new NaryTree(1);
        NaryTree rN2= new NaryTree(2);
        NaryTree rN3= new NaryTree(3);
        NaryTree rN4= new NaryTree(4);
        NaryTree rN5= new NaryTree(5);
        NaryTree rN6= new NaryTree(6);
        NaryTree rN7= new NaryTree(7);
        rN1.childern.add(rN3);
        rN1.childern.add(rN2);
        rN3.childern.add(rN7);
        rN3.childern.add(rN6);
        rN3.childern.add(rN5);
        rN2.childern.add(rN4);

        Stack<NaryTree> stack = new Stack<>();
        createStackForLeftTree(lN1,stack);

        Queue<NaryTree> queue= new LinkedList<>();
        createQueueForRightTree(rN1,queue);

        compareMirror(stack,queue);

    }

    public static void createStackForLeftTree(NaryTree node, Stack stack){
        if(node == null){
            return;
        }
        stack.push(node.value);
        for(int i=0;i<node.childern.size();i++){
            createStackForLeftTree(node.childern.get(i),stack);
        }
    }

    public static void createQueueForRightTree(NaryTree node,Queue queue){
        if(node == null){
            return;
        }
        for(int i=0;i<node.childern.size();i++){
            createQueueForRightTree(node.childern.get(i),queue);
        }
        queue.add(node.value);
    }

    public static void compareMirror(Stack stack, Queue queue){
        if(stack.size() != queue.size()){
            System.out.println("Not mirror");
            return;
        }
        while(!stack.isEmpty()){
            if(stack.pop() != queue.poll()){
                System.out.println("Not mirror");
                return;
            }
        }
        System.out.println("Is mirror");
    }

}

class NaryTree{
    int value;
    ArrayList<NaryTree> childern;
    public NaryTree(int value){
        this.value=value;
        this.childern=new ArrayList<>();
    }

}
