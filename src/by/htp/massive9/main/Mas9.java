package by.htp.massive9.main;

import java.util.Scanner;

public class Mas9 {

	public static void main(String[] args) {

		int a[] = { -2, 0, 5, -6, 12, 70 };
		int i = 0;
		int k = 0;
		int g = 0;
		int m = 0;

		for (i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				k++;
			} else {
				if (a[i] > 0) {
					g++;
				}
			}
			if (a[i] == 0) {m++;}
		}
System.out.println ("���������� ������������� ������ ������� ����� " +g);
System.out.println ("���������� ������������� ������ ������� ����� " +k);
System.out.println ("����������  ������ ������� ������ ���� " +m);
	}
}
