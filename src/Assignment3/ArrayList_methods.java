package Assignment3;

import java.util.ArrayList;

public class ArrayList_methods {
    public static void main(String[] args) {

    	constructor c = new constructor();
    	c.a = 34;
    	constructor c1 = new constructor(36);
    	constructor c2 = new constructor(c1);
    	
    	
        ListMethods<String> obj = new ListMethods<>();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        obj.add(list1, "Java");
        obj.add(list1, "Python");
        obj.addAtIndex(list1, "C++", 1);

        list2.add("HTML");
        list2.add("CSS");
        obj.addAll(list1, list2);

        System.out.println(obj.contains(list1, "Java"));

        obj.indexOf(list1, "Java");
        obj.add(list1, "Java");
        obj.lastIndexOf(list1, "Java");

        obj.remove(list1, "Python");

        obj.size(list1);

        obj.toArray(list1);

        obj.clear(list1);
    }
}
class constructor{
	int a;
	constructor(){
		System.out.println("Hello object is creted");
	}
	constructor(int a){
		this.a = a;
	}
	constructor(constructor o){
		this.a = o.a;
	}
}

class ListMethods<E> {

    void add(ArrayList<E> a, E el) {
        a.add(el);
    }

    void addAtIndex(ArrayList<E> a, E el, int index) {
        a.add(index, el);
    }

    void addAll(ArrayList<E> a, ArrayList<E> e2) {
        a.addAll(e2);
    }

    void clear(ArrayList<E> a) {
        a.clear();
    }

    boolean contains(ArrayList<E> a, E el) {
        return a.contains(el);
    }

    void ensureCapacity(ArrayList<E> a, int capacity) {
        a.ensureCapacity(capacity);
        System.out.println("Capacity ensured: " + capacity);
    }

    void indexOf(ArrayList<E> a, E e) {
        System.out.println(a.indexOf(e));
    }

    void lastIndexOf(ArrayList<E> a, E e) {
        System.out.println(a.lastIndexOf(e));
    }

    void remove(ArrayList<E> a, E e) {
        System.out.println(a.remove(e));
    }

    void removeAll(ArrayList<E> a, ArrayList<E> b) {
        a.removeAll(b);
    }

    void set(ArrayList<E> a, int index, E el) {
        a.set(index, el);
    }

    void size(ArrayList<E> a) {
        System.out.println(a.size());
    }

    void toArray(ArrayList<E> a) {
        Object[] arr = a.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
