package ArrayExercise.FIndNextImmediateHigherNumber;

import java.util.Arrays;

public class FindNextImmediateHighestNumber {

    public static void main(String[] args) {
        Integer arr[] = {2,1,8,7,6,5};
        int  i=arr.length-1;
        int pos=-1, nextHigherNumber=arr[i],nextHigherNumberPos=i;
        while(i>=0) {
            if (arr[i] < nextHigherNumber) {
                nextHigherNumber = arr[i];
                nextHigherNumberPos = i;
            }
            if (arr[i] > arr[i - 1]) {
                pos = i - 1;
                break;
            }
            i--;
        }
        swap(arr, pos,nextHigherNumberPos );
        Arrays.sort(arr,pos+1,arr.length);

        Arrays.stream(arr).forEach(System.out::print);
    }
    public static <T> void swap(T[] arr, int x, int y ){
        T tmp = arr[x];
        arr[x]= arr[y];
        arr[y]= tmp;
    }




}
