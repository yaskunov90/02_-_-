package by.htp.massive2.main;

import java.util.*;

public class Mas2 {

	public static void main(String[] args) {

		int a[] = { 1, 0, 5, 0, 6, 0, 78, 9, 0 };
		int b[] = new int[a.length];
		int i = 0;
		int j = 0;

		for (i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				b[j] = i;
				System.out.print(" " + b[j]);
				j++;

			}

		}

	}

}
