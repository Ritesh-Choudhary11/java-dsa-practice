public class MathsBasics {

    //Q6
    static void checkprimetillN(int n){
        for(int num=2;num<=n;num++){
            boolean isprime=true;
          for(int i=2;i*i<=num;i++){
              if(num%i==0){
                 isprime=false;
                  break;
              }
          }
          if(isprime==true){
              System.out.println(num);
          }
        }


    }

    //Q5
    static boolean checkperfectno(int n){
        int sum=1;
        int orgno=n;
        for(int i=2;i*i<=n;i++){
           int firstfactor=i;
           int secfactor=n/i;
           sum=sum+firstfactor+secfactor;
        }
        if(sum==orgno){
            return true;
        }
        else{
            return false;
        }
    }
    //Q4
    static boolean armstromno(int num){
        int sum=0;
        int originalnum=num;
        while(num!=0) {
            int digit = num % 10;
            int cube = digit * digit * digit;
            sum = sum +cube;
           num=num/10;
        }
        if(sum==originalnum){
            return true;
        }
        else {
            return false;
        }
    }
    //Q3
    static int findlcm(int a,int b){
       int gcd=findgcd(a,b);
       int lcm=a*b/gcd;
       return lcm;
    }
    //Q2
    static int findgcd(int a,int b){
        while(b!=0) {
            int temp =b;
            b=a%b;
            a=temp;
        }
        int ans=a;
        return a;

    }
    //Q1 M2
    static boolean checkprim(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
        //Q1 M1
    static boolean checkprime(int n){
        for(int i=2;i<(n-1);i++){
            if(n%i==0) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkprime(7));
        System.out.println(checkprim(8));
        System.out.println(findgcd(12,18));
        System.out.println(findlcm(18,12));
        System.out.println(armstromno(153));
        System.out.println(checkperfectno(7));
        checkprimetillN(10);
    }
}
