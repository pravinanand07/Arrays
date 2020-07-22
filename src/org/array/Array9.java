package org.array;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Array9 {
public static void main(String[] args) {
	Map<String,Integer> x = new TreeMap<>();
	x.put("!",10);
	x.put("@",20);
	x.put("#",30);
	x.put("$",40);
	x.put("%",50);
	x.put("^",60);
	x.put("&",10);
	x.put("*",50);
	x.put("(",40);
	System.out.println(x);
	Set<Entry<String,Integer>> j = x.entrySet();
	for (Entry<String, Integer> k : j) {
		System.out.println(k.getKey());
		System.out.println(k.getValue());
	}
}
}
