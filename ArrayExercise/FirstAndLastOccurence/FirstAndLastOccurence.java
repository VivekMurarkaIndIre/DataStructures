package ArrayExercise.FirstAndLastOccurence;

import java.util.Arrays;

public class FirstAndLastOccurence {

    public static void main(String[] args) {
        int result[]={-1,-1};
        //int[] nums = {5,7,7,8,8,10};
        //int[] nums={5,7,7,8,8,10};
        int[] nums={1,2,2};
        if(nums.length>0){
            binarySearch(nums,0,nums.length,2,result);
        }
        Arrays.stream(result).forEach(System.out::print);
    }

    public static void binarySearch(int[] nums, int start,int end,int target,int[] result){
        int mid = ((start+end)/2);
        if(nums[mid] == target){
            int backIndex = mid;
            int forwardIndex = mid;
            result[0]=mid;
            result[1]=mid;
            while( backIndex>=0 && nums[backIndex]==target){
                result[0]=backIndex;
                backIndex--;
            }
            while(forwardIndex <=nums.length-1 &&  nums[forwardIndex]==target){
                result[1]=forwardIndex;
                forwardIndex++;
            }
            return;

        }
        if(nums[mid]>target && start<mid){
            binarySearch(nums,start,mid,target,result);
        }
        if(nums[mid]<target && mid+1 <end ){
            binarySearch(nums,mid+1,end,target,result);
        }

    }
}
