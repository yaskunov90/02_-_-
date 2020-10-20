package by.htp.massive6.main;
import java.util.*;
public class Mas6 {

	public static void main(String[] args) {
		
		int a[] = {2,6,8,89,45,67,43,55,4,91,18};
		int i=0;
		int j=0;
		int z;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Введите значение z");
		while (!sc.hasNextInt ()) {
			sc.next();
		}
		z = sc.nextInt();
		
		for (i=0; i < a.length; i++) {
			
			if (a[i]>z) {
				a[i]=z;
				j++;
				
			}
			System.out.print (" " +a[i]);
		}
		
		
		
		
		System.out.println ("  Количество замен равно " +j);
		

	}

}
