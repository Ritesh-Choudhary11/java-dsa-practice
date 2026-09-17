package AGGRASIVECOWS;

import java.util.Arrays;

public class JAVA {

    static boolean isValidAns(int n,int mid,int arr[],int k){

        int cowCount =1;
        // this is the first cow so it should be placed in the first index
        int lastposition=0;

        for(int i=1;i<n;i++){
            if(arr[i]-arr[lastposition]>=mid){
                //cow placed successfully so increase the cow count for the next cow to place.
                cowCount++;
                lastposition=i;

                if(cowCount==k){
                    //matlab sari cows place ho chuki hai so
                    return true;
                }

            }
        }
        return false;



    }
    public static void main(String[] args) {
        int arr[]={1,2,8,4,9};
        Arrays.sort(arr);
        int n=arr.length;
        int k=3;
        int s=0;
        int e=arr[n-1]-arr[0];
        int ans=0;
        while(s<=e){
            int mid =(s+e)/2;
            if(isValidAns(n,mid,arr,k)){
                //this can be my ans so store it and move to right
                ans =mid;
                s=mid+1;
            }
            else{
                // cows are not fitting on the given distance .
                // so in this case we have to move to left
                e=mid-1;
            }

        }
        System.out.println(ans);

    }
}
