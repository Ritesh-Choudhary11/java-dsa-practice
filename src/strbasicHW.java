public class strbasicHW {
    static void countword(String str){
        int n=str.length();
        int count =1;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch==' '){
                count++;

            }
        }
        System.out.println("the no of words in the sentence is  "+count);

    }

    //Q3
    static void checkdigit(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(!(ch>='0' && ch<='9')){
                System.out.println("string does not  contain only digit");
                return;
            }
        }
        System.out.println("string contain only digit");
    }

        //Q1
        static void countconsonents (String str){
            int n = str.length();
            int count = 0;
            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                    count++;
                    //System.out.println("is vowel");
                }
            }
            int result = str.length() - count;
            System.out.println("the no of consonenets are " + result);
        }

        public static void main (String[]args){
            String str = "my name is ritesh";
            countword(str);
            //checkdigit(str);
            //countconsonents(str);
            // Q2
            int n = str.length();
            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                }
                System.out.print(ch);
            }
        }

    }

