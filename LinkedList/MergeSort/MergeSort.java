package LinkedList.MergeSort;

import LinkedList.Node;
import LinkedList.NodeList;

public class MergeSort {

    public static void main(String[] args) {
        NodeList list= new NodeList();
        list.insert(5);
        list.insert(4);
        list.insert(7);
        list.insert(25);
        list.insert(13);
        list.insert(9);
        list.insert(2);
        list.insert(1);
        travers(list.head);
        Node result= null;
        Node sortedList = mergeSort(list.head,result);
        System.out.println();
        travers(sortedList);
    }

    public static Node mergeSort(Node node,Node result){
        if(node== null || node.next == null){
            return node;
        }
        Node midNode= findMiddle(node);
        System.out.println();
        travers(node);
        System.out.println();
        travers(midNode);
        Node firstNode= mergeSort(node,result);
        Node secondNode= mergeSort(midNode,result);
        Node sortedList= merge(firstNode,secondNode);

        return sortedList;
    }


    public static Node merge(Node node,Node midNode){
        Node temp=null;

        if(node.value <= midNode.value){
            temp=node;
            node=temp.next;
        }else{
            temp=midNode;
            midNode=temp.next;
        }
        Node headOfTempNodeList=temp;
        while(node != null && midNode != null){
            if(node.value<=midNode.value){
                temp.next=node;
                temp=node;
                node=temp.next;
            }else{
                temp.next = midNode;
                temp=midNode;
                midNode= temp.next;
            }
        }

        if(node != null){
            temp.next=node;
        }

        if(midNode != null){
            temp.next=midNode;
        }
        return headOfTempNodeList;

    }

    public static Node findMiddle(Node node){
        Node prev=null;
        Node fast=node,slow=node;

        while(fast != null && fast.next!= null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    public static void travers(Node head){
        Node ptr= head;
        while(ptr != null){
            System.out.print(ptr.value+", ");
            ptr = ptr.next;
        }
    }

}
