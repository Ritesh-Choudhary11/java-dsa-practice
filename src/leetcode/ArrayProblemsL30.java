package leetcode;

public class ArrayProblemsL30 {
    public static void main(String[] args) {
        int arr[]={1,5,7,2,9,8};
        int targate=12;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==targate){
                      int ans[]={i,j,k};
                        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
                    }
                }
            }

        }










//        int arr[]={2,7,11,15};
//        int n=arr.length;
//        int targate=9;
//        for(int i=0;i<n;i++){
//           for(int j=i+1;j<n;j++){
//               if(arr[i]+arr[j]==targate){
//                   System.out.println(i);
//                   System.out.println(j);
//               }
//
//           }
//        }
    }
}
