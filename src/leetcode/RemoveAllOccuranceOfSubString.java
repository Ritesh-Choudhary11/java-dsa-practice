package leetcode;

public class RemoveAllOccuranceOfSubString {
    public static void main(String[] args) {
        String s="daabcbaabcbc";
        String part="abc";
        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf(part) != -1){
            int index = sb.indexOf(part);
            sb.delete(index, index + part.length());
        }
        System.out.println(sb.toString());
    }
}
