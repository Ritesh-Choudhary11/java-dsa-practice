public class FindSingleNonDublicateElementUsingBinarySearch {
    public static void main(String[] args) {
        int arr[]={10,10,20,20,30,30,40,40,50,60,60};
        int n= arr.length;
        int s=0;
        int e=n-1;
        int ans=0;
        if(s>=0 && e<=n-1) {
            while (s <= e) {
                int mid = (s + e) / 2;
                if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                    ans = arr[mid];
                    break;
                } else if ((mid - 1 & 1) == 0) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        System.out.println(ans);

    }
}
