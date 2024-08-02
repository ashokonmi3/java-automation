package javaautomation_02_corejava;

class InheritentAccessModifier extends javaautomation_01_corejava.Java_13_AccessModifier {
	InheritentAccessModifier() {
		System.out.println("derived other package constructor");
		// class or package only
		System.out.println("default n = " + n_def);
		// class only
		System.out.println("priivate n_pri = " + n_pri);
		System.out.println("protected n_pro = " + n_pro);
		System.out.println("public n_pub = " + n_pub);
	}
}

// int n = 1;
// private int n_pri = 2;
// protected int n_pro = 3;
// public int n_pub = 4;

//
// Same class - everything
// Same package out side the class- Default, Protected, Public
// Different Package- Public
// Differnt Package child class- Protected and Public is accessible

// In other package only public is accessbile ..
// and protected can be accessed but using inheritacne