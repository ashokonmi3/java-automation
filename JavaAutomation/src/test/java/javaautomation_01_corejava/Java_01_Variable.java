package javaautomation_01_corejava;

/*
 * This is to demonstrate the multi line comments how comments can be written
 * this is again a line this is again a line
 */

// Java project = Organization
// Organization contains what -- > departments ( Finance, IT,Law, Admin, HR)
// Java Project --> packages
// Departments --> People
// packages --> classes

// Enable the auto suggestions

// Step 1 – Open eclipse > Window> Preferences
//
// Step 2 – Java > Editor > Content Assist > Advanced
//
// Step 3- You can click on all checkboxes and click on apply first then click
// on Apply and Save.
//
// You can restart the eclipse and make sure changes should be saved.

// Window->Preferences->Java->Editor->SaveActions and check the Format source
// code option.
// ===========================

// Class Names:
// PascalCase: Class names start with an uppercase letter and follow CamelCase
// (e.g., MyClass, PersonDetails).
// Descriptive and Nouns: Class names should be meaningful and represent a noun
// or noun phrase.

// Interface Names:
// PascalCase: Similar to class names, interface names also start with an
// uppercase letter and use CamelCase (e.g., MyInterface, Drawable).
// Descriptive and Adjectives/Nouns: Interface names should be descriptive and
// often represent an adjective or a noun phrase.

// Method Names:
// camelCase: Method names start with a lowercase letter and follow CamelCase
// (e.g., calculateValue(), getUserInfo()).
// Verb or Verb-Phrase: Method names typically represent actions or behaviors
// and should be descriptive.

// Variable Names:
// camelCase: Variable names follow camelCase (e.g., myVariable, userDetails).
// Descriptive and Meaningful: Variable names should be descriptive and
// represent the data they hold or the purpose they serve.

// Constant Names:
// UPPERCASE_WITH_UNDERSCORES: Constants are written in uppercase letters with
// underscores separating words (e.g., MAX_VALUE, PI_VALUE).
// All Capitals: Constants use all uppercase letters to differentiate them from
// variables.

// Package Visibility:
// Lowercase: Methods, fields, and classes declared with package-private access
// use lowercase names (e.g., myPackage, myMethod()).

// Other Conventions:
// Acronyms: For acronyms or abbreviations, follow CamelCase (e.g., HTTPService,
// XMLParser).
// Meaningful and Clear: Naming should be meaningful, clear, and consistent to
// enhance code readability and maintainability.

// =====================================

// comment
// Information about programs -- This is my first program
// created by - ashok
// date : 23 April 2019
// place: bangalore
//
// public class Java_01_Variable {
//
// public static void main(String[] args) {// this is comment
// System.out.println("Welcome to selenium");
// System.out.println("Welcome to java");
// System.out.println("Welcome to QA Class");
// System.out.println("Welcome to Ashok's class");
//
// }
// }
//// ctrl+/ comment the code

// ctrl+f11
// green key Run
// right click and run as java application
// Public-
// Access modifier (protected, Private, Default,public)
// class - it is keyword
// Java_01_Variable- name of class
// public
// static-non access modifier
// void - retrun type of function
// main - name of method, starting point
// Running the program
// With Ctrl + W we can close opened tab. With Ctrl + Shift + E we can select
// which files we want to close
// =====================

// public class Java_01_Variable {
//
// public static void main(String[] args) {
// int a; // Declaration
// a = 10; // Initialization
// System.out.println(a);
// int b; // Declaration
// b = 100; // Initialization
// System.out.println(b);
// int c = 100; // Initialization
// System.out.println(c);
//
// }
// }

//// ===========================
//
// public class Java_01_Variable {
// public static void main(String[] args) {
// int a = 10;
// System.out.println(a);
// a = a + 10;
// System.out.println(a);
// int b = a;
// System.out.println(b);
// }
// }

// ========================
// Declaration of multiple variables in a statement
// public class Java_01_Variable {
// public static void main(String[] args) {
// int a, b, c, d;
// a = 10;
// b = 20;
// c = 30;
// d = 100;
// int e = 99, f = 9, j = 555;
// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// System.out.println(d);
// System.out.println(e);
// System.out.println(j);
//
// }
// }
//// ===================================
//// // // Declaration of multiple variable and Assigning values.
// public class Java_01_Variable {
// public static void main(String[] args) {
// int i = 50;// 4 byte by default 2147483647
// long l = 333333;// 8 byte highest value 9,223,372,036,854,775,807
// float f = 10.0f;// 4 byte 1231231.0
// double d = 92.90909;// 8 byte by default 123412313131312131.909
// char c = 'A';
// String s = "selenium";
// System.out.println(i);
// System.out.println(l);
// System.out.println(f);
// System.out.println(d);
// System.out.println(c);
// System.out.println(s);
// }
// }
// ===============
// public class Java_01_Variable {
// public static void main(String[] args) {
// int a;
// a = 10;
//
// float e = 99;
// System.out.println(a);
// System.out.println(e);
//
// }
// }
// ===============
// public class Java_01_Variable {
// public static void main(String[] args) {
// int a;
// a = 10.0;
// System.out.println(a);
//
// }
// }
// =================

//
// public class Java_01_Variable {
// public static void main(String[] args) {
// int a;
// a = 10;
// System.out.println(a);
// System.out.println("The value of a is " + a);
//
// }
// }

// ===============
// public class Java_01_Variable {
// public static void main(String[] args) {
//
// String s = "Selenium", name = "ashok";
// int b = 10;
// System.out.println("The string out put is " + s);
// System.out.println("The int b out put is " + b);
// System.out.println("My name is " + name);
//
// }
// }

// ============================
// A- 65, B - 66 , C- 67 ...
// a - 97 b 99 c = 101....
//
// public class Java_01_Variable {
// public static void main(String[] args) {
// char x = 'a';
// char ch1 = 65;// 'A'
// char ch2 = 99;// c
// int a = 65;
// System.out.println("the integer out put of character ch1 is " + ch1);
// System.out.println("the integer out put of character ch2 is " + ch2);
// System.out.println("the char x out put is " + x);
// System.out.println("the int a is " + a);
//
// }
// }

// ===========================
// scanner class for user input
// class Java_01_Variable {
// public static void main(String[] args) {
// System.out.print("Enter an integer: ");
// Scanner i = new Scanner(System.in);
// int abc = i.nextInt();
// System.out.println("You entered " + abc);
// System.out.println("Double of entered value " + 2 * abc);
// System.out.println("abc* 3 is " + 3 * abc);
//
// }
// }

//// ===================
// class Java_01_Variable {
// public static void main(String[] args) {
//
// Scanner userinput = new Scanner(System.in);
//
// // // Getting float input
// System.out.print("Enter float: ");
// float myFloat = userinput.nextFloat();
// System.out.println("Float entered = " + myFloat);
//
// // // // Getting double input
// System.out.print("Enter double: ");
// double myDouble = userinput.nextDouble();
// System.out.println("Double entered = " + myDouble);
// //
// // Getting String input
// System.out.print("Enter text: ");
// String myString = userinput.next();
// System.out.println("string entered = " + myString);
// userinput.close();
// }
// }
//// ===============
//
// =====================
/// *Assignment
// 1.Install java and eclipse
// 2. Write a Java program to print 'Hello' on screen
// 2 write a program to take your name as input and print "welcome to java sel
// world + your name"
// 3. Create the git account and upload these files

// ashokonmi3@gmail.com
