package HashMap.FindQuadRuplets;

import java.util.HashMap;
import java.util.*;
public class FindQuadRuplets {

    public static void main(String[] args) {
        int[] arr= {1,5,1,0,6,0};
        findQuadRuplets(arr,7);
    }

   public static void findQuadRuplets(int[] arr,int target){
        int size = arr.length;
        HashMap<Integer,ArrayList<Point>> map= new HashMap<>();
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                int val= target - (arr[i]+arr[j]);
                if(map.containsKey(val)){
                    {
                        for(Point point: map.get(val)){
                            int x= point.x;
                            int y=point.y;
                            if(x!=i && x!=j && y!=i && y!=j){
                                System.out.println("Found quadruplets: " +x+", "+y+", "+i+", "+j);
                            }
                        }
                    }
                }
                map.put(arr[i]+arr[j],new ArrayList<>());
                map.get(arr[i]+arr[j]).add(new Point(i,j));
            }
        }
   }
}

class Point{
    int x,y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}