package Assignment3;

import java.util.Hashtable;

public class HashTable_methods {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht1 = new Hashtable<>();
        Hashtable<Integer, String> ht2 = new Hashtable<>(10);
        Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);
        Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);

        ht1.put(1, "Java");
        ht1.put(2, "Python");
        ht1.put(3, "C++");

        System.out.println(ht1.get(2));
        System.out.println(ht1.containsKey(3));
        System.out.println(ht1.containsValue("Java"));

        ht1.remove(1);

        System.out.println(ht1.size());
        System.out.println(ht1.isEmpty());

        Hashtable<Integer, String> temp = new Hashtable<>();
        temp.put(4, "HTML");
        temp.put(5, "CSS");
        ht1.putAll(temp);

        System.out.println(ht1.keySet());
        System.out.println(ht1.values());
        System.out.println(ht1.entrySet());

        ht1.replace(2, "Python Updated");

        ht1.clear();

        System.out.println(ht1);
	}
}
