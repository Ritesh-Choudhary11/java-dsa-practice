package JavaCollectionFrameWorkPart3;

public class student implements Comparable<student> {
    private int age;
    private String name;
    private int weight;

    public String getName() {
        return this.name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return this.weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    public int getAge() {
        return this.age;
    }

    public student(int age, String name, int weight){
        this.age=age;
        this.name=name;
    this.weight=weight;
    }
    @Override
    public int compareTo(student that){
        //this methord is called for current obnect which is (this)
        //we will define our sorting logic here

       // sort basis on age

        if(this.age==that.age){
            return this.name.compareTo(that.name);
        }
        return this.age-that.age;// this sorts in assanding order
    }


}
