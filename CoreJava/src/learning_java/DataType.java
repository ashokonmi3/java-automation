package corejavapackage;

// Widening or Automatic Type Conversion
// The two data types are compatible.
// When we assign value of a smaller data type to a bigger data type.

// BYTE--> Short-->Int-->Long-->Float-->Double

//public class DataType {
//	public static void main(String[] args) {
//		int i = 100;
//
//		// automatic type conversion
//		long l = i;
//
//		// automatic type conversion
//		float f = l;
//		System.out.println("Int value " + i);
//		System.out.println("Long value " + l);
//		System.out.println("Float value " + f);
//	}
//}

// Narrowing or Explicit Conversion

// If we want to assign a value of larger data type to a smaller data type we
// perform explicit type casting or narrowing.
//
// This is useful for incompatible data types where automatic conversion cannot
// be done.
// Here, target-type specifies the desired type to convert the specified value
// to.

// type for explicit type conversion
//public class DataType {
//	public static void main(String[] argv) {
//		char ch = 'c';
//		int num = 88;
//		ch = num;
//	}
//}

// Java program to illustrate explicit type conversion
class DataType {
	public static void main(String[] args) {
		double d = 100.04;

		// explicit type casting
		long l = (long) d;

		// explicit type casting
		int i = (int) l;
		System.out.println("Double value " + d);

		// fractional part lost
		System.out.println("Long value " + l);

		// fractional part lost
		System.out.println("Int value " + i);
	}
}
