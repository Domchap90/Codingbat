package Map2;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {

	public static void main(String[] args) {
		String vocab[] = { "list", "of", "words", "swims", "over", "lily", "water", "wait" };
		String result[] = allSwap(vocab);
		for (String word : result) {
			System.out.print(word + " ");
		}
	}

	public static String[] allSwap(String[] strings) {
		// query map to find key if already exists
		// if it does, swap indices around. Then remove key.
		// if not add key along with index to the map for future queries.

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			String firstLetter = strings[i].substring(0, 1);
			if (map.containsKey(firstLetter)) {
				// swap indices i with index referenced from map.
				int value = map.get(firstLetter);
				String placehold = strings[value];
				strings[value] = strings[i];
				strings[i] = placehold;
				map.remove(firstLetter);
			} else {
				map.put(firstLetter, i);
			}
		}
		return strings;
	}


}
