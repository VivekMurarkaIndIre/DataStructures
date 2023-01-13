package Heap.MinHeap;
import java.util.*;

/**
 * Parent element is smaller than both its child in binary tree
 * Heap is represented as array
 */
public class MinHeap {

    public static void main(String[] args) {
        //given a min heap
        int[] arr = {3,5,9,6,8,20,10,12,19,18};
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert element");
        int element= sc.nextInt();

        percolateUp(arr,element);
        System.out.println("Balanced Heap");
        Arrays.stream(arr).forEach(x -> System.out.print(x+", "));
        System.out.println("Balanced heap after Extracting Root");
        percolateDown(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x+", "));
    }
    //process of inserting an element in heap is Percolate up
    public static void percolateUp(int[] arr,int data){
        int i= arr.length-1;
        while(i !=0){
            int parentIndex= (i-1)/2;
            if(arr[parentIndex]> data){
                arr[i]=arr[parentIndex];
                arr[parentIndex]=data;
            }else{
                arr[i+1]=data;
                return;
            }
            i=parentIndex;
        }
    }
    //process of extracting root element is called percolate down
    public static void percolateDown(int[] arr){
        int size= arr.length,i=0;
        //swap root with last element
        int temp = arr[i];
        arr[i]=arr[size-1];
        arr[size-1]=temp;
        //now checking is min heap is satisfied
        while(i<size) {
            int leftChildIndex = (2 * i) + 1, rigthChildIndex = (2 * i) + 2, leftChild = -1, rightChild = -1;
            if (leftChildIndex < size - 1) {
                leftChild = arr[leftChildIndex];
            }
            if (rigthChildIndex < size - 1) {
                rightChild = arr[rigthChildIndex];
            }
            if (leftChild == -1) {
                return;
            } else {
                if (arr[i] > leftChild || arr[i] > rightChild) {
                    if (rightChild== -1 || leftChild < rightChild) {
                        arr[leftChildIndex] = arr[i];
                        arr[i] = leftChild;
                        i = leftChildIndex;
                    } else {
                        arr[rigthChildIndex] = arr[i];
                        arr[i] = rightChild;
                        i = rigthChildIndex;
                    }
                } else {
                    return;
                }
            }
        }

    }
}
