package ArrayExercise.JumpProblem;

public class JumpPossible {

    public static void main(String[] args) {

        int arr[] = {1,3,5,8,9,2,6,7,8,9};

        int a= arr[0],b= arr[1],jump=1;

        for(int i=0;i<arr.length;i++){
            if(a != 0){
                if(arr[i]>b){
                    b=arr[i];
                }

            }else{
                if(b != 0) {
                    a = b;
                    jump++;
                }else{
                    System.out.println("Jump not possible");
                }
            }
            a--;
        }
        System.out.println("Total Jump = "+jump);

    }
}
