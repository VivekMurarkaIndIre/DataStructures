package LinkedList.RearrangeLinkedList;

import LinkedList.Node;
import LinkedList.NodeList;

public class RearrangeLinkedList {

    public static void main(String[] args) {
        NodeList list= new NodeList();
        list.insert(3);
        list.insert(4);
        list.insert(5);
//        list.insert(9);
//        list.insert(11);
//        list.insert(21);
//        list.insert(23);
//        list.insert(13);
//        list.insert(17);
        rearrangeList(list.head);
        travers(list.head);
    }

    public static void rearrangeList(Node head){

        if(head.next == null || head.next.next== null){
            return;
        }
        Node temp=head.next;
        Node currNode=head;
        while(currNode.next.next != null){
            currNode=currNode.next;
        }
        head.next=currNode.next;
        currNode.next.next=temp;
        currNode.next=null;
        rearrangeList(temp);

    }

    public static void travers(Node head){
        Node ptr= head;
        while(ptr!= null){
            System.out.print(ptr.value+", ");
            ptr = ptr.next;
        }
    }
}
