package Transport;

public class motorcycle extends vehicle{
    public String handlebartype;
    public String suspensiontype;

     motorcycle(String name,String model,int noOftyre,String handlebartype,String suspensiontype){
         super(name,model,noOftyre);
         this.handlebartype=handlebartype;
         this.suspensiontype=suspensiontype;
     }
     public void wheelie(){
         System.out.println("the motorcycle which perform wheelie is "+name);
     }

}
