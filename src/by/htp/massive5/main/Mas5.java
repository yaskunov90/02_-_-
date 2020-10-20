package by.htp.massive5.main;

import java.util.*;

public class Mas5 {

	public static void main(String[] args) {

		int a[] = { 0, 78, 12, 54, 6, 9, 12, 32 };
		int x;
		int min = 0;
		int i;

		min = a[0];

		for (i = 0; i < a.length; i++) {
			if (a[i] < a[0]) {
				min = a[i];
			}

		}

		System.out.println("Наименьшая длина числовой оси равна " + min);

	}

}
