package javaFrameWorkPractise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<employe> employe=new ArrayList<>();
        employe.add(new employe(63,"ritesh",225));
        employe.add(new employe(62,"gandu",213));
        employe.add(new employe(88,"bhalu",235));
        employe.add(new employe(54,"kalu",233));
        System.out.println(employe);
        Collections.sort(employe,new employeIdCompartaor());
        System.out.println(employe);


    }
}
