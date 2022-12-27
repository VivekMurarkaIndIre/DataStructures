package ArrayExercise.FindSubArrayWhoseSumIsZero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindSubArrayOfSameSum {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,1,23,21,3,1,2,1,1,1,1,1,12,2,3,2,3,2,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,List<Integer>> zeroMap = new HashMap<>();
            int sum=0,numOfSubArray=0,target=6;
            map.put(target,0);

        for(int i=0;i<nums.length;i++) {
            if(target==0){

                    sum = sum + nums[i];
                    if (zeroMap.containsKey(sum)) {
                        List<Integer> list = zeroMap.get(sum);
                        list.add(i);
                        numOfSubArray++;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        if(nums[i]==0){
                            numOfSubArray++;
                        }
                        list.add(i);
                        zeroMap.put(sum, list);
                    }

            }else{

                if ( sum > target || (nums[i] > target )) {
                    sum = 0;
                } else if (nums[i] == target) {
                    numOfSubArray++;
                    sum = 0;
                } else {
                    sum = sum + nums[i];
                    if (sum == target) {
                        numOfSubArray++;
                        sum = 0;
                        i--;
                    }
                }
            }
        }
        if(zeroMap.containsKey(0)){
            System.out.println(zeroMap.get(0).size()+1 );
        }else {
            System.out.println(numOfSubArray);
        }
    }


}
