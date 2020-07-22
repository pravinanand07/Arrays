package org.array;

public class Array4 {
	public static void main(String[] args) {
		int[] a = new int[10];
		int sum = 0;
		float avg = 0;
		int b = a.length;
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;
		for(int c=0;c<=a.length;c++) {
			sum = sum+c;
			avg = sum/b;
		}
		System.out.println(avg);
	}

}
