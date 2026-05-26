package Transport;

public class vehicle {
    public String name;
    public String model;
    public int noOftyre;

    vehicle(){
        this.name="";
        this.model="";
        this.noOftyre=-1;
    }

    vehicle(String name,String model,int noOftyre){
        this.name=name;
        this.model=model;
        this.noOftyre=noOftyre;
    }
    void startengine(){
        System.out.println("engine is starting of "+name+model);
    }
    void stopengine(){
        System.out.println("engine is stopping "+name+model);
    }


}
