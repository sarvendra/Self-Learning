import java.util.*;

public class CountDown {
	public static void main(String[] args) throws InterruptedException {
		Integer time = Integer.parseInt(args[0]);
		Queue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = time; i > 0; i--) {
			queue.add(i);
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
			Thread.sleep(1000);
		}
	}
}