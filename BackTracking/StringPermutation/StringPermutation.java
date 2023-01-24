package BackTracking.StringPermutation;

import java.util.*;
class StringPermutation{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out. println("Enter word");
        String word= sc.next();
        permutateWords(word,0,word.length()-1);
    }

    private static void permutateWords(String word,int start, int end){

        if(start == end){
            System.out.println(word);
        }

        for(int index=start;index<=end;index++){
            String newWord= swapCharacter(word,start,index);
            permutateWords(newWord,start+1,end);
            swapCharacter(word,start,index);
            //System.out.println(word);
        }

    }

    private static String swapCharacter(String word, int pos1, int pos2){

        char charAtPos1= word.charAt(pos1);
        char charAtPos2= word.charAt(pos2);
        StringBuilder string = new StringBuilder(word);
        string.setCharAt(pos1, charAtPos2);
        string.setCharAt(pos2, charAtPos1);
        return string.toString();

    }

}

