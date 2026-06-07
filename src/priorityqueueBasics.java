import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueueBasics {
    public static void main(String[] args) {


        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(" "+pq);
        System.out.println(" "+pq.poll());
        System.out.println(" "+pq);
        System.out.println(" "+pq.poll());
        System.out.println(" "+pq);
        System.out.println(" "+pq.poll());
        System.out.println(" "+pq);


        //MAXHEAP

        //priority queue me jiski value sabse kaam hogi uski value sabse jyda hogi -> isse MinHeap v bolte hai
        // agar ham chate hai ki high value ko high prioprity milne chiye to hame ek change karna hoga
        // Hame PriorityQueue<>((a,b)-> b-a) karke kar sakte hai ham isse ->MaxHeap v bolte hai

        Queue<Integer> pq2=new PriorityQueue<>((a,b)-> b-a);
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println("MAXHEAP "+pq);
        System.out.println("MAXHEAP "+pq.poll());
        System.out.println("MAXHEAP "+pq);
        System.out.println("MAXHEAP "+pq.poll());
        System.out.println("MAXHEAP "+pq);
        System.out.println("MAXHEAP "+pq.poll());
        System.out.println("MAXHEAP "+pq);


    }
}
