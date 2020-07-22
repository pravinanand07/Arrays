package org.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Array6 {
public static void main(String[] args) {
	Set<Integer> z = new TreeSet<>();
	Set<Integer> z1 = new TreeSet<>();
	 z.add(10);
	 z.add(20);
	 z.add(30);
	 z.add(40);
	 z.add(50);
	 z.add(60);
	 z.add(70);
	 z.add(80);
	 System.out.println(z);
	 z1.add(100);
	 z1.add(200);
	 z1.add(300);
	 z1.add(400);
	 z1.add(500);
	 z1.add(600);
	 z1.add(700);
	 z1.add(8000);
	 System.out.println(z1);
	 z1.removeAll(z);
	 System.out.println(z1);
	 }
}