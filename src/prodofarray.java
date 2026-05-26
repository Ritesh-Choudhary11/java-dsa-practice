public class prodofarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int brr[] = new int[arr.length];
        int prod = 1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            prod=prod*arr[i];
        }
        //to store in brr
        for(int i=0;i<n;i++){
           brr[i]=prod/arr[i];
        }
        //to print
        for(int i=0;i<n;i++){
            System.out.println(brr[i]);
        }
    }
}
