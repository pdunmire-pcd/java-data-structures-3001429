import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

  public static void main(String[] args) {

    Queue<String> queue = new ArrayDeque<>();
    queue.offer("Person One");
    queue.offer("Person Two");
    queue.offer("Person Three");
    System.out.println(queue);
    System.out.println(queue.peek());
    queue.poll();
    System.out.println(queue);
    
  }

}

// Return the same ArrayDeque given as input, but with the first 3 numbers removed from the front.
    static Queue<Integer> shortenQueue(Queue<Integer> queue) {
        // Your code goes here.
        queue.poll();
        queue.poll();
        queue.poll();
        return queue;
    }
