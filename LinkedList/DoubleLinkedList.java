package LinkedList;

public class DoubleLinkedList {

    DoubleLinkedListNode head=null,tail = null;

    public void insert(int data){
        DoubleLinkedListNode node = new DoubleLinkedListNode(data);
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.prev=tail;
            tail.next= node;
            node.next=null;
            tail=node;
        }
    }

    public void traverse(){
        if(head == null){
            return;
        }
        DoubleLinkedListNode currNode= head;
        while(currNode!= tail){
            System.out.println(currNode.value+", ");
            currNode=currNode.next;
        }

        System.out.println(tail.value+", ");
    }

    public void delete(int data){
        if(head == null){
            return;
        }
        DoubleLinkedListNode currNode= head;

        if(currNode.value == data){
            if(head == tail){
                head=null;
                tail=null;
                return;
            }
            head=currNode.next;
            head.prev=null;
            return;
        }
        currNode=currNode.next;
        while(currNode!= tail){
            if(currNode.value==data){
                currNode.prev.next=currNode.next;
                currNode.next.prev=currNode.prev;
                currNode=null;
                return;
            }
            currNode=currNode.next;
        }

        if(currNode ==tail && currNode.value == data){
            currNode.prev.next=null;
            tail=currNode.prev;
            currNode=null;
        }
    }
}
