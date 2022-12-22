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
        //Check if the number is in middle
        if(arr[mid]== num){
            System.out.println("index= "+ mid);
            return;
        }

        //Try to find if number in middle is greater than given number
        //if greater than there are two possibility
        if(arr[mid]>num){
            //first: if the low is also greater than number, that means the given number can't be
            //in between of low and middle
            if(arr[low]>num) {
                findMyNumber(arr, num, mid+1, high);
            }else {
                //Second: the number is in between low and middle
                findMyNumber(arr, num, low, mid);
            };
        }else if(arr[mid]<num){
            //if the middle is less than number the number can still be
            //found at any half
            if(arr[low]<num) {
                //if the low is less then the number has to be on other half
                //as array are not rotated from this middle point and is still increasing
                findMyNumber(arr, num, mid+1, high);
            }else {
                //if the low is high, that means array is rotated before mid
                //and number is between low and mid
                findMyNumber(arr, num, low, mid);
            }
        }


    }
}
