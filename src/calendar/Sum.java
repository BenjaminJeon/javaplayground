package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a, b;
		System.out.println("더할 두 개의 정수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1 + ", " + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.printf("%d와 %d 두 수의 합은 %d입니다",a,b,a+b);
		scanner.close();
	}
	
}
		 
	
