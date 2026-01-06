package Assignment3;

import java.util.Vector;

public class Vector_methods {

	public static void main(String[] args) {
		 // Constructors
        Vector<String> v1 = new Vector<>();
        Vector<String> v2 = new Vector<>(5);
        Vector<String> v3 = new Vector<>(5, 3);

        // add()
        v1.add("Java");
        v1.add("Python");

        // addElement()
        v1.addElement("C++");

        // add(index, element)
        v1.add(1, "JavaScript");

        // size()
        System.out.println("Size: " + v1.size());

        // capacity()
        System.out.println("Capacity: " + v1.capacity());

        // get()
        System.out.println("Element at index 1: " + v1.get(1));

        // set()
        v1.set(1, "TypeScript");

        // contains()
        System.out.println("Contains Java: " + v1.contains("Java"));

        // indexOf()
        System.out.println("Index of Java: " + v1.indexOf("Java"));

        // lastIndexOf()
        v1.add("Java");
        System.out.println("Last index of Java: " + v1.lastIndexOf("Java"));

        // firstElement()
        System.out.println("First Element: " + v1.firstElement());

        // lastElement()
        System.out.println("Last Element: " + v1.lastElement());

        // remove(index)
        v1.remove(2);

        // removeElement()
        v1.removeElement("Python");

        // isEmpty()
        System.out.println("Is Vector Empty? " + v1.isEmpty());

        // Display Vector
        System.out.println("Final Vector: " + v1);
    

	}
}
