package everland;

public class Output {
	Calculate cc = null;
	CustomerInfo ci = null;
                                
	public void printSum(int ticketType, String juminNum, int ticketNum, int specialType) {
		cc = new Calculate();                          
		double miniSum = cc.calMiniSum(ticketType, juminNum, ticketNum, specialType);
		System.out.printf("가격은 %.0f 원 입니다.", miniSum);                              // 현 주문건 출력
	}

	public void printTotal() {                                             
		CustomerInfo cuc = null;
		int sum = 0;
		System.out.printf("티켓 발권을 종료합니다. 감사합니다\n\n");
		System.out.printf("=======================%s=======================\n\n", " 에버랜드 ");
		for (int i = 0; i < EverlandMain.customerArr.size(); i++) {
			cuc = EverlandMain.customerArr.get(i);
			System.out.printf("%-5s %-3s %2s %2d  %8d원  *우대적용 %6s\n\n", cuc.getTicketType(), cuc.getAgeType(), "X",
					cuc.getTicketNum(), cuc.getMiniSum(), cuc.getSpecialType());
			sum += cuc.getMiniSum();
		}
		System.out.printf("입장료 총액은 %d 원 입니다\n\n", sum);
		System.out.printf("========================================================\n");
	}                                                                              // 모든 주문건 합산 출력
}
