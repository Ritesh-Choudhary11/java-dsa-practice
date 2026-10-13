
import java.util.Arrays;
public class FindFirstAndLastPositionOfSortedArray {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int[] arr = {-1,-1};
        int target=8;
        int s=0;
        int e= nums.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }

        s = 0;
        e = nums.length - 1;

        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                s=mid+1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }


        System.out.println("The range is " + Arrays.toString(arr));
    }
}
