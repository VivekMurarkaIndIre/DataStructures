package ArrayExercise.RotateMatrixBy90;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int N= matrix.length;
        for(int i=0;i<N/2;i++){
            for(int j=i;j<N-i-1;j++){
                int temp= matrix[j][N-1-i];
                matrix[j][N-1-i]=matrix[i][j];
                matrix[i][j]= matrix[N-1-j][i];
                matrix[N-1-j][i]=matrix[N-1-i][N-1-j];
                matrix[N-1-i][N-1-j]=temp;
            }
        }
        for(int i=0;i<N;i++){

            for(int j=0;j<N;j++) {
                System.out.print(matrix[i][j]+ " ");
                }
            System.out.println();
            }
    }
}
