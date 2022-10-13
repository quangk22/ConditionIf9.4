package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("Nhập a = ");
		a = sc.nextInt();
		System.out.println("Nhập b = ");
		b = sc.nextInt();
		System.out.println("Nhập c = ");
		c = sc.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.println(" vô số nghiệm");
			} else {
				System.out.println("vô nghiệm");
			}

		} else {
			float x = -b / (float) a;
			System.out.println("x = " + x);
		}
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;
		// tính nghiệm
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("Phương trình vô nghiệm!");
		}
	}

}
