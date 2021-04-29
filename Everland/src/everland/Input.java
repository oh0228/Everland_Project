package everland;

import java.util.Scanner;


public class Input {
	Scanner sc = null;
	Input() {
		sc = new Scanner(System.in);
	}
	
	public int InputTicketType() {          
		System.out.println("권종을 선택하세요.\n1. 주간권\n2. 야간권\n");
		int ticketType = sc.nextInt();
		while (ticketType != 1 && ticketType != 2) {
			System.out.println("다시 입력해주세요.");
			ticketType = sc.nextInt();
		}
		return ticketType;
	}

	public String InputJuminNum() {
		System.out.println("주민번호 13자리를 입력하세요.\n");
		String JuminNum = sc.next();
		while (JuminNum.length() != 13) {
			System.out.println("다시 입력해주세요.");
			JuminNum = sc.next();
		}
		return JuminNum;
	}

	public int InputTicketNum() {
		System.out.println("몇 개를 주문하시겠습니까? (최대 10개)\n");
		int ticketNum = sc.nextInt();
		while (ticketNum == 0 || ticketNum > 10) {
			System.out.println("다시 입력해주세요.");
			ticketNum = sc.nextInt();
		}
		return ticketNum;
	}

	public int InputSpecialType() {
		System.out.println("우대사항을 선택하세요.\n1. 없음(나이 우대는 자동처리)\n2. 장애인\n"
				+ "3. 국가유공자\n4. 다자녀\n5. 임산부\n");
		int specialType = sc.nextInt();
		while (specialType < 1 || specialType > 5) {
			System.out.println("다시 입력해주세요.");
			specialType = sc.nextInt();
		}
		return specialType;
	}

	public int InputContinueOrNot() {
		System.out.println("계속 발권 하시겠습니까?\n1. 티켓 발권\n2. 종료\n");
		int continueOrNot = sc.nextInt();
		while (continueOrNot != 1 && continueOrNot != 2) {
			System.out.println("다시 입력해주세요.");
			continueOrNot = sc.nextInt();
		}
		return continueOrNot;
	}
	
	public int InputNewOrExit() {
		System.out.printf("계속 진행 하시겠습니까?\n1. 새로운 주문\n2. 프로그램 종료\n");
		int newOrExit = sc.nextInt();
		while (newOrExit != 1 && newOrExit != 2) {
			System.out.println("다시 입력해주세요.");
			newOrExit = sc.nextInt();
		}
		return newOrExit;
	}

}


