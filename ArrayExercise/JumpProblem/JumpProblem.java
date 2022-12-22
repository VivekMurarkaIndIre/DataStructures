package ArrayExercise.JumpProblem;

import java.util.Arrays;

public class JumpProblem {

    public static void main(String[] args) {

        int arr[] = {3,2,1,0,4};

        int a= arr[0],b= arr[0],jump=1;

        for(int i=1;i<arr.length;i++,a--,b--){
            if(a==0 && b==0){
                System.out.println("Jump not possible");
            }
                if(arr[i]>b){
                    b=arr[i];
                }

                if(a == 0) {
                    a = b;
                    jump++;
                }


        }
        System.out.println("Total Jump = "+jump);

    }
}
