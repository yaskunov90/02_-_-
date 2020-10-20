package by.htp.massive7.main;

import java.util.*;

public class Mas7 {

	public static void main(String[] args) {

		int a[] = { 1, 20, 3, 456, 5, 6, 800, 8, 9,0 };
		int i = 0;
		int j = 0;
		int min = a[i];
		int max = 0;
		int x = 0;
		int c = 0;

		for (i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				x = i;
			}}

			for (i = 0; i < a.length; i++) {
				if (a[i] > max) {
					max = a[i];
					c = i;
				}}	
		
		a[c] = min;
		a[x] = max;
		
		for (i = 0; i < a.length; i++) {
		 System.out.print (" " +a[i] + " ");
	

	
			

}
		System.out.println("Максимальное значение равно " + max);
			System.out.println("Минимальное значение равно " + min);
	
	}
	}
