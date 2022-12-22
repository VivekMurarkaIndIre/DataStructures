package ArrayExercise.SortArrayHavingThreeTypeOfIntValue;

import java.util.Arrays;

public class SortingWithoutUsingCounter {

    public static void main(String[] args) {
        Integer arr[] = {1, 1, 0, 2, 1, 2, 0, 2, 1, 0, 0, 2, 1, 0};
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]== 2){
                //swap to bring 2 in high
                swap(arr,mid,high);
                high--;
            }else if(arr[mid]==0){
                //Swap to bring 0 in low
                swap(arr,low,mid);
                mid++;
                low++;
            }else{
                //No Swap as 1 is in middle
                mid++;
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static final <T> void swap(T[]a,int i,int j ){
        T t= a[i];
        a[i]=a[j];
        a[j]= t;
    }
}
