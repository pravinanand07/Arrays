package org.array;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Array10 {
public static void main(String[] args) {
	Map<String,String> f = new Hashtable<>();
	f.put("vel","Selenium");
	f.put("Ganesh","framework");
	f.put("Dinesh","oracle");
	f.put("Vengat","corejava");
	f.put("subash","jira");
	System.out.println(f);
	Set<Entry<String,String>> s = f.entrySet();
	for (Entry<String, String> d : s) {
		System.out.println(d.getKey());
		System.out.println(d.getValue());
	}
	}
}
