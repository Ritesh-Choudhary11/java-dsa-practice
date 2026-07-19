package leetcode;

public class MaximumSumContinousSubArray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int sum=0;
        int Maxi= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>Maxi){
                Maxi=sum;
            }
            else if(sum<0){
                sum=0;
            }
        }
        System.out.println(Maxi);







//        int max=0;
//        for(int i=0;i<n;i++){
//            int sum=0;
//            for(int j=i;j<n;j++){
//                sum=sum+arr[j];
//                if(sum>max) {
//                    max = sum;
//                }
//            }
//        }
//        System.out.println(max);
    }
}
