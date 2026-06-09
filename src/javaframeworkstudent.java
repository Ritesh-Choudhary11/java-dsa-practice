import java.util.Objects;
public class javaframeworkstudent {

    public int rollno;
    public String name;

    public javaframeworkstudent(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public String toString(){
return"roll no "+ rollno+" " + "name "+name;
    }
    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (!(o instanceof javaframeworkstudent))
            return false;

      javaframeworkstudent student  = (javaframeworkstudent) o;

        return rollno == student.rollno;
    }
    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }


    // FOR FUTURE REFERENCE TO UNDERSTANDWHY WE USE EQUALS() AND HASHCODE



    /*
Why override equals() and hashCode()?

By default, Java compares objects by memory address.

Example:
Student s1 = new Student(24, "Ritesh");
Student s2 = new Student(24, "Ritesh");

Without overriding:
s1.equals(s2) -> false
because they are different objects in memory.

equals():
Used to define when two objects should be considered logically equal.
Here, two students are equal if their roll numbers are equal.

hashCode():
Used by HashSet, HashMap, Hashtable, etc.
Objects that are equal according to equals() must return the same hash code.

HashSet process:
1. Calls hashCode() to find the bucket.
2. Calls equals() to check for duplicates.

If equals() is overridden but hashCode() is not,
collections like HashSet and HashMap may behave incorrectly.

Rule:
Whenever equals() is overridden, hashCode() should also be overridden.
*/
}
