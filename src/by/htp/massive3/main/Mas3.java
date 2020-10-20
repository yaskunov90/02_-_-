package by.htp.massive3.main;

public class Mas3 {

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 3, 4, 5 };

		int i = 0;
		int x = 0;

		for (i = 1; i < a.length; i++) {

			if (a[i-1] < a[i]) {
				
				System.out.println("Последовательность возрастающая");
			} 
			
			
			else {
				System.out.println("Последовательность  НЕ возрастающая");break;
			}
		
		}}}

	


