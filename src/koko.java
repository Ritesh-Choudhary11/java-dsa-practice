public class koko {
    static boolean isValidAns(int piles[], int mid, int n, int h) {
        int final1 = 0;
        for (int i = 0; i < n; i++) {
            int value = (piles[i] + mid - 1) / mid;
            final1 = final1 + value;

        }
        if (final1 <= h) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int piles[]={3,6,7,11};
        int n= piles.length;
        int h=8;
        int s = 1;
        int e = piles[n-1];
        int ans =0;
        while(s<=e){
            int mid = (s+e)/2;
            if(isValidAns(piles,mid,n,h)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        System.out.println(ans);


    }
}
