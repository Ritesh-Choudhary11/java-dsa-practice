public class leetarray1 {
    public static void main(String[] args) {
       int arr[]={1,0,0,2,0};
        int n=arr.length;
        int temp;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++) {
                if (arr[i] == 0) {
                    //arr[i]=arr[i+1];
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }

    }
}
