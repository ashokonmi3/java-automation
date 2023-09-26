package collectiontutorial;

import java.util.regex.Pattern;

// boolean matches() test whether the regular expression matches the pattern.

// boolean find() finds the next expression that matches the pattern.
// boolean find(int start) finds the next expression that matches the pattern
// from the given start number.
// String group() returns the matched subsequence.
// int start() returns the starting index of the matched subsequence.
// int end() returns the ending index of the matched subsequence.
// int groupCount() returns the total number of the matched subsequence.

// public class Javaregex {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// // 1st way
// Pattern p = Pattern.compile(".s");// . represents single character
// Matcher m = p.matcher("as");
// boolean b = m.matches();
//
// // 2nd way
// boolean b2 = Pattern.compile(".s").matcher("as").matches();
//
// // 3rd way
// boolean b3 = Pattern.matches(".s", "as");
//
// System.out.println(b + " " + b2 + " " + b3);
// }
//
// }
// ========================
// class Javaregex {
// public static void main(String args[]) {
// System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
// System.out.println(Pattern.matches(".s", "mk"));// false (2nd char is not s)
// System.out.println(Pattern.matches(".s", "mst"));// false (has more than 2
// char)
// System.out.println(Pattern.matches(".s", "amms"));// false (has more than 2
// char)
// System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is s)
// }
// }
// =====================
// class Javaregex {
// public static void main(String args[]) {
// System.out.println(Pattern.matches("[amn]", "abcd"));// false (not a or m or
// n)
// System.out.println(Pattern.matches("[amn]", "a"));// true (among a or m or n)
// System.out.println(Pattern.matches("[amn]", "ammmna"));// false (m and a
// comes more than once)
// }
// }
// ==================
//class Javaregex {
//	public static void main(String args[]) {
//		System.out.println("? quantifier ....");
//		System.out.println(Pattern.matches("[amn]?", "a"));
//		System.out.println(Pattern.matches("[amn]?", "b"));
//
//		// true // (a or m or // n // comes // one time)
//		System.out.println(Pattern.matches("[amn]?", "ab"));// false (a comes more
//		// than one time)
//		System.out.println(Pattern.matches("[amn]?", "aammmnn"));// false (a m and n
//		// comes more than one time)
//		System.out.println(Pattern.matches("[amn]?", "aazzta"));// false (a comes
//		// more than one time)
//		System.out.println(Pattern.matches("[amn]?", "amn"));// false (a or m or n
//		// must come one time)
//
//		System.out.println("+ quantifier ....");
//		System.out.println(Pattern.matches("[amn]+", "a"));// true (a or m or n once
//		// or more times)
//		System.out.println(Pattern.matches("[amn]+", "aaa"));// true (a comes more
//		// than one time)
//		System.out.println(Pattern.matches("[amn]+", "aammmnn"));// true (a or m or n
//		// comes more than once)
//		System.out.println(Pattern.matches("[amn]+", "aazzta"));// false (z and t are
//		// not matching pattern)
//		System.out.println(Pattern.matches("amn+", "amnnnnnn"));// false (z and t are
//		System.out.println(Pattern.matches("am+n", "ammmmmmn"));// false (z and t are
//		System.out.println(Pattern.matches("am+n", "an"));// false (z and t are
//
//		System.out.println("* quantifier ....");
//		System.out.println(Pattern.matches("amn*", "amnnnnnn"));// false (z and t are
//		System.out.println(Pattern.matches("am*n", "ammmmmmn"));// false (z and t are
//		System.out.println(Pattern.matches("am*n", "an"));// false (z and t are
//		// true (a or m or n
//		// may come zero or more times)
//
//	}
//}
// ====================
//class Javaregex {
//	public static void main(String args[]) {
//		System.out.println("metacharacters d....");// d means digit
//
//		System.out.println(Pattern.matches("\\d", "abc"));// false (non-digit)
//		System.out.println(Pattern.matches("\\d", "1"));
//		// true (digit and comes once)
//		System.out.println(Pattern.matches("\\d+", "4443"));
//		// false (digit but comes more than once)
//		System.out.println(Pattern.matches("\\d", "323abc"));
//		// false (digit and char)
//
//		System.out.println("metacharacters D....");// D means non-digit
//
//		System.out.println(Pattern.matches("\\D+", "abc"));
//		// false (non-digit but comes more than once)
//		System.out.println(Pattern.matches("\\D", "1"));// false (digit)
//		System.out.println(Pattern.matches("\\D", "4443"));// false (digit)
//		System.out.println(Pattern.matches("\\D", "323abc"));
//		// false (digit and char)
//		System.out.println(Pattern.matches("\\D", "m"));
//		// true (non-digit and comes once)
//
//		System.out.println("metacharacters D with quantifier....");
//		System.out.println(Pattern.matches("\\D*", "mak"));
//		// true (non-digit and may come 0 or more times)
//
//	}
//}
// =======================
//
//class Javaregex {
//	public static void main(String args[]) {
//		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));// true
//		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));
//		// false(more than 6 char)
//		System.out.println(Pattern.matches("[a-zA-Z0-9]*", "kkvarun32"));
//
//		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true
//		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
//		// false ($is not matched)
//	}
//}
// ===============
class Javaregex {
	public static void main(String args[]) {
		System.out.println("by character classes and quantifiers ...");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));// true
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));// true

		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));
		// false(11 characters)
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));// false
		// (starts from 6)
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));// true

		System.out.println("by metacharacters ...");
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));// true
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));// false
		// (starts from 3)

	}
}