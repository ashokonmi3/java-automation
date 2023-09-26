package corejavapackage;
/*
 * The final keyword in java is used to restrict the user. The java final
 * keyword can be used in many context. Final can be: variable method class
 * 
 * Use of final 1) stop value change 2) stop method overriding 3) Inheritence
 * 
 */

// ================================
/// Stop value change

//class FinalDemo {
//	final int speedlimit = 90;// final variable
//
//	void run() {
//		speedlimit = 400;
//	}
//
//	public static void main(String args[]) {
//		FinalDemo obj = new FinalDemo();
//		obj.run();
//	}
//}

// =========================
// 2) Java final method
// If you make any method as final, you cannot override it.

//class Bike {
//	final void run() {
//		System.out.println("running");
//	}
//}
//
//class FinalDemo extends Bike {
//	void run() {
//		System.out.println("running safely with 100kmph");
//	}
//
//	public static void main(String args[]) {
//		FinalDemo honda = new FinalDemo();
//		honda.run();
//	}
//}
// =========================
// 3) final class can not be inherited
final class Bike {
}

class Honda1 extends Bike {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Honda1 honda = new Honda1();
		honda.run();
	}
}