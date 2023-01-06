package ArrayExercise.FindKthSmallestNumber;

import java.util.*;
public class FindKthSmallestNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= in.nextInt();
        System.out.println("Enter array");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= in.nextInt();
        }

        findKthSmallestNumber(arr,2);

    }

    private static void findKthSmallestNumber(int[] arr, int k) {

        int pivotIndex= arr.length-1, swapIndex=-1;
        for(int i=1;i<= k;i++){
            int pivot = arr[pivotIndex];
            int j=0;
            swapIndex=-1;
            while(j<=pivotIndex){
                if(arr[j]>pivot){
                    swapIndex=j;

                }else {
                    if(swapIndex!= -1 && arr[j]<=pivot){
                        int temp=arr[j];
                        arr[j]=arr[swapIndex];
                        arr[swapIndex]=temp;
                        swapIndex=j;

                    }
                }
                j++;
            }
            pivotIndex=swapIndex;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

}
