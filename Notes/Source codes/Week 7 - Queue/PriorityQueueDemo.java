import java.util.*;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    System.out.println("------------------------------");

    PriorityQueue<String> queue1 = new PriorityQueue<>();
    queue1.offer("Oklahoma");
    queue1.offer("Indiana");
    queue1.offer("Georgia");
    queue1.offer("Texas");
    System.out.println(queue1.comparator());
    System.out.println(queue1.iterator());
    System.out.println("Priority queue using Comparable:");

    while (queue1.size() > 0) {
      System.out.print(queue1.poll() + " ");
    }

System.out.println("\n====================================");
    PriorityQueue<String> queue2 
      = new PriorityQueue<>(4, Collections.reverseOrder());
    queue2.offer("Oklahoma");
    queue2.offer("Indiana");
    queue2.offer("Indiana");
    queue2.offer("Georgia");
    queue2.offer("Texas");
        System.out.println(queue2.comparator());
        System.out.println(queue2.iterator());
    System.out.println("\nPriority queue using Comparator:");
    while (queue2.size() > 0) {
        System.out.print(queue2.poll() + " ");
    }
    System.out.println();
  }
}

