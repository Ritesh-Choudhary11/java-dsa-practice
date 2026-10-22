package leetcode;

public class MergeStringAlternatly {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int i = 0;
        int j = 0;
        while (i < n || j < m) {
            if (i < n) {
                sb.append(word1.charAt(i));
            }
            if (j < m) {
                sb.append(word2.charAt(j));
            }
            i++;
            j++;
        }
        System.out.println(sb.toString());
    }
}