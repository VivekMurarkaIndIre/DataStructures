package ArrayExercise.FindSubArrayWhoseSumIsZero;

import java.util.HashMap;
import java.util.*;
import java.util.function.Predicate;


public class FindSubArrayWhoseSumIsZero {

    public static void main(String[] args) {
        int arr[] = {6,3,-2,5,-3,7,-6,-1,4};
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int sum=0,numOfSubArray=0;

        for(int i=0;i<arr.length;i++){
            sum= sum+arr[i];
            if(map.containsKey(sum)){
                List<Integer> list= map.get(sum);
                list.add(i);
                numOfSubArray++;
            }else{
                List<Integer> list= new ArrayList<>();
                list.add(i);
                map.put(sum,list);
            }
        }

        System.out.println(numOfSubArray+1);
        Predicate<List> listSize = list -> list.size()>1;
        map.values().stream().filter(listSize).forEach(list -> list.forEach(System.out::print));



    }
}
