package ArrayExercise.RectangleOverlap;

import java.util.Arrays;

public class RectangleOverlap {

    public static void main(String[] args) {
        int[] rect1= {0,0,2,2};
        int[] rect2={1,1,3,3};

        if(rect2[0]>=rect1[2]  || rect2[2]<=rect1[0] || rect2[1]>= rect1[3] || rect2[3]<= rect1[1]){
            System.out.println("Don't collide");
        }
        System.out.println("collide");
    }
}
