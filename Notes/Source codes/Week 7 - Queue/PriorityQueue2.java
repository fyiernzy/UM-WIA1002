import java.util.*;

public class PriorityQueue2 {
  public static void main(String[] args) {
	PriorityQueue<Customer> customerQueue
	  = new PriorityQueue<>(Collections.reverseOrder());

	customerQueue.add(new Customer(3, "Donald" ));
	customerQueue.add(new Customer(1, "Chong" ));
	customerQueue.add(new Customer(2, "Ali" ));
	customerQueue.add(new Customer(4, "Bala" ));
 
	Customer c = customerQueue.peek();
	if (c!=null) {
		System.out.println(c.getName() + " is in queue");
		while ((c = customerQueue.poll())!=null)
			System.out.println(c);
	}
    System.out.println();
  }
}

