public class ArrayBasicProblemL27 {
    static int[]ReturnSumPosNeg(int arr[]){
        int sum1=0;
        int sum2=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]>0){
            sum1=sum1+arr[i];
          }
          else{
              sum2=sum2+arr[i];
          }
      }
      int ans[]={sum1,sum2};
      return ans;
    }


//    static void maxelement(int arr[]){
//        int max=0;
//        for(int i=0;i< arr.length;i++){
//            if(max<arr[i]){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
//    }

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
        int arr[]={-9,2,5,-7,12};
      int ans[]=ReturnSumPosNeg(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);

//        int arr[]={9,2,5,7,12};
//        maxelement(arr);

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
