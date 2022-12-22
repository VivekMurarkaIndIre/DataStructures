package ArrayExercise.FIndNumerberInSortedArray;

import java.util.Arrays;

public class FindNumberInSortedArray {

    public static void main(String[] args) {
        int arr[] = {44,47,50,52,57,3,7,32,37,40};
        int arr1[] = {3,4,5,6,7,8,9,10,1,2};
        findMyNumber(arr1,1,0,arr.length-1);
    }

    private static void findMyNumber(int[] arr, int num, int low, int high) {
        int mid= (low+high)/2;
        if(arr[mid]== num){
            System.out.println("index= "+ mid);
            return;
        }
        if(arr[mid]>num){
            if(arr[low]>num) {
                findMyNumber(arr, num, mid+1, high);
            }else {
                findMyNumber(arr, num, low, mid);
            };
        }else if(arr[mid]<num){
            if(arr[low]<num) {
                findMyNumber(arr, num, mid+1, high);
            }else {
                findMyNumber(arr, num, low, mid);
            }
        }


    }
}
