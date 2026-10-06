package leetcode;

public class StringLeet151 {
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        String str="My Name Is Ritesh";
        int n=str.length();
        int i=n-1;
        while(i>=0){

            while(i>=0 && str.charAt(i)==' '){
                i--;
            }
            if(i<0){
              break;

            }
            int j=i;
            while(j>=0 && str.charAt(j)!=' '){
                j--;

            }
            ans.append(str.substring(j+1, i+1));
            while(j>=0 && str.charAt(j)!=' '){
                j--;
            }
            if(j>=0){
                ans.append(' ');
            }
            i=j;

        }
        System.out.println(ans.toString());
    }
}
