public class powerOfTwo {
    public static int poweroftwo(int n){
        if(n==0) {
            return 1;
        }
        int ans =2*poweroftwo(n-1);
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        poweroftwo(5);

    }
}
