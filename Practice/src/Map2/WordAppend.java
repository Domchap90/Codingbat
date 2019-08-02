package Map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

	public static void main(String[] args) {
		String words[] = { "not", "and", "or", "and", "this", "and", "or", "that", "not" };
		System.out.println(wordAppend(words));
	}

	public static String wordAppend(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String result = "";
		for (String s : strings) {
			map.put(s, 0);
		}
		for (String s : strings) {
			map.put(s, map.get(s) + 1);
			if (map.get(s) > 0 && map.get(s) % 2 == 0) {
				result += s;
			}
		}
		return result;
	}


}
