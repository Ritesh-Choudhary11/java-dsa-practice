import java.util.Arrays;

public class EkoSpoj {
    static boolean isValidAns(int m,int tree[],int mid ,int n){
     int totalwoodcollected =0;
     for(int i=0;i<n;i++){
         if(tree[i]>mid){
             int currentlength=tree[i]-mid;
             totalwoodcollected=totalwoodcollected+currentlength;
         }
     }
     if(totalwoodcollected>=m){
         return true;
     }
     else {
         return false;
     }
    }

    public static void main(String[] args) {
        int tree[]={20,15,10,17};
        Arrays.sort(tree);
        int n=tree.length;
        int s=0;
        int e=tree[n-1];
        int ans =0;
        int m=7;
        while(s<=e){
            int mid =(s+e)/2;
            if(isValidAns(m,tree,mid,n)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println(ans);

    }
}
