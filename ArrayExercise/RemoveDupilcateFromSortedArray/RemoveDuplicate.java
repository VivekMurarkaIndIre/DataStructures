package ArrayExercise.RemoveDupilcateFromSortedArray;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,3,6,6,7,8,8,8,9,9};
        int a=arr[0],len=1,j=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> a){
                a=arr[i];
                len++;

                //this two line if we want to store unique entry in front
                arr[j]=a;
                j++;

            }
        }
        System.out.println("Non duplicate array length= "+len);
    }

}
