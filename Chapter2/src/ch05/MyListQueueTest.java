package ch05;

public class MyListQueueTest {

	public static void main(String[] args) {

		MyListQueue listQueue = new MyListQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		listQueue.enQueue("D");
		listQueue.enQueue("E");
		listQueue.printAll();
		
		System.out.println("=============");
		
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
		
		listQueue.printAll();
	}
}
