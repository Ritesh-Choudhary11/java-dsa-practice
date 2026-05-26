package Transport;

public class main {
    public static void main(String[] args) {
        motorcycle M=new motorcycle("java","perak",2,"straight","air suspension");
            M.startengine();
            M.stopengine();
            M.wheelie();



        car c=new car("BMW","M340i",4,4,"automatic");
        System.out.println("name "+c.name);
        System.out.println("model "+c.model);
        System.out.println("no of tyre "+c.noOftyre);
        System.out.println("no of door "+c.noOfdoor);
        System.out.println("transmission "+c.transmissiontype);

        c.startengine();
        c.stopengine();
        c.startAc();

    }
}
