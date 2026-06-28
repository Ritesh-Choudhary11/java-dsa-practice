package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ArrayProblemsL30 {
    public static void main(String[] args) {

        //Q5 -> Q5 and Q3 are same ,jus Q5 is done using hash map
        int arr[]={1,2,2,2,3,3,4};
        int n= arr.length;
        Map<Integer,Integer> repeat=new HashMap<>();
        for(int i=0;i<n;i++){
            if(repeat.containsKey(arr[i])){
                repeat.put(arr[i],repeat.get(arr[i])+1);
            }
            else{
                repeat.put(arr[i],1);

            }

       }
        System.out.println(repeat.size());





        //Q4 counting the first repeated element
//        int arr[]={10,5,3,4,3,5,6};
//        int n= arr.length;
//        Map<Integer,Integer> freq=new HashMap<>();
//
//        //counting frequency of every element
//        for(int i=0;i<n;i++){
//            if(freq.containsKey(arr[i])){
//                freq.put(arr[i],freq.get(arr[i])+1);
//            }
//            else{
//                freq.put(arr[i],1);
//            }
//        }
//
//        for(int i=0;i<n;i++){
//            if(freq.get(arr[i])>1){
//                System.out.println(arr[i]);
//                break;
//            }
//
//        }


        //Q3
//        int nums[]={1,2,2,2,3,3,4};
//        int n= nums.length;
//        int i=0;
//        int j=1;
//        while(j<n){
//            if(nums[i]==nums[j]){
//                j++;
//            }
//            else{
//                i++;
//                nums[i]=nums[j];
//                j++;
//            }
//        }
//        System.out.println(i+1);


       // Q2
//        int arr[]={1,5,7,2,9,8};
//        int targate=12;
//        int n=arr.length;
//        for (int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    if(arr[i]+arr[j]+arr[k]==targate){
//                      int ans[]={i,j,k};
//                        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
//                    }
//                }
//            }
//
//        }

           // Q1
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
