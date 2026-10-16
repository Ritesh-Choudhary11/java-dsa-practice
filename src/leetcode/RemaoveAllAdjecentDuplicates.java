package leetcode;

public class RemaoveAllAdjecentDuplicates {
    public static void main(String[] args) {
        String s ="abbaca";
        StringBuilder sb =new StringBuilder(s);
        int i=0;
        int n=sb.length();
        while(i+1<n){
            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.delete(i,i+2);
                n=sb.length();
                if(i>0){
                    i--;
                }
            }
            else{
                i++;
            }
        }
        System.out.println(sb.toString());
    }
}
