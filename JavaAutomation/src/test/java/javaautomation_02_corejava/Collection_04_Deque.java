package javaautomation_02_corejava;

import java.util.ArrayDeque;

// Queue, Deque interface
// ------------------
// 1) Prioroty Queue
// 2) Array Deque
//PriorityQueue: Implementation of Queue using a priority heap.
//ArrayDeque: Implementation of Deque using resizable arrays.
// --------------------
// maintains the first-in-first-out order.
// It can be defined as an ordered list that is used to hold the elements which
// are about to be processed.
// There are various classes like PriorityQueue,
// Deque, and ArrayDeque which implements the Queue interface.
// ======
// PriorityQueue
// The PriorityQueue class implements the Queue interface.
// It holds the elements or objects which are to be processed by their
// priorities.
// PriorityQueue doesn't allow null values to be stored in the queue.
// Natural ordering 
// ===============
//public class Collection_04_Deque {
//	public static void main(String args[]) {
//
//		PriorityQueue<String> queue = new PriorityQueue<String>();
//		queue.add("1");
//		queue.add("d");
//		queue.add("z");
//		queue.add("v");
//		queue.add("a");
//		queue.add("s");
//		queue.add("A");
//		queue.add("B");
//		queue.add("Z");
//		System.out.println("queue:" + queue);
//
//		while (!queue.isEmpty()) {
//			System.out.println(queue.poll()); // Poll removes and returns the head of the
//			// queue
//
//			// queue.add("1");
//			// Iterator itr = queue.iterator(); // util
//			//
//			// while (itr.hasNext()) {
//			// System.out.println(itr.next());
//			// }
//			//
//			// // // queue.add("abc");
//			// // // queue.add("stu");
//			// // // queue.add("wxy");
//			// //
//			// // System.out.println("queue:" + queue);
//			// //
//		}
//	}
//}
// =================

// public class Collection_04_Deque {
// public static void main(String[] args) {
// // Creating a PriorityQueue of integers with a custom Comparator for reverse
// // order
// PriorityQueue<Integer> pq = new PriorityQueue<>();
//
// // Adding elements to the PriorityQueue
// pq.add(8);
// pq.add(5);
// pq.add(10);
// pq.add(3);
// // pq.add(8);
// System.out.println("queue:" + pq);
//
// // Removing elements (they will be in descending order due to reverseOrder
// // Comparator)
// while (!pq.isEmpty()) {
// System.out.println(pq.poll()); // Poll removes and returns the head of the
// // queue
// }
// }
// }
// ======================
//public class Collection_04_Deque {
//	public static void main(String args[]) {
//
//		PriorityQueue<String> queue = new PriorityQueue<String>();
//		queue.add("z");
//		queue.add("v");
//		queue.add("a");
//		queue.add("s");
//		queue.add("1");
//
//		System.out.println("queue:" + queue);
//
//		System.out.println("head:" + queue.element());
//		System.out.println("head:" + queue.peek());// Retrieves, but does not remove,
//		// the head of the priority queue
//		System.out.println("iterating the queue elements:");
//		Iterator itr = queue.iterator(); // util
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		queue.remove();
//		queue.poll();// Retrieves and removes the head of the priority queue (
//		System.out.println("after removing two elements:");
//		Iterator<String> itr2 = queue.iterator();
//		while (itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
//
//	}
//}
// ===========================
// Dequeue
// Deque interface extends the Queue interface.
// In Deque, we can remove and add the elements from both the side.
// Deque stands for a double-ended queue which
// enables us to perform the operations at both the ends.
// ArrayDeque class implements the Deque interface. It facilitates us to use the
// Deque. Unlike queue, we can add or delete the elements from both the ends.

// ArrayDeque is faster than ArrayList and Stack and has no capacity
// restrictions.
//
//public class Collection_04_Deque {
//	public static void main(String[] args) {
//		// Creating Deque and adding elements
//		Deque<String> deque = new ArrayDeque<String>();
//		deque.add("Java");
//		deque.add("Python");
//		deque.add("Scala");
//		// Traversing elements
//		for (String str : deque) {
//			System.out.println(str);
//		}
//	}
//}
// =================

public class Collection_04_Deque {
	public static void main(String[] args) {
		// Creating Deque and adding elements
		// Deque<String> deque = new ArrayDeque<String>();
		ArrayDeque<String> deque = new ArrayDeque<String>();

		deque.add("Java");
		deque.add("Python");
		deque.add("Scala");
		deque.offer("c");
		deque.offer("cpp");
		deque.offerFirst("Golang");
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}
		System.out.println("*****************");

		deque.pollLast();
		deque.pollFirst();

		for (String str : deque) {
			System.out.println(str);
		}
	}
}
