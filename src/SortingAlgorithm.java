public class SortingAlgorithm {
    //Q1
   static void BubbleSort(int arr[],int n){
     for(int i=0;i<n-1;i++){
         for(int j=0;j<n-i-1;j++){
             if(arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
     }
     for(int i=0;i<n;i++){
         System.out.println(arr[i]);
     }
    }
    // Q2
    static void SelectionSort(int arr[],int n){
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
            }

        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    //Q3
    static void InsertionSort(){

    }

    public static void main(String[] args) {
       int arr[]={2,5,1,4,3};
       int n=arr.length;
       //BubbleSort(arr,n);
      SelectionSort(arr,n);
    }
}
