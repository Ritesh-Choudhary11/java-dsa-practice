package leetcode;

public class ReverseString {
    public static void main(String[] args) {
        char s[] = {'h', 'e', 'l', 'l', 'o'};
        int n = s.length;
        for (int i = 0, j = n - 1; j > i; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        for (int i=0;i<n;i++){
            System.out.println(s);
            break;
        }
    }
}
