package everland;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calculate {

	public int calAgeType(String juminNum) {               // 주민번호 입력받아 연령 타입 산출
		Calendar cal = Calendar.getInstance();
		int ageType;
		int bornYear = 0;
		
		if (juminNum.charAt(6) == '1' || juminNum.charAt(6) == '2') {
			bornYear = 1900 + Integer.parseInt(juminNum.substring(0, 2));
		} else if (juminNum.charAt(6) == '3' || juminNum.charAt(6) == '4') {
			bornYear = 2000 + Integer.parseInt(juminNum.substring(0, 2));
		}
		int koreanAge = cal.get(cal.YEAR) - bornYear + 1;

		if (koreanAge <= ConstValue.AGE_LIMIT_BABY) {
			ageType = ConstValue.AGE_TYPE_BABY;
		} else if (koreanAge <= ConstValue.AGE_LIMIT_CHILD) {
			ageType = ConstValue.AGE_TYPE_CHILD;
		} else if (koreanAge <= ConstValue.AGE_LIMIT_TEEN) {
			ageType = ConstValue.AGE_TYPE_TEEN;
		} else if (koreanAge > ConstValue.AGE_LIMIT_ADULT) {
			ageType = ConstValue.AGE_TYPE_OLD;
		} else {
			ageType = ConstValue.AGE_TYPE_ADULT;
		}
		return ageType;
	}
                                                                // 해당 주문건에 대한 합계액 산출
	public int calMiniSum(int ticketType, String juminNum, int ticketNum, int specialType) {
		double miniSum = 0;
		int ageType = calAgeType(juminNum);
		double discountRate = calDiscountRate(specialType);

		if (ticketType == 1) {
			miniSum = ConstValue.DAY_PRICE[ageType] * ticketNum * discountRate;
		} else if (ticketType == 2) {
			miniSum = ConstValue.NIGHT_PRICE[ageType] * ticketNum * discountRate;
		} 
		return (int)miniSum;
	}
	
	public double calDiscountRate(int specialType) {            // 우대 타입에 따른 할인율 리턴
		double discountRate = 1;
		switch(specialType) {
		case ConstValue.NONE:
			discountRate = 1;
			break;
		case ConstValue.DISABLED:
			discountRate = ConstValue.DISABLED_DC_RATE;
			break;
		case ConstValue.NATIONAL_MERIT:
			discountRate = ConstValue.NATIONAL_MERIT_DC_RATE;
			break;
		case ConstValue.MULTI_CHILD:
			discountRate = ConstValue.MULTI_CHILD_DC_RATE;
			break;
		case ConstValue.PREGNANT:
			discountRate = ConstValue.PREGNANT_DC_RATE;
			break;
		}
		return discountRate;
	}
	
	public String setDate() {                                               // 현재 날짜를 리턴
		SimpleDateFormat ymd = new SimpleDateFormat("YYYY/MM/dd");
		Calendar cal = Calendar.getInstance();
		return ymd.format(cal.getTime());
	}
}
