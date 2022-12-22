package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] =  {34,2,4,99,27,63,7,11,9};
        int result[] = new int[arr.length];
        mergeSort(arr,result,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);

    }

    private static void mergeSort(int[] arr, int[] result, int low, int high) {

        if(low==high){
            return;
        }
        int mid = (low+high)/2;

        mergeSort(arr, result,low,mid);
        mergeSort(arr,result,mid+1, high);
        merge(arr,result,low,mid,high);
    }

    private static void merge(int[] arr, int[] result, int low, int mid, int high) {
        int k=low,i=low,j=mid+1;

        //in first half of result array, store the lowest elements
        while(i<=mid && j<=high){
            if(arr[i]<= arr[j]){
                result[k++]= arr[i++];
            }else{
                result[k++]= arr[j++];
            }
        }
        //copy the left item which were higher than right on the next half
        while(i<=mid){
            result[k++]= arr[i++];
        }
        //copy the right item which were higher than left on the remaining spots
        while(j<=high){
            result[k++]=arr[j++];
        }

        for(i=low;i<=high;i++){
            arr[i]=result[i];
        }
    }


}
