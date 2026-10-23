package leetcode;
import java.util.HashMap;

public class StringAnagram {
    public static void main(String[] args) {
        String  s = "anagram";
        String t = "nagaram";


        if(s.length()!=t.length()){
            System.out.println("false");
        }

        HashMap<Character, Integer> ana=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ana.put(ch, ana.getOrDefault(ch, 0) + 1);
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if (!ana.containsKey(ch)){
                System.out.println("false");
            }
            if(ana.get(ch)==1){
                ana.remove(ch);
            }
            else {
                ana.put(ch, ana.get(ch) - 1);
            }

        }

        System.out.println("true");
    }
}
