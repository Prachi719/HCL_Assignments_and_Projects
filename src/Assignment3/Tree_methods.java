package Assignment3;

import java.util.Map;
import java.util.TreeMap;

public class Tree_methods {
	
		public static void main(String[] args) {

	        TreeMap<Integer, String> tm1 = new TreeMap<>();
	        TreeMap<Integer, String> tm2 = new TreeMap<>(Map.of(3, "C++", 1, "Java"));
	        TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);

	        tm1.put(1, "Java");
	        tm1.put(2, "Python");
	        tm1.put(4, "HTML");

	        System.out.println(tm1.get(2));
	        System.out.println(tm1.containsKey(1));
	        System.out.println(tm1.containsValue("HTML"));

	        tm1.remove(4);

	        System.out.println(tm1.size());
	        System.out.println(tm1.isEmpty());

	        TreeMap<Integer, String> temp = new TreeMap<>();
	        temp.put(3, "CSS");
	        temp.put(5, "JavaScript");
	        tm1.putAll(temp);

	        System.out.println(tm1.firstKey());
	        System.out.println(tm1.lastKey());
	        System.out.println(tm1.firstEntry());
	        System.out.println(tm1.lastEntry());

	        System.out.println(tm1.keySet());
	        System.out.println(tm1.values());
	        System.out.println(tm1.entrySet());

	        tm1.replace(2, "Python Updated");

	        tm1.clear();

	        System.out.println(tm1);

	}
}
