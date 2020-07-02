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
		
		if(inputMenu == 0) {
			System.out.println("전화번호부 종료합니다");
			break;
			
		}else if(inputMenu == 1) {
			
		}else if (inputMenu == 2) {
			
		}else {
			System.out.println("잘못된 입력입니다");
			System.out.println("다시 입력해주세요");
		}
		
	}
		
	}
}
