package by.htp.massive.main;

import java.util.*;

public class Mas1 {

	public static void main(String[] args) {
		

		int sum=0;
		int k=0;
		int i;
		
		int a []  = {5,4,6,2,4,66,15,8,23,40};
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("¬ведите чило к ");
		while (!sc.hasNextInt()) {
		sc.next();}
		k = sc.nextInt();
		
	
		
		for (i=0; i<=((a.length)-1); i++) {
			
			if (a[i]%k==0) {
				sum=sum+a[i];				
			}
			
		}
		System.out.println ("Cумма чисел кратных к равна "+ sum);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
