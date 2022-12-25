package ArrayExercise.FIndMinPlatform;

public class GreedyApproach {

    public static void main(String[] args) {
        double A[] = {9.00, 9.40, 9.50, 11.00, 15.00, 18.00};
        double D[] = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};
        int i=0,j=0,platform=0,max_paltform=0;
        while(i< A.length && j< D.length){
            if(A[i]<D[j]){
                platform++;
                if(platform > max_paltform){
                    max_paltform=platform;
                }
                i++;
            }
            else{
                platform--;
                j++;
            }
        }
        System.out.println("Max platfrom= "+ max_paltform);
    }
}
