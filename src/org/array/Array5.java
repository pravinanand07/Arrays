package org.array;

import java.util.ArrayList;
import java.util.List;

public class Array5 {
	public static void main(String[] args) {
		 List<Integer> k = new ArrayList<>();
		 k.add(10);
		 k.add(20);
		 k.add(30);
		 k.add(90);
		 k.add(10);
		 k.add(10);
		 k.add(40);
		 k.add(50);
		 k.add(10);
		 System.out.println(k);
		 for(int i=0;i<=k.size();i++) {
			 if(k.get(i)==10) {
				 System.out.println(i);
			 }
		 }
		
	}
}
