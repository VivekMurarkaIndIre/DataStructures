package ArrayExercise.Freuqency;

import java.util.Arrays;

public class FrequencyOfEachElement {

    public static void main(String[] args) {

        int[] arr = {5,2,7,7,5,5,2};

        for(int i=0;i<arr.length;i++){

            if(arr[i]<arr.length) {
                int indexOfElement = arr[i] - 1;
                arr[indexOfElement] = arr[indexOfElement] + arr.length;
            }else{
                int originalElement = (arr[i]-1)%arr.length;
                arr[originalElement]= arr[originalElement]+arr.length;
            }
        }

        Arrays.stream(arr).forEach(value -> System.out.print((value-1)/arr.length+","));
    }
}
