package by.htp.massive10.main;



public class Mas10 {

	public static void main(String[] args) {

		int[] a = { 1, 88, 3, 517, 5, 6, 420, 8, 9, 16 };
		int i;
		int[] b = new int[a.length / 2];
		int j = a.length - 1;
		int max = 0;

		for (i = 0; i < a.length; i++) {
			b[i] = a[i] + a[j];
			j--;
			System.out.print(" " + b[i]);

		}
		max = b[0];
		for (i = 0; i < b.length; i++) {
			if (b[i] > max) {
				max = b[i];
				System.out.println("Наибольшая сумма равна " + max);
			}
			
			
		}

		

	}

}
