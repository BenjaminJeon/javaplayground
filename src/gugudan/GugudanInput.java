package gugudan;

import java.util.Scanner;

public class GugudanInput {
	public int[] input() {	
		System.out.println("보고 싶은 구구단을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		scanner.close();	

		String[] splitedValue = inputValue.split(",");
		int first, second;
		first = Integer.parseInt(splitedValue[0]);
		if (splitedValue.length == 1)
			second = Integer.parseInt(splitedValue[0]);
		second = Integer.parseInt(splitedValue[1]);
		
		int[] list = new int[] {first, second};
		
		return list;
		
		
	}
	
}
