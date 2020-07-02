package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
	
	//git과 연동해서 전화번호부 만들 예정
	
	printMenu();
	
	}

	public static void printMenu() {
		
	Scanner myScan = new Scanner(System.in);
	
	while (true) {
		
		System.out.println("*******전화번호부********");
		System.out.println("1) 전화번호 추가 등록");
		System.out.println("2) 전체 전화번호 목록 조회");
		System.out.println("0) 프로그램 종료");
		System.out.println("======================");
		
		
		System.out.println("메뉴 선택: ");
		int inputMenu = myScan.nextInt();
		
		
	}
		
	}
}
