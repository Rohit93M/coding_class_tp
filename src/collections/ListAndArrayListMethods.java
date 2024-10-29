package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListAndArrayListMethods {
	
	public static void main(String[] args) {
	
    //add(element)
	ArrayList a = new ArrayList();
	a.add("Hi");
	a.add(123);
	a.add('A');
	a.add(null);
	a.add("22.2f");
	a.add(123);
	a.add("Hi");
	System.out.println("a: "+a);
	
	//size()
	System.out.println(a.size());
	
	//add(index, element)
	a.add(4, null);
	System.out.println("a: "+a);
	
	//remove(element)
    a.remove(2);
    System.out.println("a: "+a);
    
	//contains(element)
    System.out.println(a.contains(123));
    System.out.println(a.contains('A'));
    
    //indexOf(element)
    System.out.println(a.indexOf("Hi"));
    System.out.println(a.indexOf(null));
    
    //clear()
    a.clear();
    System.out.println("a: "+a);
    
    //isEmpty()
    System.out.println(a.isEmpty());
    
	System.out.println("=============================");
	
	//addAll(collection)
	ArrayList b = new ArrayList();
	b.add("violet");
	b.add("indigo");
	b.add("green");
	b.add("yellow");
	System.out.println("b: "+b);
	
	ArrayList c = new ArrayList();
	c.add("blue");
	c.add("red");
	c.add("orange");
	System.out.println("c: "+c);
	
	//c.add(b);
	c.addAll(b);
	System.out.println("c: "+c);
	
	//removeAll(collection)
    c.removeAll(b);
    System.out.println("c: "+c);
	
	//addAll(index, collection)
	c.addAll(1,b);
	System.out.println("c: "+c);
	
	//retainAll(collection)
	c.add("pink");
	b.add("pink");
	c.retainAll(b);
	System.out.println(c.containsAll(b));
	System.out.println("c: "+c);
	
	System.out.println("=============================");
	
	//containsAll(collection)
	ArrayList d = new ArrayList();
	d.add(1);
	d.add('a');
	d.add("Hi");
	d.add(null);
	System.out.println("d: "+d);
	
	ArrayList e = new ArrayList();
	e.add(null);
	e.add(1);
	System.out.println("e: "+e);
    System.out.println(d.containsAll(e));
    
	System.out.println("=============================");
    
    //equals()
	ArrayList f = new ArrayList();
	f.add("Hi");
	f.add(null);
	f.add(0);
	System.out.println("f: "+f);
	
	ArrayList g = new ArrayList();
	g.add("Hi");
	g.add(null);
	g.add(0);
	System.out.println("g: "+g);
	
	System.out.println(f.equals(g));
	System.out.println(g.equals(f));

	//toArray()
	ArrayList h = new ArrayList();
	h.add("A");
	h.add(0);
	h.add(null);

	Object[] arr = h.toArray();
	System.out.println(Arrays.toString(arr));
	}
}
