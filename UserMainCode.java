
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.time.DayOfWeek;

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

	public static int findMaxDistance(Integer a[]) {

		int c = 0, m = 0;

		for (int i = 0; i < a.length - 1; i++) {
			int b = a[i + 1] - a[i];
			if (b < 0)
				b = b * -1;

			if (b > m) {
				m = b;
				c = i + 1;
			}
		}

		return c;
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
			if (i == s) {
				u = a + b;

			}
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
		System.out.println("Enter the value to get sum in fibonacci series: ");
		int n = s.nextInt();
		if (n <= 0) {
			return 0;
		}
		for (int i = 1; i <= n - 1; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			val += n3;
			n1 = n2;
			n2 = n3;

		}
		return val;

	}

	public static int testVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				count++;
			}
		}

		return count;
	}

	public static Integer compareDashes() {
		@SuppressWarnings("resource")
		Scanner cd = new Scanner(System.in);
		int i = 0, j = 0, count = 0;
		String s1 = cd.next();
		String s2 = cd.next();
		int a = s1.length();
		int b = s2.length();
		int l1[] = new int[a];
		int l2[] = new int[b];
		StringTokenizer st1 = new StringTokenizer(s1, "-");
		StringTokenizer st2 = new StringTokenizer(s2, "-");
		while (st1.hasMoreElements()) {
			String x = st1.nextToken();
			l1[i] = x.length();
			i++;
		}
		while (st2.hasMoreElements()) {
			String x2 = st2.nextToken();
			l2[j] = x2.length();
			j++;
		}
		for (int c = 0; c < i; c++) {
			if (l1[c] == l2[c]) {

				count = 1;
			} else {
				count = 0;
				break;
			}
		}
		if (count == 1)
			System.out.println("yes");
		else if (count == 0)
			System.out.println("no");
		return count;

	}

	public static String reshape(String s1, char c) {
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer sb1 = new StringBuffer(s1);
		sb.reverse();
		for (int i = 0; i < (2 * s1.length()) - 1; i++)
			if (i % 2 != 0)
				sb1 = sb.insert(i, c);
		return sb1.toString();
	}

	public static Integer[] removeTens(int s[]) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < s.length; i++) {
			a.add(s[i]);
		}
		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			int x = it.next();
			if (x != 10) {
				b.add(x);
			}
		}
		if (b.size() < s.length) {
			int len = s.length - b.size();
			for (int i = 0; i < len; i++) {
				b.add(0);
			}
		}

		Integer m[] = new Integer[b.size()];
		b.toArray(m);
		return m;
	}

	public static String getLastLetter(String input) {
		String str1 = null;
		StringTokenizer st = new StringTokenizer(input, " ");
		StringBuffer sb = new StringBuffer();
		while (st.hasMoreTokens()) {
			str1 = st.nextToken();
			String str2 = str1.substring(str1.length() - 1);
			String str3 = str2.toUpperCase();
			sb.append(str3).append("$");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	public static String getMaxKeyValue(Map<Integer, String> re) {

		int m = 0;
		String r = "";
		Set<Integer> key = re.keySet();
		for (Integer l : key) {

			if (l > m) {
				m = l;
				r = re.get(l);
			}
		}

		return r;
	}

	public static String getDay(String d) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		DayOfWeek day = DayOfWeek.from(now);
		System.out.println("Date is : " + dtf.format(now) + " And the day is" + day);
		return d;
	}

	public static String getCapital(HashMap<String, String> hm, String state) {
		Iterator<String> it = hm.keySet().iterator();
		String st = "";
		String s = "";
		String val = "";
		while (it.hasNext()) {
			s = it.next();
			if (s.equalsIgnoreCase(state)) {
				val = hm.get(s);
			}
		}
		st = val.toLowerCase() + "$" + s.toLowerCase();
		return st;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(UserMainCode.printCapitalized("everyday is a new beginning"));

		Scanner h = new Scanner(System.in);
		int n = h.nextInt();
		Integer a[] = new Integer[n];
		for (int i = 0; i < n; i++)
			a[i] = h.nextInt();
		System.out.println(UserMainCode.findMaxDistance(a));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower palindrome number :");
		int a1 = sc.nextInt();
		System.out.println("Enter higher palindrome number :");
		int b = sc.nextInt();
		if (UserMainCode.addPalindromes(a1, b) == 0) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("Sum of the palindrome is :" + UserMainCode.addPalindromes(a1, b));
		}

		System.out.println("Enter PAN number :");
		Scanner sca = new Scanner(System.in);
		String s = sca.next();
		int res = UserMainCode.validatePAN(s);
		if (res == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

		int sumOfPrevTwo = 0;
		System.out.println("sum is :" + getSumOfNfibos(sumOfPrevTwo));

		Scanner in = new Scanner(System.in);
		System.out.println("Input the string to check vowels:");
		String str = in.nextLine();
		System.out.print("Number of Vowels in the string: " + testVowels(str) + "\n");
		if (testVowels(str) == 5) {
			System.out.println("Yes, there are 5 vowels");
		} else {
			System.out.println("Nope, 5 vowels are'nt present");
		}

		Scanner so = new Scanner(System.in);
		int n1 = so.nextInt();
		System.out.println(" The given length is : " + n1);
		int[] sr = new int[n1];
		Integer[] sr1 = new Integer[n1];
		for (int i = 0; i < n1; i++) {
			sr[i] = so.nextInt();
		}

		System.out.println(UserMainCode.compareDashes());

		Scanner v = new Scanner(System.in);
		System.out.println("enter the String:");
		String s1 = v.next();
		char c = v.next().charAt(0);
		System.out.println("the formatted string is:" + reshape(s1, c));

		sr1 = UserMainCode.removeTens(sr);
		for (int i = 0; i < n1; i++) {
			System.out.println(sr1[i]);
		}

		Scanner o = new Scanner(System.in);
		String j = o.nextLine();
		System.out.println(getLastLetter(j));

		Scanner op = new Scanner(System.in);
		Map<Integer, String> re = new HashMap<Integer, String>();
		int n11 = op.nextInt();

		for (int i = 0; i < n11; i++)
			re.put(op.nextInt(), op.next());

		String r = UserMainCode.getMaxKeyValue(re);
		System.out.println(r);

		System.out.println(UserMainCode.getDay("Today's date and day"));

		Scanner cs = new Scanner(System.in);
		int n111 = cs.nextInt();
		HashMap<String, String> hm = new HashMap<String, String>();
		for (int i = 0; i < n111; i++) {
			String states = cs.next();
			String capital = cs.next();

			hm.put(states, capital);
		}
		System.out.println(hm);
		String st = cs.next();
		String s11 = UserMainCode.getCapital(hm, st);
		System.out.println(s11);
	}

}
