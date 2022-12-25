package ArrayExercise.FIndMinPlatform;

public class MinPlatform {

    public static void main(String[] args) {
        double A[] = {9.00, 9.40, 9.50, 11.00, 15.00, 18.00};
        double D[] = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};
        int platform = (A.length>0)? 1:0;
        //Not correct Implementation a it will fail for
        //platform which became empty which were previously occupied
        for(int i=0;i<A.length;i++){
            if(A[i+1]<D[i]){
                platform++;
            }
        }
        System.out.println("Min platform required= "+platform);
    }
}
