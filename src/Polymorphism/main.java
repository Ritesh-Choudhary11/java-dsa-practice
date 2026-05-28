package Polymorphism;

public class main {
    public static void main(String[] args) {
        //calculator c=new calculator();
      // c.add(2,3);
        //c.add(2,3,4);
       //c.add(2,3,4,3.4);
        //System.out.println(c.add(2,3));
        //System.out.println(c.add(2,3,4));
        //System.out.println(c.add(2,3,4,3.4));


        //runtime polymorphism
        //circle c=new circle();
        //c.draw();
      // rect r=new rect();
        //r.draw();


        //upcasting or dynamic methord dispatch
        circle c=new circle();
        dodrawingstuff(c);

        shape s=new shape();
        dodrawingstuff(s);

        rect r=new rect();
        dodrawingstuff(r);


    }
    public static void dodrawingstuff(shape s){
s.draw(); //here shape is polymorphic
    }

    }



