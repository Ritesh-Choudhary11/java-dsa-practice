package leetcode;
import java.util.HashMap;
public class RansomNote {
    public static void main(String[] args) {
        String magazine="aa";
        String ransomNote="aab";

        HashMap<Character,Integer> mag =new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            mag.put(ch,mag.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(mag.containsKey(ch) && mag.get(ch) > 0){
                mag.put(ch, mag.get(ch) - 1);
                break;
            }
            else{
                System.out.println("false");
            }

        }
        System.out.println("true");
    }
}
