import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {
    public static void main(String[] args) {

        HashSet<javaframeworkstudent> set=new HashSet<>();
        javaframeworkstudent s1=new javaframeworkstudent(24,"ritesh");
        javaframeworkstudent s2=new javaframeworkstudent(24,"ritesh");
        javaframeworkstudent s3=new javaframeworkstudent(24,"ritesh");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);






//        Set<Integer> set1= new HashSet<>();
//        Set<Integer> set2= new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//        System.out.println(set1);
//        set1.retainAll(set2);
//        System.out.println(set1);
//        System.out.println(set1.containsAll(set2));
//        System.out.println(set2.containsAll(set1));





//        Set<Integer> st= new HashSet<>();
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//        st.add(40);
//        System.out.println(st);

    }
}
