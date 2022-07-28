package JavaCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonrepetedSubString {

	public static void main(String[] args) {

		String str = "ababdacb";

		int length = 0;

		String subString = "";

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); // Use LinkHashmap bcz it will follow insertion order 

		char c[] = str.toCharArray();

		for (int i = 0; i < c.length; i++) {

			if (!map.containsKey(c[i])) {
				map.put(c[i], i);

			} else {

				i = map.get(c[i]);
				map.clear();
			}
			if (map.size() > length) {

				length = map.size();

				subString = map.keySet().toString();

			}
		}
        System.out.println(subString);
        System.out.println(length);
	}

}
