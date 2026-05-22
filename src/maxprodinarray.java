public class maxprodinarray {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,6,4};
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;

                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        int max =arr[n-1];
        int secmax=arr[n-2];
        int ans= max*secmax;
        System.out.println("   "+ans);

    }
}
