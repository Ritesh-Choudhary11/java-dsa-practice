public class prac {
    public static void main(String[] args) {
        int arr[]={1,0,0,2,0};
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==0){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }



    }
}
