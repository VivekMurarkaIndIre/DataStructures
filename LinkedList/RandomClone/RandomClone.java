package LinkedList.RandomClone;

import LinkedList.DoubleLinkedListNode;

public class RandomClone {

    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        Node n1= new Node(7);
        Node n2= new Node(13);
        Node n3= new Node(4);
        Node n4= new Node(2);
        Node n5= new Node(0);
        insert(n1,null);
        insert(n2,n1);
        insert(n3,n5);
        insert(n4,n3);
        insert(n5,n1);
        travers(n1);

        clone(n1);

    }

    public static void clone(Node originalNode){
        Node newHead=null, newTail=null;
        //first create a simple linked list with
        //each pointing to next element
        while(originalNode != null) {
            Node newNode = new Node(originalNode.value);
            if(newHead == null) {
                newHead = newNode;
                newTail = newNode;

            }else{
                newTail.next = newNode;
                newTail=newNode;
            }
            originalNode = originalNode.next;
        }
        //travers(newHead);
        originalNode=head;
        Node currNewNode= newHead;

        //point each original node to new nodes
        //point random of new node to original node
        while(currNewNode != null) {
            Node temp=originalNode.next;
            originalNode.next=currNewNode;
            currNewNode.random=originalNode;
            originalNode=temp;
            currNewNode= currNewNode.next;
        }

//        travers(newHead);
//
        currNewNode= newHead;
        while(currNewNode != null){
            if(currNewNode.random.random != null) {
                currNewNode.random = currNewNode.random.random.next;
            }else{
                currNewNode.random =null;
            }
            currNewNode=currNewNode.next;
        }

        travers(newHead);
    }
    public static void insert(Node node, Node random){
        node.random = random;
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next=node;
            tail=node;
        }
    }

    public static void travers(Node node){
        Node ptr= node;
        while(ptr != null ){
            System.out.println("Node value=" + ptr.value
                    +", Node random=" +(ptr.random == null?null: ptr.random.value)
            +", Node next="+(ptr.next == null? null: ptr.next.value));
            ptr = ptr.next;
        }
    }
}

class Node{
    int value;
    Node next;
    Node random;
    Node(int value){
        this.value= value;
        next=null;
        random=null;
    }
}