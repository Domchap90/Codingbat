package Map2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {

	public static void main(String[] args) {
		String vocab[] = { "list", "of", "words", "swims", "over", "lily", "water", "wait" };
		String result[] = firstSwap(vocab);
		for (String word : result) {
			System.out.print(word + " ");
		}
	}

	public static String[] firstSwap(String[] strings) {
		String stringCheck = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			String firstLetter = strings[i].substring(0, 1);
			if (map.containsKey(firstLetter) && !stringCheck.contains(firstLetter)) {
				// swap indices i with index referenced from map.
				int value = map.get(firstLetter);
				String placehold = strings[value];
				strings[value] = strings[i];
				strings[i] = placehold;
				stringCheck += firstLetter;
			} else {
				map.put(firstLetter, i);
			}
		}
		return strings;
	}
}
