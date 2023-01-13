package LinkedList.ReverseInKGroup;

import LinkedList.Node;
import LinkedList.NodeList;

import java.util.Arrays;

public class ReverseInKGroup {

    public static void main(String[] args) {
        NodeList list= new NodeList();
        list.insert(3);
        list.insert(4);
//        list.insert(5);
//        list.insert(9);
//        list.insert(11);
//        list.insert(21);
//        list.insert(23);
//        list.insert(13);
//        list.insert(17);
        //list.travers();
        travers(list.head);
        System.out.println();
        //Node node= reverseNode(list.head);
        //travers(node);
        Node newHead= reverseInKGroup(list.head,3);
        travers(newHead);

    }
    public static void travers(Node head){
        Node ptr= head;
        while(ptr!= null){
            System.out.print(ptr.value+", ");
            ptr = ptr.next;
        }
    }

    public static Node reverseInKGroup(Node node, int k){
        if(node == null){
            return node;
        }
        Node currNode= node,start=null,nextStart=null,prevTail=null,newHead=null;
        int count=1;
        while(currNode != null){
            if(count%k ==1){
                start= currNode;
            }
            if(count%k == 0){
                Node temp=currNode.next;
                currNode.next=null;
                nextStart=reverseNode(start);
                if(prevTail != null){
                    prevTail.next=nextStart;
                }else{
                    newHead=nextStart;
                }
                prevTail=start;
                currNode=temp;
                count++;
            }else {
                count++;
                currNode = currNode.next;
            }

        }
        return newHead;
    }

    public static Node reverseNode(Node start){
        if(start == null ||start.next ==  null){
            return start;
        }
        Node node= reverseNode(start.next);
        start.next.next=start;
        start.next=null;
        return node;
    }


}
