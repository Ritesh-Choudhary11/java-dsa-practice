package Transport;

public class car extends vehicle{
    public int noOfdoor;
    public String transmissiontype;

    car(String name,String model,int noOftyre,int noOfdoor,String transmissiontype){
        super(name,model,noOftyre);
        this.noOfdoor=noOfdoor;
        this.transmissiontype=transmissiontype;
    }
    public void startAc(){
        System.out.println("start ac of car "+name);
    }



}
