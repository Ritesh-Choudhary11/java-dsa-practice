package leetcode;

public class SplitArrayLargestSumLC410 {
    static boolean ValidAns(int nums[],int k,int mid){
        int studentcount=1;
        int pages=0;
        for(int i=0;i<nums.length;i++){
            if(pages+nums[i]<=mid){
                pages=pages+nums[i];
            }
            else{
                studentcount++;
                if(studentcount > k || mid < nums[i]){
                    return false;
                }
                else{
                    pages=0;
                    pages=pages+nums[i];
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
      int nums[]={10,20,30,40,50};
      //int n=nums.length;
      int k=2;


                if(nums.length<k){
                    System.out.println(-1);
                }
                int n=nums.length;
                int s=1;
                int sum=0;
                int ans=0;
                for(int i=0;i<n;i++){
                    sum=sum+nums[i];
                }
                int e=sum;
                while(s<=e){
                    int mid=s+(e-s)/2;
                    if(ValidAns(nums,k,mid)){
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



