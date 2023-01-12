package LinkedList.MergeTwoSortedLinkedList;

import LinkedList.Node;
import LinkedList.NodeList;

import java.util.Arrays;

public class MergeTwoSortedLinkedList {

    public static Node merge(Node list1Node, Node list2Node){

        if(list1Node == null){
            return list2Node;
        }
        if(list2Node == null){
            return  list1Node;
        }
        Node temp=null;
        if(list1Node.value <= list2Node.value){
            temp=list1Node;
            list1Node=temp.next;
        }else{
            temp=list2Node;
            list2Node=temp.next;
        }
        Node headOfTempNodeList=temp;
        while(list1Node != null && list2Node != null){
            if(list1Node.value<=list2Node.value){
                temp.next=list1Node;
                temp=list1Node;
                list1Node=temp.next;
            }else{
                temp.next=list2Node;
                temp=list2Node;
                list2Node=temp.next;
            }

        }

        if(list1Node == null){
            temp.next=list2Node;
        }

        if(list2Node == null){
            temp.next=list1Node;
        }

        return headOfTempNodeList;

    }

    public static void main(String[] args) {
        NodeList list1= new NodeList();
        list1.insert(1);
        list1.insert(7);
        list1.insert(15);
        list1.insert(25);
        list1.travers();
        System.out.println();
        NodeList list2= new NodeList();
        list2.insert(3);
        list2.insert(4);
        list2.insert(5);
        list2.insert(9);
        list2.insert(11);
        list2.insert(21);
        list2.insert(23);
        list2.travers();
        System.out.println();
        Node mergeNodeListHead= merge(list1.head,list2.head);
        travers(mergeNodeListHead);

    }
    public static void travers(Node head){
        Node ptr= head;
        while(ptr.next != null){
            System.out.print(ptr.value+", ");
            ptr = ptr.next;
        }
    }
}
