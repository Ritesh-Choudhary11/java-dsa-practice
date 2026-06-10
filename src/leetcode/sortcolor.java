package leetcode;

public class sortcolor {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        int n= arr.length;
        int k=0;
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            } else if (arr[i]==1){
                one++;
            }
            else{
                two++;
            }

        }
        while (zero>0){
            arr[k]=0;
            k++;
            zero--;
        }
        while (one>0){
            arr[k]=1;
            k++;
            one--;
        }

        while (two>0){
            arr[k]=2;
            k++;
            two--;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
