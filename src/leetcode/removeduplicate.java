package leetcode;

public class removeduplicate {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        int n=nums.length;
        int k=0;
        int unique[]=new int[n];
        for(int i=0;i<n;i++){
            boolean duplicate=false;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    duplicate=true;
                    break;

                }

            }
            if(!duplicate){
                unique[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(unique[i]);
        }

    }
}
