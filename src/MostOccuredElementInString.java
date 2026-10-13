import java.util.HashMap;

public class MostOccuredElementInString {
    public static void main(String[] args) {
        String str="testsample";
        int n=str.length();
        int count =0;
        char ch='z';
        HashMap<Character,Integer> freq= new HashMap<>();
        for(int i=0;i<n;i++){
             ch = str.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<n;i++){
             ch=str.charAt(i);
             count = freq.get(ch);
        }
        char ans = 'z';
        int maxFreq = 0;
        if(count > maxFreq){
            maxFreq=count;
        }
        System.out.println(ch);
        //ans=ch;

    }
}