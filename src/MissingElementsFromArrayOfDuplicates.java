public class MissingElementsFromArrayOfDuplicates {
    public static void main(String[] args) {
        int arr[]={1,4,4,5,2,2};
        int n=arr.length;
        for(int index=0 ; index<n ; index++){
            int value=Math.abs(arr[index]);
            int position=value-1;

            if(arr[position]>0){
               arr[position]= -arr[position];
            }

        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                System.out.println(i+1);
            }
        }


    }
}
