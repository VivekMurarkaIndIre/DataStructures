package ArrayExercise.FindNumberInSortedMatrix;

public class FindNumberInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int N= matrix.length,target=3,row=-1,i=0,j=0;

        while(i< N && j<N){
            if(row == -1) {
                if (matrix[i][0] < target && matrix[i][N - 1] >= target) {
                    row = i;
                    j = 0;
                } else {
                    i++;
                }
            }
            else{
                if (matrix[row][j] == target) {
                    System.out.println(row + "," + j);
                    break;
                } else {
                    j++;
                }
            }
        }
    }
}
