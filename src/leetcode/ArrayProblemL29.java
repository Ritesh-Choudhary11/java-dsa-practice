package leetcode;

public class ArrayProblemL29 {
    public static void main(String[] args) {

        //  Q3
int arr[]={1,3,4,4,1};
int n=arr.length;
int ans=0;
for(int i=0;i<n;i++) {
    ans = ans ^ arr[i];
}
    System.out.println(ans);







//Q2
//        int arr[]={9,6,4,2,3,5,7,0,1};
//        int n=arr.length;
//        int XorSum=0;
//        for(int i=0;i<n;i++){
//            XorSum =XorSum^arr[i];
//        }
//        for(int i=0;i<=n;i++){
//            XorSum=XorSum^i;
//        }
//        System.out.println(XorSum);


        //Q1
//        int arr[]={0,1,0,1,0,1};
//        int n= arr.length;
//        for(int i=0,j=n-1;i<j;){
//            if(arr[i]==1&&arr[j]==0){
//                arr[i]=0;
//                arr[j]=1;
//                i++;
//                j--;
//            }
//            else if(arr[i]==0){
//               i++;
//            }
//            else if(arr[j]==1){
//                j--;
//            }
//
//        }
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
    }
}
