package ArrayExercise.MaxNumberInArray;

public class MaxNumberInArray {

    public static void main(String[] args) {
        int arr[] = {3,7,32,37,40,57,52,50,47,44};
        findMaxInArrayWhichIsIncrAndThenDecr(arr);
    }

    private static void findMaxInArrayWhichIsIncrAndThenDecr(int[] arr) {

        findElementUsingBinarySearch(arr,0,arr.length);
    }

    private static void findElementUsingBinarySearch(int[] arr, int low, int high) {

        int mid=(low+high)/2;
        if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
            System.out.println("Highest= "+arr[mid]);
            return;
        }

        if(arr[mid]<=arr[mid+1]){
            //Number are still increasing so high is in right half
            findElementUsingBinarySearch(arr,mid,high);
        } else if (arr[mid]>=arr[mid+1] ) {
            //Number has started decreasing, high is on left half
            findElementUsingBinarySearch(arr,low,mid);
        }
    }
}
