public class ArrayBasicProblemL27 {

    static void maxelement(int arr[]){
        int max=0;
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    //Linear search3
//    static boolean Linearsearch(int brr[],int targate){
//        int n= brr.length;
//        for(int i=0;i<n;i++){
//            if(brr[i]==targate){
//                return true;
//            }
//
//        }
//return false;
//    }
//2multiply element by 10 and display using new array
//    static int[] myltiplyelement(int arr[]){
//        int n= arr.length;
//        int newarray[]=new int [n];
//        for(int i=0;i<n;i++){
//            int element=arr[i];
//            int newelement=element*10;
//            newarray[i]=newelement;
//
//        }
//        return newarray;
//    }

    public static void main(String[] args) {
        int arr[]={9,2,5,7,12};
        maxelement(arr);

//        int brr[]={2,5,3,1,7};
//        System.out.println(Linearsearch(brr,17));




//        int arr[]={2,4,3,3};
//       int ans[]= myltiplyelement(arr);
//       for(int i=0;i< ans.length;i++){
//           System.out.println(ans[i]);
//       }


//        // 1Avrage of an array
//        int arr[]={2,4,3,3};
//        int sum=0;
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum/ arr.length);






    }
}
