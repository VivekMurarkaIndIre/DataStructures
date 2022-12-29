package ArrayExercise.FindSubArrayOfHighestSum;

import java.util.*;

public class FindSubArrayOfHighestSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= in.nextInt();
        System.out.println("Enter array");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= in.nextInt();
        }

        findSubArrayWithHighestSum(arr);
    }
    public static void findSubArrayWithHighestSum(int[] nums){
        int higestSum=-1,sum=0,lastHighestIndex =-1,countOfNumberForHighestIndex=0,currentSumIndexCounter=0,currenEndIndex=-1;

        for(int i=0;i<nums.length;i++){
            if((nums[i]+sum)>=0){
                sum=sum+ nums[i];
                currentSumIndexCounter++;
                currenEndIndex=i;
                if(higestSum<sum){
                    higestSum=sum;
                    lastHighestIndex=currenEndIndex;
                    countOfNumberForHighestIndex=currentSumIndexCounter;
                }
            }else{
                sum=0;
                currentSumIndexCounter=0;
                currenEndIndex=-1;
            }
        }
        System.out.println("sub array start index= "
                +((countOfNumberForHighestIndex==1)? (lastHighestIndex+1): (lastHighestIndex+2-countOfNumberForHighestIndex)  )
               +"end index: " +(lastHighestIndex+1) );



    }
}
