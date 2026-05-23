public class student2 {
  //attributes
public int id;
private int age;
public String name;
public int nos;
private String gf;

public String getgf(){
    return this.gf;
}

    public int  getage(){
        return this.age;
    }

    public void  setage(int a){
    if(a<200)
         this.age=a;

    }


//constructor
    public student2(int id,int age,String name,int nos,String gf){
        this.id=id;
        this.age=age;
        this.name=name;
        this.nos=nos;
        this.gf=gf;


    }

    //behivour
    private void gfchatting (){
        System.out.println(name+"gfchatting");
    }


}
