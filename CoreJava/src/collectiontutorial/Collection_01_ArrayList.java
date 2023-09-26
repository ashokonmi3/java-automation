package collectiontutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//void add(int index, E element): 	It is used to insert the specified element at the specified position in a list.
//boolean add(E e)	:It is used to append the specified element at the end of a list.
//boolean addAll(Collection<? extends E> c)	: It is used to append all of the elements in the specified collection to the end of a list.
//boolean addAll(int index, Collection<? extends E> c)	: It is used to append all the elements in the specified collection, starting at the specified position of the list.
//void clear()	: It is used to remove all of the elements from this list.
//boolean equals(Object o)	: It is used to compare the specified object with the elements of a list.
//int hashcode()	:It is used to return the hash code value for a list.
//E get(int index)	:It is used to fetch the element from the particular position of the list.
//boolean isEmpty()	:It returns true if the list is empty, otherwise false.
//int lastIndexOf(Object o)	It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
//Object[] toArray()	It is used to return an array containing all of the elements in this list in the correct order.
//<T> T[] toArray(T[] a)	It is used to return an array containing all of the elements in this list in the correct order.
//boolean contains(Object o)	It returns true if the list contains the specified element
//boolean containsAll(Collection<?> c)	It returns true if the list contains all the specified element
//int indexOf(Object o)	It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
//E remove(int index)	It is used to remove the element present at the specified position in the list.	
//boolean remove(Object o)	It is used to remove the first occurrence of the specified element.	
//boolean removeAll(Collection<?> c)	It is used to remove all the elements from the list.	
//void replaceAll(UnaryOperator<E> operator)	It is used to replace all the elements from the list with the specified element.	
//void retainAll(Collection<?> c)	It is used to retain all the elements in the list that are present in the specified collection.	
//E set(int index, E element)	It is used to replace the specified element in the list, present at the specified position.	
//void sort(Comparator<? super E> c)	It is used to sort the elements of the list on the basis of specified comparator.	
//Spliterator<E> spliterator()	It is used to create spliterator over the elements in a list.	
//List<E> subList(int fromIndex, int toIndex)	It is used to fetch all the elements lies within the given range.	
//int size()	It is used to return the number of elements present in the list.
//=====================================
//class Collection_01_ArrayList {
//	//
//	public static void main(String[] args) {
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Python");
//		al.add("Java");
//		al.add("Scala");
//		al.add("C");
//		al.add("CPP");
//		System.out.println("An initial list of elements: " + al);
//		// Removing specific element from arraylist
//		System.out.println("Size of arralist: " + al.size());
//		System.out.println("0th element of arralist: " + al.get(0));
//
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
//
//		al.remove("C");
//		System.out.println("After invoking remove(object) method: " + al);
//		al.remove(3); // Removing element on the basis of specific position
//
//		System.out.println("After invoking remove(index) method: " + al);
//
//		ArrayList<String> al2 = new ArrayList<String>();// Creating another arraylist
//		al2.add("Django");
//		al2.add("React");
//		al.addAll(al2);
//		System.out.println("Updated al1 list : " + al);
//		al.removeAll(al2); // Removing all the new elements from arraylist
//		System.out.println("After update al1: " + al);
//
//		System.out.println("Is ArrayList Empty: " + al.isEmpty());
//		System.out.println("Before update: " + al.get(1));
//		al.set(1, "Datascience"); // Updating an element at specific position
//
//		System.out.println("After update al1: " + al);
//
//		System.out.println("After invoking removeAll() method: " + al); // Removing all the elements available in the
//																		// list
//
//		al.clear();
//		System.out.println("After invoking clear() method on al1: " + al);
//	}
//}

// ====================================

public class Collection_01_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(100);
		myNumbers.add(115);
		myNumbers.add(20);
		myNumbers.add(25);
		int index = myNumbers.indexOf(20);
		System.out.println(index);

		for (int i : myNumbers) {
			System.out.println(i);
		}
		Collections.sort(myNumbers); // Sort myNumbers
		System.out.println("After sorting ");

		for (int j : myNumbers) {
			System.out.println(j);
		}
		System.out.println("Iterating");
		// System.out.println(myNumbers);
		Iterator itr = myNumbers.iterator();// util
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println("Code inbetween perfome other operation");
		System.out.println("iterator explaination");
		System.out.println(itr.next());

		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("Code inbetween perfome other operation");
			System.out.println("iterator explaination");
			System.out.println(itr.next());

		}
	}
}
