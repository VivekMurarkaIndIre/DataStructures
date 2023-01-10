package LinkedList;

public class NodeList {

    public Node head = null;
    public Node tail = null;

    public static void main(String[] args) {
        NodeList list = new NodeList();
        list.insert(10);
    }

    public void travers(){
        Node ptr= head;
        while(ptr != tail){
            System.out.println(ptr.value+", ");
            ptr = ptr.next;
        }
    }

    public void  insert(int data){
        Node newNode= new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public Node search(int value){
        Node ptr= head;
        while(ptr!= null){
            if(ptr.value == value){
                return ptr;
            }
            ptr= ptr.next;
        }
        return null;
    }

    public void delete(Node node, int elementToDelete){
        Node ptr= head, prev = null;

        //if element is head
        if(head.value == elementToDelete){
            head= head.next;
            return;
        }
        while(ptr != tail ) {
            if (ptr.value == elementToDelete) {
                prev.next = ptr.next;
                return;
            }
            prev = ptr;
            ptr = ptr.next;
        }
        //handle tail
        if(tail.value == elementToDelete){
            prev.next=null;
            tail=prev;
        }
    }
}
