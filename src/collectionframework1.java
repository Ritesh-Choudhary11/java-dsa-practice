import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.Collections;


public class collectionframework1 {
    public static void main(String[] args) {
        // List or Collection both are interfaces so these cannot be implemented

        //ArrayList is a concrete class so we can make object here
       ArrayList<Integer> list= new ArrayList<>();
       //adding element in list
       list.add(10);
        list.add(20);
        list.add(30);
        //System.out.println(list);

//        this remove the element from an index
       list.remove(1);
        System.out.println(list);

        //creating new list
        ArrayList<Integer> list2=new ArrayList<>();
        //adding elements in list2
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        //adding list elements in list2
list2.addAll(list);
        System.out.println(list2);

        //removing list from list2
        list2.removeAll(list);
        System.out.println(list2);

        //checking the list2 size
        System.out.println(list2.size());

        System.out.println(list2);

//this clear everything from list2

        list2.clear();
        System.out.println(list2.size());


        // if we want we can treverse list using Iterator
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println("elemets"+iterator.next());
        }
        ArrayList<Integer> list3= new ArrayList<>();
        list3.add(11);
        list3.add(22);
        list3.add(33);
        //if we want we can only acces the specific index
        System.out.println(list3.get(0));
        System.out.println("before set"+list3);

        // we can also set the value any intex
list3.set(0,100);
        System.out.println("after set"+list3);

        //toArray -> converts any list to arary
       Object[] arr= list3.toArray();
       for(Object obj:arr){
           System.out.println(obj);
       }

       //contains -> check is any elements like X is prsent in the list or not

        System.out.println(list3.contains(100));

       list.add(6);
        list.add(12);
        list.add(3);
        System.out.println(list);

        // to sort list in assending order
        Collections.sort(list);
        System.out.println(list);


//       making a clone of any list
       ArrayList<Integer> newlist=(ArrayList<Integer>)list.clone();
        System.out.println("elements in new list ara"+newlist);

        //assigning the capacity of an array list
        ArrayList<Integer>marks=new ArrayList();
        marks.ensureCapacity(100);

        //checking if any list is empty or not
        System.out.println(list.isEmpty());

        //this helps to know the indexof any element present in a arrylist
        System.out.println(list.indexOf(30));




        //OR
        //List<Integer> list= new ArrayList<>();
        //OR
       // Collection<Integer> collection= new ArrayList<>();
    }
}
