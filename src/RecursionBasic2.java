public class RecursionBasic2 {
    public static int add(int arr[],int i){

        int n=arr.length;
        if(i==n){
            return 0;
        }
        int sum=0;
        sum=arr[i]+add(arr,i+1);
        System.out.println(sum);
        return sum;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int i;
        add(arr,0);


    }
}
