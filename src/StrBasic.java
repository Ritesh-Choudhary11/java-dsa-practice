public class StrBasic {
    //5
    static void checkpalandrom(String str){
        String original=str;
         String reverse="";
         int n=str.length();
         for(int i=n-1;i>=0;i--){
             char ch=str.charAt(i);
             reverse = reverse + ch;
         }
         if(original.equals(reverse)){
             System.out.println("is palandrom");
         }
         else{
             System.out.println("not palandrom");
         }
    }






    //4
    static String reversestring(String str){
        String reverse="";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            reverse=reverse+ch;

        }
        return reverse;
    }


    //3
    static int getvowelcount(String str){
        int count=0;
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
    count++;
}

}
return count;
    }


//2
    static int countstringlength(String str){
        char arr[]=str.toCharArray();
        int length=arr.length;
        return length;
    }
//1
    static void printstring(String str){
       int n=str.length();
       for(int i=0;i<n;i++){
           char ch=str.charAt(i);
           System.out.println(ch);
       }

    }

    public static void main(String[] args) {
String str="ritesh";
checkpalandrom(str);
        //
        //System.out.println(reversestring(str));
        //System.out.println(getvowelcount(str));

        //System.out.println(countstringlength(str));
//printstring(str);
    }
}
