package ArrayExercise.RemoveDuplicateFromString;
import java.util.Arrays;
public class RemoveDuplicateFromString {

    public static void main(String[] args) {
        String word="banana";
        char[] wordArray = word.toCharArray();
        int[] arrForString = new int[256];

        for(int i =0;i< wordArray.length;i++){
            int index= (int)wordArray[i];
            if(arrForString[index]!=-1){
                arrForString[index]=-1;
            }else{
                wordArray[i]='\u0000';
            }

        }
        for(int i =0;i< wordArray.length;i++) {
            System.out.print(wordArray[i]);
        }
    }
}
