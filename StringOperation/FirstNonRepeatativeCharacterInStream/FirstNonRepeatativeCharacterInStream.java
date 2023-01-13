package StringOperation.FirstNonRepeatativeCharacterInStream;

import java.util.Arrays;
import java.util.Scanner;

public class FirstNonRepeatativeCharacterInStream {
    static Node head=null,tail=null;
    public static void main(String[] args) {

        System.out.println(" Enter 1 to insert in stream, 2 to get first non repetitive character and 3 to exit");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num!= 3){
            if(num == 1){
                createNode();
            }
            else if(num == 2){
                System.out.println("first non repetitive character: " + ((head!= null)?Character.toString(head.ch):"no data"));
            }

            System.out.println(" Enter 1 to insert in stream, 2 to get first non repetitive character and 3 to exit");
            num=sc.nextInt();

        }


    }

    public static void createNode(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char ch = str.charAt(0);
        if (!nodeExist(ch)) {
            Node node = new Node(ch);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
    }
    public static boolean nodeExist(char data){
        if(head != null && head.ch ==data){
            head=head.next;
            return true;
        }
        Node curr = head;
        while(curr != null && curr.next!=null){
            if(curr.next.ch == data){
                if(curr.next == tail){
                    tail=curr;
                }
                curr.next=curr.next.next;
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
}

class Node{
    Node next;
    char ch;
    Node(char ch){
        this.ch=ch;
        next=null;
    }
}
