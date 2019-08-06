package Map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

	public static void main(String[] args) {
		String words[] = { "this", "and", "this" };
		System.out.println(wordMultiple(words));
	}

	public static Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (String s : strings) {
			if (map.containsKey(s)) {
				map.put(s, true);
			} else {
				map.put(s, false);
			}

		}
		return map;
	}


}
