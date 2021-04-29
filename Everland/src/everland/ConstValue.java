package everland;

// 상수 클래스
public class ConstValue {
	
	// 이용요금(주간 야간, 나이에 따라)
	final static int[] DAY_PRICE = {56000,47000,44000,44000,0};
	final static int[] NIGHT_PRICE = {46000,40000,37000,37000,0};

	// 나이에 따라 (0:대인, 1:청소년, 2:소인, 3:경로, 4:유아)
	final static int AGE_TYPE_ADULT = 0;
	final static int AGE_TYPE_TEEN = 1;
	final static int AGE_TYPE_CHILD = 2;
	final static int AGE_TYPE_OLD = 3;
	final static int AGE_TYPE_BABY = 4;
	
	final static int AGE_LIMIT_ADULT = 64; // 대인 19~64
	final static int AGE_LIMIT_TEEN = 18; // 청소년 13~18
	final static int AGE_LIMIT_CHILD = 12; // 소인 3~12
	final static int AGE_LIMIT_BABY = 2; // 유아 ~2
	
	final static String STR_ADULT = "대인";
	final static String STR_TEENAGER = "청소년";
	final static String STR_CHILD = "소인";
	final static String STR_OLD = "경로";
	final static String STR_BABY = "아기";
	
	// 우대사항 할인율
	final static int NONE = 1;
	final static int DISABLED = 2;
	final static int NATIONAL_MERIT = 3;
	final static int MULTI_CHILD = 4;
	final static int PREGNANT = 5;
	
	final static double DISABLED_DC_RATE = 0.6; // 장애인 할인율 40%
	final static double NATIONAL_MERIT_DC_RATE = 0.5; // 국가유공자 할인율 50%
	final static double MULTI_CHILD_DC_RATE = 0.8; // 다자녀 할인율 20%
	final static double PREGNANT_DC_RATE = 0.85; // 임산부 할인율 15%
	
	// 출력용
	public static final String DATE = "날짜";
	public static final String TICKET_TYPE = "권종";
	public static final String AGE_TYPE = "연령구분";
	public static final String TICKET_NUM = "수량";
	public static final String SPECIAL = "우대사항";
	public static final String PRICE = "가격";
	
	// 파일 경로
	public static final String FILE_LOCATION = "everland.csv";
}
