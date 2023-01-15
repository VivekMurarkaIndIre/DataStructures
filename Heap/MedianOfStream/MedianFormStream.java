package Heap.MedianOfStream;

import java.util.ArrayList;
import java.util.Arrays;

public class MedianFormStream {

    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 6, 8, 20, 10, 12, 19, 18};
        ArrayList<Integer> minHeap = new ArrayList<>();
        ArrayList<Integer> maxHeap = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (minHeap.isEmpty()) {
                minHeap.add(arr[i]);
            } else if (maxHeap.isEmpty()){
                maxHeap.add(arr[i]);
            }else {
                if (arr[i] < minHeap.get(0)) {
                    percolateUpMaxHeap(maxHeap, arr[i]);
                } else {
                    percolateUpMinHeap(minHeap, arr[i]);
                }

                if ((minHeap.size() - maxHeap.size()) > 1) {
                    int root = minHeap.get(0);
                    percolateDownMinHeap(minHeap);
                    percolateUpMaxHeap(maxHeap, root);
                }else if((maxHeap.size() - minHeap.size()) > 1){
                    int root = maxHeap.get(0);
                    percolateDownMaxHeap(maxHeap);
                    percolateUpMinHeap(minHeap, root);
                }
            }
            int minHeapSize= minHeap.size();
            int maxHeapSize= maxHeap.size();
            if((minHeapSize+ maxHeapSize)%2 ==1){
                System.out.println("Median = " + minHeap.get(0));
            }else{
                System.out.println("Median = " + ((minHeap.get(0)+maxHeap.get(0))/2));
            }
        }
    }



    public static void percolateUpMinHeap(ArrayList<Integer> list, int data){
        int i=  list.size()-1;
        while(i >=0){
            int parentIndex= (i-1)/2;
            if(list.get(parentIndex)> data){
                list.add(i,list.get(parentIndex));
                list.add(parentIndex,data);
            }else{
                list.add(data);
                return;
            }
            i=parentIndex;
        }
    }

    public static void percolateUpMaxHeap(ArrayList<Integer> list, int data){
        int i=  list.size()-1;
        while(i >=0){
            int parentIndex= (i-1)/2;
            if(list.get(parentIndex)< data){
                list.add(i,list.get(parentIndex));
                list.add(parentIndex,data);
            }else{
                list.add(data);
                return;
            }
            i=parentIndex;
        }
    }
    public static void percolateDownMinHeap(ArrayList<Integer> list) {
            int size = list.size(), i = 0;
            //swap root with last element
            list.add(i,list.get(size - 1));
            list.remove(size - 1);
            //now checking is min heap is satisfied
            while (i < size) {
                int leftChildIndex = (2 * i) + 1, rigthChildIndex = (2 * i) + 2, leftChild = -1, rightChild = -1;
                if (leftChildIndex < size - 1) {
                    leftChild = list.get(leftChildIndex);
                }
                if (rigthChildIndex < size - 1) {
                    rightChild = list.get(rigthChildIndex);
                }
                if (leftChild == -1) {
                    return;
                } else {
                    if (list.get(i) > leftChild || list.get(i)  > rightChild) {
                        if (rightChild == -1 || leftChild < rightChild) {
                            list.add(leftChildIndex,list.get(i));
                            list.add(i,leftChild);
                            i = leftChildIndex;
                        } else {
                            list.add(rigthChildIndex,list.get(i));
                            list.add(i,rightChild);
                            i = rigthChildIndex;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    public static void percolateDownMaxHeap(ArrayList<Integer> list) {
        int size = list.size(), i = 0;
        //swap root with last element
        list.add(i,list.get(size - 1));

        //now checking is min heap is satisfied
        while (i < size) {
            int leftChildIndex = (2 * i) + 1, rigthChildIndex = (2 * i) + 2, leftChild = -1, rightChild = -1;
            if (leftChildIndex < size - 1) {
                leftChild = list.get(leftChildIndex);
            }
            if (rigthChildIndex < size - 1) {
                rightChild = list.get(rigthChildIndex);
            }
            if (leftChild == -1) {
                return;
            } else {
                if (list.get(i) > leftChild || list.get(i)  > rightChild) {
                    if (rightChild == -1 || leftChild > rightChild) {
                        list.add(leftChildIndex,list.get(i));
                        list.add(i,leftChild);
                        i = leftChildIndex;
                    } else {
                        list.add(rigthChildIndex,list.get(i));
                        list.add(i,rightChild);
                        i = rigthChildIndex;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
