package corejavapackage;

class BoxSuper {
	private double height;
	private double depth;
	private double width;

	// // // construct clone of an object
	BoxSuper(BoxSuper ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// // // // constructor used when all dimensions specified
	BoxSuper(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// // // // // constructor used when no dimensions specified
	BoxSuper() {
		width = -1; // use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // box
	}

	BoxSuper(double len) {
		width = height = depth = len;
	}

	double volume() {
		return width * height * depth;
	}
}

// BoxWeight now fully implements all constructors.
class BoxWeight1 extends BoxSuper {
	double weight; // weight of box
	// // // construct clone of an object

	BoxWeight1(BoxWeight1 ob) { // pass object to constructor
		super(ob);// this will call parent class constructor which takes object as parameter
		// width = ob.width;
		// height = ob.height;
		// depth = ob.depth;
		weight = ob.weight;
	}

	//
	// // // // constructor when all parameters are specified
	BoxWeight1(double w, double h, double d, double m) {
		super(w, h, d); // call superclass constructor
		// height=20
		weight = m;
	}

	BoxWeight1() {
		super();
		weight = -1;
	}

	//
	// // constructor used when cube is created
	BoxWeight1(double len, double m) {
		super(len);
		weight = m;
	}
}

//
////
public class A0015_SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
		BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
		BoxWeight1 mybox3 = new BoxWeight1(); // default
		BoxWeight1 mycube = new BoxWeight1(3, 2);
		BoxWeight1 myclone = new BoxWeight1(mybox1);
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);
		System.out.println();
		vol = mybox3.volume();
		System.out.println("Volume of mybox3 is " + vol);
		System.out.println("Weight of mybox3 is " + mybox3.weight);
		System.out.println();
		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
		System.out.println("Weight of myclone is " + myclone.weight);
		System.out.println();
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		System.out.println("Weight of mycube is " + mycube.weight);
		System.out.println();

	}

}
// ======================================================

// Using super to overcome name hiding.
// class ASuper {
// int i;
// }

//// Create a subclass by extending class A.
//
// class Bsub extends ASuper {
// int i; // this i hides the i in A
//
// Bsub(int a, int b) {
// super.i = a; // i in A
// i = b; // i in B
// }
//
// // //
// void show() {
// System.out.println("i in superclass: " + super.i);
// System.out.println("i in subclass: " + i);
// }
// }
//
////
// class SuperDemo {
// public static void main(String args[]) {
// Bsub subOb = new Bsub(1, 2);
// subOb.show();
// }
// }
// =======================================================
// super can be used to invoke parent class method if both has same name

// class Animal {
// void eat() {
// System.out.println("eating...");
// }
// }
//
// class Dog extends Animal {
// void eat() {
// System.out.println("eating bread...");
// }
//
// void bark() {
// System.out.println("barking...");
// }
//
// void work() {
// super.eat();
// bark();
// eat();
//
// }
// }
//
// class SuperDemo {
// public static void main(String args[]) {
// Dog d = new Dog();
// d.work();
// d.eat();
//
// }
// }

// ===========================
// class Person {
// int id;
// String name;
//
// Person(int id1, String name1) {
// id = id1;
// name = name1;
// }
// }
//
// class Emp extends Person {
// float salary;
//
// Emp(int id1, String name1, float salary1) {
// super(id1, name1);// reusing parent constructor
// salary = salary1;
// }
//
// void display() {
// System.out.println(id + " " + name + " " + salary);
// }
// }
//
// class SuperDemo {
// public static void main(String[] args) {
// Emp e1 = new Emp(1, "ankit", 45000f);
// e1.display();
// }
// }
