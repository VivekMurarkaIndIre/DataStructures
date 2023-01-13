package LinkedList.LeastRecentlyUsed;
import java.util.*;


public class LeastRecentlyUsed {
    static Node<Integer,Integer> head,tail,prev,next;
    public static void main(String[] args) {

        HashMap<Integer,Node<Integer,Integer>> cache= new HashMap<>();
        insertInCache(cache,1,10);
        insertInCache(cache,2,20);
        insertInCache(cache,3,30);
        insertInCache(cache,4,40);
        System.out.println("Least recent value= "+ head.value);
        System.out.println("Most recent value= "+ tail.value);
        int value= getFromCache(cache,2);
        System.out.println("value= "+ value);
        System.out.println("Least recent value= "+ head.value);
        System.out.println("Most recent value= "+ tail.value);

        insertInCache(cache,5,50);
        System.out.println("Least recent value= "+ head.value);
        System.out.println("Most recent value= "+ tail.value);


    }

    public static void insertInCache(HashMap<Integer,Node<Integer,Integer>> cache,int key, int value){
        if(cache.keySet().size() == 3){
            cache.remove(head.key);
            head=head.next;
            head.prev=null;

        }
        Node<Integer,Integer> node= new Node<>(prev,next,key,value);
        if(head == null){
            head = node;
            tail= node;
        }else{
            node.prev=tail;
            tail.next=node;
            node.next=null;
            tail=node;
       }
        cache.put(node.key,node);
        key++;
    }

    public static int getFromCache(HashMap<Integer,Node<Integer,Integer>> cache,int key){
        Node<Integer,Integer> node = cache.get(key);
        if(node == null){
            return -1;
        }
        if(node == tail){
            //do nothing
        }else if(node == head)  {
            head=node.next;
            tail.next=node;
            node.prev=tail;
            node.next=null;
            tail=node;

        }else{
            node.prev.next =tail;
            node.next.prev= head;
            tail.next=node;
            node.prev=tail;
            node.next=null;
            tail=node;
        }
        return node.value;
    }
}

class Node<K,V>{
    Node<K,V> prev;
    Node<K,V> next;
    K key;
    V value;
    public Node(Node<K,V> prev,Node<K,V> next, K key,V value){
        this.prev=prev;
        this.next=next;
        this.key=key;
        this.value=value;
    }
}
