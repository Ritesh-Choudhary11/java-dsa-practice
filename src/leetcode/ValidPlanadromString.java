package leetcode;

public record ValidPlanadromString() {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        int n=s.length();

        for (int i=0,j=n-1;j>i;i++,j--){

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }


            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                System.out.println("false");
            }

        }
        System.out.println("true");
    }
}
