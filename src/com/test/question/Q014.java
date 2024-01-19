package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q014 {
	public static void main(String[] arg) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//역의 개수 출력
		System.out.print("역의 개수: ");
		String trainStation = reader.readLine();
		int station = Integer.parseInt(trainStation);
		//환승역 출력
		System.out.print("환승역 횟수: ");
		String trainChange = reader.readLine();
		int change = Integer.parseInt(trainChange);
		//시간대 출력
		System.out.print("시간대(1.평상시 2.출근시 3.퇴근시): ");
		String trainTime = reader.readLine();
		int time = Integer.parseInt(trainTime);
		
		
		getTime(station, change, time);
		
	}//main

	private static void getTime(int station, int change, int time) {
		//시간대가 1번일경우
		if ( time == 1) {
			System.out.printf("총 소요시간은 %d분 입니다.\n", (station * 2) + change * 3);
		//시간대가 2번일 경우
		} else if (time == 2) {
			System.out.printf("총 소요시간은 %d분 입니다.\n", (station * 2) + change * 4);
		//시간대가 3번일 경우
		} else if (time == 3) {
			System.out.printf("총 소요시간은 %d분 입니다.\n", (station * 2) + change * 5);
		//시간대가 그 외 일경우
		} else {
			System.out.printf("시간대를 1번, 2번, 3번 중 한가지만 선택해 주세요\n");						
		}// 정수가 아닌 실수에 관한 알고리즘은 나중에 ㅎ
		
		
	}//getTime
}
