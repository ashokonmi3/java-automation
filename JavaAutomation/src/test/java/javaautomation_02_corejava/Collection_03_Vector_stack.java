package javaautomation_02_corejava;

//Vector uses a dynamic array to store the data elements. 
//It is similar to ArrayList. However, 
//It is synchronized and contains many methods that are not 
//the part of Collection framework.
//It is recommended to use the Vector class in the thread-safe implementation only. 
//If you don't need to use the thread-safe implementation,
//you should use the ArrayList, the ArrayList will perform better in such case.

//public class Collection_03_Vector_stack {
//	public static void main(String args[]) {
//		Vector<String> v = new Vector<String>();
//		v.add("Python");
//		v.add("Java");
//		v.add("Scala");
//		v.add("C++");
//		v.addElement("DataScience");
//		v.addElement("Django");
//		Iterator<String> itr = v.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("Element at index 1 is = " + v.get(1));
//		System.out.println("Remove element at index 4: " + v.remove(4));
//		System.out.println("New Value list in vector: " + v);
//
//	}
//}
// ==================
//public class Collection_03_Vector_stack {
//	public static void main(String args[]) {
//		Vector<String> v = new Vector<String>();
//		v.add("Python");
//		v.add("Java");
//		v.add("Scala");
//		v.add("C++");
//		v.addElement("DataScience");
//		v.addElement("Django");
//
//		Iterator<String> itr = v.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//
//		if (v.contains("Django")) {
//			System.out.println("Django is present at the index " + v.indexOf("Django"));
//		} else {
//			System.out.println("Django is not present in the list.");
//		}
//
//	}
//}
//==============

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Collection_03_Vector_stack {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> vector = new Vector<>();

		// Creating threads to perform simultaneous modifications
		Runnable arrayListModification = () -> {
			for (int i = 0; i < 100000; i++) {
				arrayList.add(i);
			}
		};

		Runnable vectorModification = () -> {
			for (int i = 0; i < 100000; i++) {
				vector.add(i);
			}
		};

		Thread thread1 = new Thread(arrayListModification);
		Thread thread2 = new Thread(vectorModification);

		// Starting threads
		thread1.start();
		thread2.start();

		// Waiting for threads to complete
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Checking the sizes of both lists
		System.out.println("ArrayList size: " + arrayList.size());
		System.out.println("Vector size: " + vector.size());
	}
}

// ========================
// The stack is the subclass of Vector.
// It implements the last-in-first-out data structure, i.e., Stack.
// The stack contains all of the methods of Vector class and also provides its
// methods
// like boolean push(), boolean peek(), boolean push(object o), which defines
// its properties.

// public class Collection_03_Vector_stack {
// public static void main(String args[]) {
// Stack<String> stack = new Stack<String>();
// stack.push("Java");
// stack.push("Python");
// stack.push("Scala");
// stack.push("Javascript");
// stack.push("Golang");
// boolean result = stack.empty();
// System.out.println("Is the stack empty? " + result);
// Iterator<String> itr = stack.iterator();
// while (itr.hasNext()) {
// System.out.println(itr.next());
// }
// System.out.println("**********************");
//
// stack.pop();
// Iterator<String> itr1 = stack.iterator();
// while (itr1.hasNext()) {
// System.out.println(itr1.next());
//
// }
// System.out.println("**********************");
//
// // Access element from the top of the stack
// String top = stack.peek();
// // prints stack
// System.out.println("Element at top: " + top);
// }
// }
// ===========================
// public class Collection_03_Vector_stack {
// public static void main(String args[]) {
// Stack<String> stack = new Stack<String>();
// stack.push("Java");
// stack.push("Python");
// stack.push("Scala");
// stack.push("Javascript");
// stack.push("Golang");
// int x = stack.size();
// System.out.println("The stack size is: " + x);
// Iterator<String> itr = stack.iterator();
// while (itr.hasNext()) {
// System.out.println(itr.next());
// }
// System.out.println("**********************");
// int location = stack.search("Java");
// System.out.println("Location of Golang: " + location);
//
// }
// }