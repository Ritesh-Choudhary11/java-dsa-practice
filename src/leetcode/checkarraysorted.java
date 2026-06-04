package leetcode;

public class checkarraysorted {
    public static void main(String[] args) {
        int nums[]={2,1,3,4};
        int n=nums.length;
        int stop=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[(i+1)%n]){
                stop++;
            }

        }

        if(stop>1){
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }
    }
}
