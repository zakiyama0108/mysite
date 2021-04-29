package test_package_2021_02;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class TestClass_Deque_001 {
	
	public static void main(String[] args) {
	
		try {
			BlockingDeque<String> dqueue = new LinkedBlockingDeque<>();
			dqueue.offer("a");
			dqueue.offerFirst("b", 2, TimeUnit.SECONDS);
			dqueue.offerLast("c", 5, TimeUnit.MILLISECONDS);

			System.out.println();
			System.out.println(dqueue);
			System.out.println();
			
			System.out.print(dqueue.pollFirst(7, TimeUnit.NANOSECONDS));

			System.out.println();
			System.out.println(dqueue);
			System.out.println();

			System.out.print(dqueue.pollLast(1, TimeUnit.MILLISECONDS));
			
			System.out.println();
			System.out.println(dqueue);
			System.out.println();
		}catch(InterruptedException e) {}
	}
}
