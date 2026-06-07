import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

public class collectionframework2 {
    public static void main(String[] args) {
        //creation of a Queue interface using LinkedList implementation
        Queue<Integer> animal1=new LinkedList<>();

        //insted of add we use offer to add elements becuause it doesnot throw any exception
        animal1.offer(10);
        animal1.offer(20);
        animal1.offer(30);
        System.out.println(animal1);

        //insted of remove we use poll to remove elements and return the removed element becuause it doesnot throw any exception
        System.out.println(animal1.poll());

        System.out.println(animal1);

        //insted of element we use peek to return and obsorve the firdt elements becuause it doesnot throw any exception
        System.out.println(animal1.peek());

      //creation of a Queue interface using ArrayDeque implementation
        Queue<Integer> animal2=new ArrayDeque<>();

        //insted of add we use offer to add elements becuause it doesnot throw any exception
        animal1.offer(10);
        animal1.offer(20);
        animal1.offer(30);
        System.out.println(animal1);

        //insted of remove we use poll to remove elements and return the removed element becuause it doesnot throw any exception
        System.out.println(animal1.poll());

        System.out.println(animal1);

        //insted of element we use peek to return and obsorve the firdt elements becuause it doesnot throw any exception
        System.out.println(animal1.peek());





    }
}
