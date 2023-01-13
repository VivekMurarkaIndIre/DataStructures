package StringOperation.Anagrams;
import java.util.*;
public class Anagrams {

    public static void main(String[] args) {
        String[] arr =  {"CAT","DOG","TAC","GOD","ACT"};
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char[] str= new char[26];
            String word=arr[i];
            for(char ch: word.toCharArray()){
                str[ch-'A']='Y';
            }
            String key = new String(str);
            if(map.containsKey(key)){
                map.get(key).add(arr[i]);
            }else{
                ArrayList<String> list= new ArrayList<>();
                list.add(arr[i]);
                map.put(key,list);
            }
        }

        for(String key: map.keySet()){
            ArrayList<String> list=map.get(key);
            System.out.println("Anagrams pair: ");
            list.stream().forEach(str->System.out.print(str+", "));
        }
    }
}
