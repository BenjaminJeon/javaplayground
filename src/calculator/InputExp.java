package calculator;

import java.util.Scanner;

public class InputExp {
	public String[] start() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("계산식을 입력하세요. : ");
	
	String expression = scanner.nextLine();
	scanner.close();
	
	String[] splitedExp = expression.split(" ");
	return splitedExp;
	}
}
