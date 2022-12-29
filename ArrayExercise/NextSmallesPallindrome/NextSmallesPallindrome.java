package ArrayExercise.NextSmallesPallindrome;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NextSmallesPallindrome {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();

            int[] arr = createArrayForNumber(number);

            //Arrays.stream(arr).forEach(System.out::print);
            System.out.println(createNextSmallPalindrome(arr));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int createNextSmallPalindrome(int[] arr) {
        int mid,result;
        int[] finalArray;

        if (arr.length == 1) {
            mid=0;
            if(arr[mid]<9){
                arr[mid]=arr[mid]+1;
            }else{
                arr[mid]=11;
            }
            finalArray=arr;
        }else{
            if(arr.length%2==1){
                 mid= arr.length/2;
                int[] prevNumber,nextNumber;
                 if(arr[mid]<9){
                     arr[mid]=arr[mid]+1;
                     prevNumber = createArrayForNumber(createNumberFromArray(arr,mid));
                 }else{
                     arr[mid]=0;
                     prevNumber = createArrayForNumber(createNumberFromArray(arr,mid)+1);
                 }
                if(arr[mid+1]==9 && mid+1 == arr.length-1){
                    nextNumber= new int[]{1};
                }else {
                    nextNumber = reverseArray(prevNumber);
                }
                finalArray = new int[(prevNumber.length*2+1)];
                System.arraycopy(prevNumber, 0, finalArray, 0, prevNumber.length);
                finalArray[prevNumber.length]=arr[mid];
                System.arraycopy(nextNumber, 0, finalArray, prevNumber.length+1, nextNumber.length);

            }else{
                mid= arr.length/2;
                int[] prevNumber,nextNumber;
                if(arr[mid-1]<9) {
                    arr[mid-1] = arr[mid-1] + 1;
                    prevNumber = createArrayForNumber(createNumberFromArray(arr,mid-1));

                }else{
                    arr[mid-1]=0;
                    prevNumber = createArrayForNumber(createNumberFromArray(arr,mid-1)+1);

                }

                if(arr[mid]==9 && mid == arr.length-1){
                    nextNumber= new int[]{1};
                    finalArray = new int[(prevNumber.length*2+2)];
                    System.arraycopy(prevNumber, 0, finalArray, 0, prevNumber.length);
                    finalArray[prevNumber.length]=arr[mid-1];
                    System.arraycopy(nextNumber, 0, finalArray, prevNumber.length+2, nextNumber.length);
                }else {
                    arr[mid] = arr[mid-1];
                    nextNumber = reverseArray(prevNumber);
                    finalArray = new int[(prevNumber.length*2+2)];
                    System.arraycopy(prevNumber, 0, finalArray, 0, prevNumber.length);
                    finalArray[prevNumber.length]=arr[mid-1];
                    finalArray[prevNumber.length+1]=arr[mid];
                    System.arraycopy(nextNumber, 0, finalArray, prevNumber.length+2, nextNumber.length);
                }

            }
        }
        result=createNumberFromArray(finalArray,finalArray.length);
        return result;
    }

    private static int[] reverseArray(int[] array) {
        int[] arr = new int[array.length];
        for(int i=array.length-1,j=0;i>=0;i--,j++){
            arr[j]=array[i];
        }
        return arr;
    }

    private static int[] createArrayForNumber(int number) {
        int length = (int) (Math.log10(number) + 1);
        int[] arr = new int[length];
        int count=arr.length-1;
        while(number/10 >0){
             arr[count--] = number%10;
             number=number/10;
        }
        arr[count]= number;
        return arr;
    }

    private static int createNumberFromArray(int[] arr,int lastIndex) {

        int number=0;
        for(int i=0;i<lastIndex;i++){
            number= number*10 + arr[i];
        }
        return number;
    }
}
