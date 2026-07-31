package leetcode;

public class SearchInsertLeet35 {
    public static void main(String[] args) {
int nums[]={1,3,5,6};
     int target=2;
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (nums[mid] == target) {
                System.out.println(mid);
            } else if (nums[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;

            }
            mid = (start + end) / 2;

        }

        System.out.println(start);
    }
}
