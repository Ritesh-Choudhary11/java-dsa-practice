public class test {
    public static void main(String[] args) {
        //calling constructor
student2 A =new student2(12,18,"ritesh",5,"ritika");
        System.out.println(A.id);
        System.out.println(A.nos);
        System.out.println(A.name);
// we will try to acces the gf name directly like the below commentes orint statement it will give error

       // System.out.println(A.gf);

        //we cannot acces the gf name directly as the gf name is decleared private we have to use getter function
        //to acces it directly
        System.out.println(A.getgf());

        System.out.println(A.getage());

        //we can change the private data by stter not directly as it is unauthorised
        //cahnge age 18 -> 20
A.setage(20);
        System.out.println(A.getage());

       // A.gfchatting();

    }
}
