public class prodofarray2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int brr[]=new int[arr.length];
        int n=arr.length;

        for(int i=0;i<n;i++){
           int prod=1;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                prod=prod*arr[j];

            }
            brr[i]=prod;

        }
        for(int i=0;i<n;i++){
            System.out.println(brr[i]+" ");
        }


    }
}
