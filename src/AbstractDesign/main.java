package AbstractDesign;

//interface
//abstract class Bird{
    //abstract void eat();
  //  abstract void fly();
//}

//implementation
// what actually bird is doing (case of abstraction)
//class Sparraw extends Bird {
    //void eat() {
      //  System.out.println("sparraw eat");
    //}

   // void fly() {
    //    System.out.println("sparraw fly");
  //  }
//}

    //class crow extends Bird {
        //void eat() {
          //  System.out.println("crow eat");
        //}

       // void fly() {
        //    System.out.println("crow fly");
      //  }
    //}

    //DOING THE SAME THING AS ABOVE (NOW THIS MODERN METHORD IS USED IN INDUSTRY FOR ABSTRUCTION)


//interface
interface  Bird{
     void eat();
     void fly();
     default void sleep(){
         System.out.println("bird is sleeping");
     }
}

//implementation
// what actually bird is doing (case of abstraction)
class Sparraw implements Bird {

    //default methord in java
    public void eat() {
        System.out.println("sparraw eat");
    }

    public void fly() {
        System.out.println("sparraw fly");
    }
}

class crow implements Bird {
    public void eat() {
        System.out.println("crow eat");
    }

    public void fly() {
        System.out.println("crow fly");
    }
}




public class main {
    public static void dobirdstyff(Bird b) {
        b.fly();
        b.eat();
        b.sleep();

    }
    public static void main(String[] args) {
dobirdstyff(new crow());
        dobirdstyff(new Sparraw());

//  OR

       // Bird b=new Sparraw();
        //b.eat();
       // b.fly();

         //b = new crow();
       // b.eat();
       // b.fly();
    }

}
