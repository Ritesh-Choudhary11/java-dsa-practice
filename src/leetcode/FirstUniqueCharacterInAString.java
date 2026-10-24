package leetcode;
import java.util.HashMap;
public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s="leetcode";
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                System.out.println(i);
                break;


            }
        }
        //System.out.println(-1);
    }
}
