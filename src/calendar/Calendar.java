package calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = {31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
	
	public static int getMaxDaysOfMonth(int month) {
			return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		System.out.println("마지막 날을 알고 싶은 달을 입력하세요: ");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String s = scanner.next();
			int i = Integer.parseInt(s);
			if (1<=i && i <= 12) {
				System.out.printf("선택한 %d월의 최대 일은 %d일입니다.", i, getMaxDaysOfMonth(i));
				scanner.close();
				break;
			}	
			if (i<1 || i>12) {
				System.out.println("잘못 입력했습니다. 1~12월 사이의 달을 다시 입력하세요: ");
				continue;
			}
		}
	}

	public void printSampleCalendar() {
		System.out.println("Hello Calendar!");
		System.out.println(" 일    월    화    수    목    금    토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

	}

}
