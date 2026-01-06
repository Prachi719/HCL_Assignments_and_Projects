package Assignment3;

import java.util.HashMap;

public class Hashmap_methods {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>(10);
        HashMap<Integer, String> map3 = new HashMap<>(10, 0.75f);
        HashMap<Integer, String> map4 = new HashMap<>(map1);

        map1.put(1, "Java");
        map1.put(2, "Python");
        map1.put(3, "C++");

        System.out.println(map1.get(2));
        System.out.println(map1.containsKey(3));
        System.out.println(map1.containsValue("Java"));

        map1.remove(1);

        System.out.println(map1.size());
        System.out.println(map1.isEmpty());

        HashMap<Integer, String> temp = new HashMap<>();
        temp.put(4, "HTML");
        temp.put(5, "CSS");
        map1.putAll(temp);

        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.entrySet());

        map1.replace(2, "Python Updated");

        map1.clear();

        System.out.println(map1);
    


	}
	
}
