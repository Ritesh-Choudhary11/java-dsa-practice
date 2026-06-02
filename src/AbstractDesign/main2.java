package AbstractDesign;

//interface
interface vehicle{
    void startengine();
    void stopengine();
}
//implementation
class BMW implements vehicle{
    public void startengine(){
        System.out.println("engine start of BMW ");
    }
    public void stopengine(){
        System.out.println("engine stop of BMW ");
    }

}




public class main2 {
    public static void dovehiclestff(vehicle v){
        v.startengine();
        v.stopengine();
    }

    public static void main(String[] args) {
        dovehiclestff(new BMW());

        //OR

        //BMW b=new BMW();
        //dovehiclestff(b);

    }

}
