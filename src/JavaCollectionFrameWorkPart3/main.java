package JavaCollectionFrameWorkPart3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<student> students=new ArrayList<>();
        students.add(new student(21,"ritesh",63));
        students.add(new student(20,"shivam",55));
        students.add(new student(21,"anuj",70));
        System.out.println(students);
        Collections.sort(students,new weightcomparator());
        System.out.println(students);

    }
}
