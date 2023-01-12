package LinkedList.Pallindrome;

import LinkedList.Node;
import LinkedList.NodeList;

import java.util.concurrent.atomic.AtomicBoolean;

public class Pallindrome {

    public static void main(String[] args) {
        NodeList list= new NodeList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(5);
        list.insert(5);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        findPallindrome(list);
    }

    public static void findPallindrome(NodeList list){


        AtomicBoolean isNodeListOdd= new AtomicBoolean(false);
        Node middleNode= findMiddle(list.head, isNodeListOdd);
        if(isNodeListOdd.get()){
            middleNode= middleNode.next;
        }

        Node revereListHead= reverse(middleNode);
        travers(revereListHead);
        compare(list.head,revereListHead);

    }

    public static Node findMiddle(Node head, AtomicBoolean odd){
        Node prev=null;
        Node slow = head, fast = head;
        while(fast!= null && fast.next != null){
            prev= slow;
            slow=slow.next;
            fast= fast.next.next;
        }
        if(fast != null){
            odd.set(true);
        }
        prev.next=null;
        return slow;
    }

    public static Node reverse(Node head){
        if (head == null || head.next == null)
            return head;

        Node rest = reverse(head.next);
        head.next.next = head;

        head.next = null;
        return rest;

    }

    public static void compare(Node head, Node reverseListHead){
        if(head == null && reverseListHead == null){
            System.out.println("is a pallindrom");
            return;
        }
        while(head != null && reverseListHead != null){
            if (head.value != reverseListHead.value) {
                System.out.println("is not a pallindrom");
                return;
            }
            head= head.next;
            reverseListHead= reverseListHead.next;
        }
        System.out.println("is a pallindrom");

    }
    public static void travers(Node head){
        Node ptr= head;
        while(ptr.next != null){
            System.out.print(ptr.value+", ");
            ptr = ptr.next;
        }
    }
}
