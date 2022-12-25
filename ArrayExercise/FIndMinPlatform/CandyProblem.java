package ArrayExercise.FIndMinPlatform;

import java.util.Arrays;

public class CandyProblem {

    public static void main(String[] args) {
        int[] ratings = {1,2,2};
        int totalCandy=0,i;
        int length = ratings.length;

        int[] leftArray = new int[length];
        Arrays.fill(leftArray,1);
        int[] rightArray =  new int[length];
        Arrays.fill(rightArray,1);
        for(i=1;i<length;i++) {
            if (ratings[i] > ratings[i - 1]) {
                leftArray[i] = leftArray[i - 1] + 1;
            }
        }
        for(i=length-2;i>=0;i--) {
            if (ratings[i] > ratings[i +1]) {
                rightArray[i] = rightArray[i + 1] + 1;
            }
        }
        for(i=0;i<length;i++) {
            totalCandy+=Math.max(leftArray[i],rightArray[i]);
        }

        System.out.println(totalCandy);

    }
}
