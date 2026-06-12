package javaFrameWorkPractise;
import java.util.Comparator;
public class employeIdCompartaor implements Comparator<employe>{
    public int compare(employe e1,employe e2){
        //return Integer.compare(e1.employeId, e2.employeId);
        //return e1.name.compareTo(e2.name);
        return Integer.compare(e1.weight, e2.weight);
    }
}
