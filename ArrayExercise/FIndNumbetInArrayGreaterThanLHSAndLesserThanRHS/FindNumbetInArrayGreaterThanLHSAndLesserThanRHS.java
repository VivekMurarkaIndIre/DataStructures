package ArrayExercise.FIndNumbetInArrayGreaterThanLHSAndLesserThanRHS;

public class FindNumbetInArrayGreaterThanLHSAndLesserThanRHS {

    public static void main(String[] args) {
        int arr[]= {4,2,3,5,7,9,11,8,10};
        int i=arr.length-1,mynumber=-1,leastNumberInRHS= arr[i],greatestNumberInLHS=arr[0],j=0;
        while(i>=0){
            if(arr[i]>=greatestNumberInLHS && arr[i]<=leastNumberInRHS){
                mynumber=arr[i];
            }
            if(i>j && arr[i]<leastNumberInRHS){
                leastNumberInRHS=arr[i];
            }
            if(j<i && arr[j]>greatestNumberInLHS){
                greatestNumberInLHS=arr[j];
            }
            i--;
            j++;
        }
        System.out.println(mynumber);
    }
}
