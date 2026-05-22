public class array2 {
    public static void main(String[] args) {
        int arr[] = {1,3,-5,0,6};
        int n = arr.length;
        int maxvalue=arr[0];
        for(int i=0;i<=n-1;i++){
            if(maxvalue < arr[i]){
                maxvalue=arr[i];
            }
            //
        }
        System.out.println(maxvalue);
    }
}
