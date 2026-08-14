package leetcode;

public class PaintersPartationProblem {
    static boolean IsValidAns (int arr[],int k,int mid){

        int painter=1;
        int paintedlength=0;
        for(int i=0;i<arr.length;i++){
            if(paintedlength+arr[i]<=mid){
                paintedlength=paintedlength+arr[i];
            }
            else{
                painter++;
                paintedlength=0;
                if(painter>k || arr[i]>mid){
                    return false;
                }
                else{
                    paintedlength=paintedlength+arr[i];
                }
            }
        }
        return true;

    }



    public static void main(String[] args) {
        int arr[]={5,10,30,20,15};
        int n=arr.length;
        int s=0;
        int ans=0;
        int sum=0;
        int k=3;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int e=sum;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(IsValidAns(arr,k,mid)){
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
