import java.util.Scanner;
public class methord {
    static int add(int a,int b){
      int sum=a+b;
        return sum;
    }
    static boolean iseven(int a){
        if(a%2==0){
            return true;
        }
        else{
           return false;
        }
    }

    public static void main(String[] args) {
//printwelcomemessage();
//int result =add(5,7);

        //System.out.println(result);
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        boolean result=iseven(a);
        System.out.println(result);


    }
}
