package JavaCode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class charactorsInString {

	public static void main(String[] args) {

		String s = "Heh1 jhwsoiuicy98wefyn OH(UUy 8	Y08JNKLL	BNBN	n  jnk";

		int u = 0;
		int l = 0;
		int a = 0;
		int n = 0;
		double upperCase = 0;
		double lowerCase = 0;
		double numbers = 0;
		double spacialChar = 0;

		char c[] = s.replaceAll("/s", "").toCharArray();
		for (int i = 0; i < c.length; i++) {

			char q = c[i];
			if (Character.isUpperCase(q)) {
				u++;
                upperCase = (u * 100) / c.length;
			} else if (Character.isLowerCase(q)) {
				l++;
				lowerCase = (l * 100) / c.length;
			} else if (Character.isDigit(q)) {
				a++;
				numbers = (a * 100) / c.length;
			} else {
				n++;
				spacialChar = (n * 100) / c.length;
			}
		}
		System.out.println("Uper persantage =" + upperCase + "%" + " count =" + u + ",   lower persantage =" + lowerCase + "%"
				+ "  count =" + l + ",   Number  persantage =" + numbers + "%" + "  count =" + a
				+ ",   spacial char persantage =" + spacialChar + "%" + " count =" + n);

	}
};