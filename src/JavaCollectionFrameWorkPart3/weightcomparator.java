package JavaCollectionFrameWorkPart3;
import java.util.Comparator;
public class weightcomparator implements Comparator<student> {
    public int compare(student s1,student s2){
        return Integer.compare(s1.getWeight(),s2.getWeight());

        //OR

        //return s1.getWeight()-s2.getWeight();
    }

}
