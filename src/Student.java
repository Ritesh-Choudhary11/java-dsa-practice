public class Student {
    //attributes
    public int id;
    public int nos;
    public int age;
    public String name;

    //paramatarised ctor
    public Student(int id,int nos,int age,String name){
        this.id=id;
        this.nos=nos;
        this.name=name;
        this.age=age;

    }

    //copy constructor
    public Student(Student sobj){
        this.id=sobj.id;
        this.nos=sobj.nos;
        this.name=sobj.name;
        this.age=sobj.age;

    }


    //behivour
    public void study(){
        System.out.println(name+" studing");
    }
    public void sleep(){
        System.out.println(name+" sleeping");
    }



    public static void main(String[] args) {
        // calling paramaterised ctor
Student A=new Student(1,3,12,"ritesh");
        Student B=new Student(2,5,14,"rahul");

        System.out.println(A.nos);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.name);

        System.out.println(B.nos);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.name);



        A.sleep();
        A.study();

        B.sleep();
        B.study();


        //copy constructor
        Student c=new Student(A);
        System.out.println(c.nos);
        System.out.println(c.age);
        System.out.println(c.id);
        System.out.println(c.name);

        c.study();
    }
}
