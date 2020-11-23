
import java.util.Scanner;

public class UserMainCode {

	public static String printCapitalized(String str) {

		String words[] = str.split("\\s");
		String printCapitalized = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			printCapitalized += first.toUpperCase() + afterfirst + " ";

		}
		return printCapitalized.trim();
	}

	public static int addPalindromes(int a, int b) {
		int t = 0, s = 0, r, u = 0;
		for (int i = a; i <= b; i++) {
			t = i;
			while (t > 0) {
				r = t % 10;
				s = s * 10 + r;
				t = t / 10;
			}
			if (i == s)
				u = a + b;
		}
		return u;
	}

	public static int validatePAN(String s) {
		int res = 0;
		if (s.length() == 8) {
			if (s.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}")) {
				res = 1;
			} else {
				res = 2;

			}

		}
		return res;
	}

	public static int getSumOfNfibos(int getSumOfNfibos) {
		int n3 = 0;
		int n1 = 1;
		int n2 = 0;
		int val = 0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = s.nextInt();
		if (n <= 0) {
			return 0;
		}
		for (int i = 1; i <= n - 1; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			val = +n3;
			System.out.println("SUM IS" + val);
			n1 = n2;
			n2 = n3;

		}
		return val;

	}

	public static int testVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}

		return count;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(UserMainCode.printCapitalized("everyday is a new beginning"));

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(UserMainCode.addPalindromes(a, b));

		String s = sc.next();
		int res = UserMainCode.validatePAN(s);
		if (res == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

		int sumOfPrevTwo = 0;
		System.out.println(getSumOfNfibos(sumOfPrevTwo));

		Scanner in = new Scanner(System.in);
		System.out.println("Input the string:");
		String str = in.nextLine();
		System.out.print("Number of Vowels in the string: " + testVowels(str) + "\n");
		if (testVowels(str) == 5) {
			System.out.println("Yes, there are 5 vowels");
		} else {
			System.out.println("Nope");
		}

	}
}
