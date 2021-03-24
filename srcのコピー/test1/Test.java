package test1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		int a = scan1.nextInt();
		int b = scan2.nextInt();

		int c = a + b;
		System.out.println(c);

		c += 1;
		System.out.println(c);

		scan1.close();
		scan2.close();
	}

}
