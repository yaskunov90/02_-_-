package by.htp.massive4.main;

import java.util.*;

public class Mas4 {

	public static void main(String[] args) {

		int a[] = { 2, 3, 7, 3, 3, 8 };
		int b[] = new int[a.length];
		int i = 0;
		int j = 0;
		int z = 0;

		for (i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				b[j] = a[i];
				System.out.print("  " + b[j]);
			} else {
				z++;
			}
		}
		if (z == a.length) {
			System.out.print(" Четных чисел нет!  ");
		}
	}
}
