package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WrapperExample {
    public static void main(String[] args) {
        // Date 클래스
        Date now = new Date();
        System.out.println("현재 시간: " + now);

        // 포맷팅
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("포맷팅: " + sdf.format(now));

        // Calendar 클래스
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 0부터 시작
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.printf("오늘: %d년 %d월 %d일%n", year, month, day);

        // 날짜 연산
        cal.add(Calendar.DAY_OF_MONTH, 7); // 7일 후
        cal.add(Calendar.MONTH, -1);       // 1달 전

        Date result = cal.getTime();
        System.out.println("계산 결과: " + sdf.format(result));
    }
}
