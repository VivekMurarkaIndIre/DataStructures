package ArrayExercise.SortArrayHavingThreeTypeOfIntValue;

import java.util.Arrays;

public class SortUsingCounterSort {

    public static Integer a=0,b=0,c=0;
    public static void main(String args[]) {
        int arr[] = {1, 1, 0, 2, 1, 2, 0, 2, 1, 0, 0, 2, 1, 0};
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        Arrays.stream(arr).forEach(value->{
            if(value == 0)a++;
            else if (value ==1)b++;
            else c++;
        });

        Arrays.fill(arr,0,a,0);
        Arrays.fill(arr,a,a+b,1);
        Arrays.fill(arr,a+b,a+b+c,2);

        Arrays.stream(arr).forEach(System.out::print);
    }

}
