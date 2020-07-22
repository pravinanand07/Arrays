package org.array;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Array8 {
public static void main(String[] args) {
	Map<Integer,Integer> v = new LinkedHashMap<>();
	v.put(10,10);
	v.put(20,20);
	v.put(30,30);
	v.put(40,40);
	v.put(50,50);
	v.put(60,60);
	v.put(10,10);
	v.put(50,50);
	v.put(40,40);
	System.out.println(v);
	Set<Entry<Integer,Integer>> c = v.entrySet();
	for (Entry<Integer, Integer> g : c) {
		System.out.println(g.getKey());
		System.out.println(g.getValue());
	}
}
}
