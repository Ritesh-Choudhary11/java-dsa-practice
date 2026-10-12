public class FindPeakElementsLL162 {
    public static void main(String[] args) {
        int nums[]={1,2,1,3,5,6,4};
        int n=nums.length;
        int s=0;
        int e=n-1;
        int mid;
        while(s<e){
            mid=(s+e)/2;
            if(nums[mid]<nums[mid+1]){
                s=mid+1;
            }
            else if(nums[mid]>nums[mid+1]){

                e=mid;
            }


        }
        System.out.println(s);
    }
}
