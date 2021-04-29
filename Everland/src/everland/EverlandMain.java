package everland;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList; 

public class EverlandMain {                                                                          // 메인 클래스
	public static ArrayList<CustomerInfo> customerArr = new ArrayList<CustomerInfo>();

	public static void main(String[] args) throws IOException {
		Input ic = new Input();
		Output oc = new Output();
		Calculate cc = new Calculate();
		FileWrite fw = new FileWrite();
		FileRead fr = new FileRead();
		CustomerInfo customerInfo = null;
		int ticketType, ticketNum, specialType, sum;
		String juminNum;

		fr.fileCheck();             // 파일이 존재하는지 체크하고, 없으면 파일 생성과 함께 카테고리 입력 

		do {
			ticketType = ic.InputTicketType();                                 // 권종 입력
			juminNum = ic.InputJuminNum();                            // 주민번호 입력
			ticketNum = ic.InputTicketNum();                               // 티켓 매수 입력
			specialType = ic.InputSpecialType();                        // 우대사항 입력
			sum = cc.calMiniSum(ticketType, juminNum, ticketNum, specialType);      // 현 주문에 대한 합계액 산출
			customerInfo = new CustomerInfo(cc.setDate(), ticketType, juminNum, ticketNum, specialType, sum,
					cc.calAgeType(juminNum));                                             // 자료구조에 데이터 저장
			customerArr.add(customerInfo);                                               // arraylist에 자료구조 저장
			oc.printSum(ticketType, juminNum, ticketNum, specialType);                    // 현 주문건 정보 출력

			if (ic.InputContinueOrNot() == 2) {							// 계속 진행할 지 여부 입력
				oc.printTotal();
				if (ic.InputNewOrExit() == 2) break;
			}
		} while (true);
		                                   
		fw.saveData();                 // 파일에 값 저장
	}
}
