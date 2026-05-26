public class leetcode3 {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,1};
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1) {
                count++;
               if(count > max)
                max = count;
            }
            else if (arr[i]==0) {
               count=0;
            }

        }

        //print
        System.out.println(max);

    }
}
