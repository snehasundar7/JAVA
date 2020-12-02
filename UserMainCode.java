
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.text.ParseException;
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
		return 0;

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

	public static int validateNumber() {
		Scanner f = new Scanner(System.in);
		System.out.println("enter the length of String array: ");
		int n = f.nextInt();
		String[] sarray = new String[n];
		System.out.println("enter the string values to check digits: ");
		for (int i = 0; i < n; i++) {
			sarray[i] = f.next();
		}
		for (String s : sarray) {
			for (int j = 0; j < s.length(); j++) {
				if (!Character.isDigit(s.charAt(j))) {
					System.out.println("Invalid");
					return -1;
				} else {
					System.out.println("Valid");

				}
			}
		}
		return n;
	}

	public static String getDay() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		DayOfWeek day = DayOfWeek.from(now);
		System.out.println("Date is : " + dtf.format(now) + " And the day is" + day);
		return "";
	}

	static String extractMax(String str) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String with delimeter");
		str = sc.nextLine();
		System.out.println("Enter the delimeter");
		String str1 = sc.nextLine();
		String word = "";
		str = str + str1;
		System.out.println(str);
		List<String> liststring = new ArrayList<String>();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != str1.charAt(0)) {
				word = word + str.charAt(i);

			}

			else {
				if (word.length() != 0)
					liststring.add(word);
				word = "";

			}

		}

		String longstring = liststring.get(0);
		for (String val : liststring) {
			if (val.length() > longstring.length())
				longstring = val;
		}
		return longstring;
	}

	public static String getCapital(Map<String, String> mp, String s) {

		{
			String rs = "";
			Set<String> k = mp.keySet();
			for (String key : k) {
				if (key.equals(s)) {
					rs = (mp.get(key)).toLowerCase() + "$" + key.toLowerCase();
				}
			}
			return rs;

		}
	}

	public static String storeMaxVowelWord(String s) {
		int m = 0;
		String op = "";
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			String v = st.nextToken();
			String r = v;
			r = r.replaceAll("[aeiouAEIOU]", "");

			if (m < (v.length() - r.length())) {
				m = v.length() - r.length();
				op = v;
			}
		}
		return op;
	}

	public static int checkUnique(String pw) {

		int c = 0;
		StringBuffer sb = new StringBuffer(pw);
		for (int i = 0; i < sb.length(); i++) {
			c = 0;
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
					c++;
					j--;
				}

			}
			if (c >= 1) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(sb);
		return sb.length();
	}

	public static int addPrimeIndex() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int s = sc.nextInt();
		System.out.println("Enter the array to avg prime index: ");
		int a[] = new int[20];
		int flag = 0, sum = 0, c = 0, j;
		for (int i = 0; i < s; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 2; i < a.length; i++) {
			for (j = 2; j < i; j++) {

				if (i % j == 0) {
					c++;

				}
			}
			if (c == 0) {
				sum += a[i];
				flag++;
			}
		}
		int avg = sum / flag;
		return avg;
	}

	public static ArrayList<Integer> performSetOperations(ArrayList<Integer> a12, ArrayList<Integer> a2, char c) {
		ArrayList<Integer> op1 = new ArrayList<Integer>();
		int k = 0;
		switch (c) {
		case '+':
			a12.removeAll(a2);
			a12.addAll(a2);
			op1 = a12;
			break;
		case '*':
			a12.retainAll(a2);
			op1 = a12;
			break;
		case '-':
			for (int i = 0; i < a12.size(); i++) {
				k = 0;
				for (int j = 0; j < a2.size(); j++) {
					if (a12.get(i) == a2.get(j))
						k = 1;
				}
				if (k == 0)
					op1.add(a12.get(i));
			}
			break;
		}
		return op1;
	}

	public static int getMaxSpan(int[] x, int n) {
		int gap = 0, max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (x[i] == x[j]) {
					gap = j;
				}
			}
			if (gap - i > max)
				max = gap - i;
		}
		return max + 1;
	}

	public static String highestScorer() {
		@SuppressWarnings("resource")
		Scanner c6 = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int n = c6.nextInt();
		int i;
		String k = "", s1 = "";
		int sum = 0, max = 0;
		System.out.println("Enter student-m1-m2-m3: ");
		ArrayList<String> al = new ArrayList<String>();
		for (i = 0; i < n; i++) {
			al.add(c6.next());
		}
		for (i = 0; i < al.size(); i++) {
			k = al.get(i);
			StringTokenizer st = new StringTokenizer(k, "-");

			while (st.hasMoreTokens()) {
				String s = st.nextToken();
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				sum = a + b + c;
				if (sum > max) {
					max = sum;
					s1 = s;
				}
			}
		}
		System.out.println("Highest mark is obtained by: ");
		System.out.println(s1);
		return "";
	}

	public static String getWordWithMaximumVowels(String s7) {
		int m1 = 0;
		String ol = "";
		StringTokenizer su = new StringTokenizer(s7, " ");
		while (su.hasMoreTokens()) {
			String v = su.nextToken();
			String r = v;
			r = r.replaceAll("[aeiouAEIOU]", "");

			if (m1 < (v.length() - r.length())) {
				m1 = v.length() - r.length();
				ol = v;
			}
		}
		return ol;
	}

	public static int testOrderVowels() {
		@SuppressWarnings("resource")
		Scanner o = new Scanner(System.in);
		System.out.println("enter the string to check vowels: ");
		String sa = o.nextLine();
		int n = sa.length();
		char c = (char) 64;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (sa.charAt(i) > 96 && sa.charAt(i) < 123) {
				if (sa.charAt(i) == 'a' || sa.charAt(i) == 'e' || sa.charAt(i) == 'i' || sa.charAt(i) == 'o'
						|| sa.charAt(i) == 'u') {

					count++;
					if (sa.charAt(i) < c) {
						System.out.println("Invalid");
						return 0;
					} else {
						c = sa.charAt(i);
					}
				}
			}
		}

		if (count == 5) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		return count;
	}

	public static void swapPairs(String s0) {

		StringBuffer sb = new StringBuffer();
		int l = s0.length();
		if (l % 2 == 0) {
			for (int i = 0; i < s0.length() - 1; i = i + 2) {
				char a = s0.charAt(i);
				char b = s0.charAt(i + 1);
				sb.append(b).append(a);
			}

		} else {
			for (int i = 0; i < s0.length() - 1; i = i + 2) {
				char a = s0.charAt(i);
				char b = s0.charAt(i + 1);
				sb.append(b).append(a);

			}
			sb.append(s0.charAt(l - 1));
			System.out.println(sb);
		}
	}

	public static int getdigits(String s) {

		char arr[] = s.toCharArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i])) {
				String str = String.valueOf(arr[i]);
				int n = Integer.parseInt(str);
				sum = sum + n;
			}
		}

		if (s.replaceAll("[a-zA-Z]", "").isEmpty()) {

			sum = -1;
		}

		return sum;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException {
		System.out.println(UserMainCode.printCapitalized("everyday is a new beginning"));

		Scanner h = new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int n = h.nextInt();
		System.out.println("Enter the numbers :");
		Integer a[] = new Integer[n];
		for (int i = 0; i < n; i++)
			a[i] = h.nextInt();
		System.out.println("The Maximum distance is in the index :");
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

		System.out.println("Enter the two string to compare with delimiter:");
		System.out.println(UserMainCode.compareDashes());

		Scanner v = new Scanner(System.in);
		System.out.println("enter the String to reverse and add delimiter:");
		String s1 = v.next();
		char c = v.next().charAt(0);
		System.out.println("the formatted string is:" + reshape(s1, c));

		System.out.println(" Enter the length is : ");
		Scanner so = new Scanner(System.in);
		int n1 = so.nextInt();
		System.out.println(" The given length is : " + n1);
		System.out.println(" Enter the numbers to remove 10 : ");
		int[] sr = new int[n1];
		Integer[] sr1 = new Integer[n1];
		for (int i = 0; i < n1; i++) {
			sr[i] = so.nextInt();
		}
		sr1 = UserMainCode.removeTens(sr);
		System.out.println(" Ten's removed list : ");
		for (int i = 0; i < n1; i++) {
			System.out.println(sr1[i]);
		}

		System.out.println(" Enter the sentence to get the last letter of the words: ");
		Scanner o = new Scanner(System.in);
		String j = o.nextLine();
		System.out.println(getLastLetter(j));

		Scanner op = new Scanner(System.in);
		Map<Integer, String> re = new HashMap<Integer, String>();
		System.out.println(" Enter the length to get max key: ");
		int n11 = op.nextInt();

		for (int i = 0; i < n11; i++)
			re.put(op.nextInt(), op.next());

		String r = UserMainCode.getMaxKeyValue(re);
		System.out.println(" the max key is given for : ");
		System.out.println(r);

		UserMainCode.validateNumber();

		System.out.println(UserMainCode.getDay());

		System.out.println(UserMainCode.extractMax(str));

		System.out.println(" Enter the length: ");
		Scanner sc1 = new Scanner(System.in);
		int n111 = sc1.nextInt();
		Map<String, String> mp = new HashMap<String, String>();
		for (int i = 0; i < n111; i++) {
			mp.put(sc1.next(), sc1.next());
		}
		String s11 = sc1.next();
		System.out.println(" The captial and the State is: ");
		System.out.println(UserMainCode.getCapital(mp, s11));

		System.out.println(" Enter the string to store max vowel word: ");
		Scanner j8 = new Scanner(System.in);
		String s111 = j8.nextLine();
		System.out.println(UserMainCode.storeMaxVowelWord(s111));

		System.out.println(" Enter the string to get unique letters: ");
		Scanner j0 = new Scanner(System.in);
		String s6 = j0.nextLine();
		System.out.println(UserMainCode.checkUnique(s6));

		System.out.println(UserMainCode.addPrimeIndex());

		Scanner i4 = new Scanner(System.in);
		int n3 = Integer.parseInt(i4.nextLine());
		ArrayList<Integer> a12 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		for (int i = 0; i < n3; i++)
			a12.add(Integer.parseInt(i4.nextLine()));
		for (int i = 0; i < n3; i++)
			a2.add(Integer.parseInt(i4.nextLine()));
		char c1 = i4.nextLine().charAt(0);
		System.out.println(performSetOperations(a12, a2, c1));

		System.out.println(" Enter the length: ");
		Scanner m5 = new Scanner(System.in);
		int n2 = m5.nextInt();
		System.out.println(" Enter the array to find the span: ");
		int[] a7 = new int[n2];
		for (int i = 0; i < n2; i++) {
			a[i] = m5.nextInt();
		}
		System.out.println(UserMainCode.getMaxSpan(a7, n2));

		System.out.println(UserMainCode.highestScorer());

		System.out.println(" Enter the string get word with max vowels: ");
		Scanner j9 = new Scanner(System.in);
		String s7 = j9.nextLine();
		System.out.println(UserMainCode.getWordWithMaximumVowels(s7));

		UserMainCode.testOrderVowels();

		System.out.println(" Enter the string to swap letters: ");
		Scanner kk = new Scanner(System.in);
		String s0 = kk.nextLine();
		swapPairs(s0);

		System.out.println(" Enter the string to get digits: ");
		Scanner sc11 = new Scanner(System.in);
		String n8 = sc11.next();
		int res1 = UserMainCode.getdigits(n8);
		System.out.println(" Sum of the digits is: ");
		System.out.println(res1);

	}

}
