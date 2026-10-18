package leetcode;
public class StringCompresson {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c'};
        int c = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < chars.length) {
            j = i;
            c = 0;
            while (j < chars.length && chars[j] == chars[i]) {
                c++;
                j++;
            }
            chars[k] = chars[i];
            k++;
            if (c > 1) {
                String s = String.valueOf(c);
                for (int x = 0; x < s.length(); x++) {
                    chars[k] = s.charAt(x);
                    k++;
                }
            }
            i = j;
        }
        System.out.println(k);
    }
}
