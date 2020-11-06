package com.kh.test.loop;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Test6 t = new Test6();
		t.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		// 입력한 메뉴를 저장하기 위한 변수
		int menu;
		// 입력한 수량을 저장하기 위한 변수
		int su;
		// 추가 구매 여부를 나타내는 yn
		char yn;
		
		// 메뉴 10개의 가격을 저장하기 위한 int형 변수 10개 초기화
		int wkim = 1500, ckim = 2000, hkim = 2300;
		int wla = 3000, cla = 3500, jla = 4000;
		int db = 2500, sb = 2500, ob = 1000;
		int drink = 1000;
		
		// 가격의 합계를 계산하기 위한 sum 변수 초기화
		int sum = 0;
		
		// 메뉴들의 이름을 저장하기 위한 String 변수 초기화
		String swkim = "원조김밥", sckim = "치즈김밥", shkim = "참치김밥";
		String swla = "그냥라면", scla = "치즈라면", sjla = "짬뽕라면";
		String sdb = "떡볶이", ssb = "순대", sob = "오뎅";
		String sdrink = "음료수";
		
		// 사용자가 선택한 정보들을 이어서 저장하기 위한 result 변수 초기화
		String result = "";
		// 출력용 String 변수
		String str = "----------------------------------";
		
		while(true) {
		// 메뉴 출력
			System.out.println("메뉴");
			System.out.println("김밥류 =====================");
			System.out.printf("1. %s==========%d원%n", swkim, wkim);
			System.out.printf("2. %s==========%d원%n", sckim, ckim);
			System.out.printf("3. %s==========%d원%n", shkim, hkim);
			System.out.println("라면류 =====================");
			System.out.printf("4. %s==========%d원%n", swla, wla);
			System.out.printf("5. %s==========%d원%n", scla, cla);
			System.out.printf("6. %s==========%d원%n", sjla, jla);
			System.out.println("분식류 =====================");
			System.out.printf("7. %s===========%d원%n", sdb, db);
			System.out.printf("8. %s============%d원%n", ssb, sb);
			System.out.printf("9. %s============%d원%n", sob, ob);
			System.out.println("기타 =======================");
			System.out.printf("10. %s===========%d원%n",sdrink, drink);
		
		// 메뉴 입력 받는 부분
			System.out.print("메뉴를 선택하세요! : ");
			menu = sc.nextInt();
			System.out.print("수량을 입력하세요! : ");
			su = sc.nextInt();
		// 사용자가 입력한 메뉴 번호에 따라 switch문 분기 처리
			switch(menu) {
			case 1: result += swkim + " : " + su + "개" + " - " + su*wkim + "\n"; sum+=(su*wkim); break;
			case 2: result += sckim + " : " + su + "개" + " - " + su*ckim + "\n"; sum+=(su*ckim); break;
			case 3: result += shkim + " : " + su + "개" + " - " + su*hkim + "\n"; sum+=(su*hkim); break;
			case 4: result += swla + " : " + su + "개" + " - " + su*wla + "\n"; sum+=(su*wla); break;
			case 5: result += scla + " : " + su + "개" + " - " + su*cla + "\n"; sum+=(su*cla); break;
			case 6: result += sjla + " : " + su + "개" + " - " + su*jla + "\n"; sum+=(su*jla); break;
			case 7: result += sdb + " : " + su + "개" + " - " + su*db + "\n"; sum+=(su*db); break;
			case 8: result += ssb + " : " + su + "개" + " - " + su*sb + "\n"; sum+=(su*sb); break;
			case 9: result += sob + " : " + su + "개" + " - " + su*ob + "\n"; sum+=(su*ob); break;
			case 10: result += sdrink + " : " + su + "개" + " - " + su*drink + "\n"; sum+=(su*drink); break;
			
		// 이상한 값 입력한 경우 다시 입력 받도록 수행 continue를 사용해서 이후 명령들 무시하게 수행
			default: System.out.println("메뉴를 잘못 입력하셨습니다. 정확한 메뉴를 입력해주세요!\n\n"); continue;
			}
			System.out.print("추가 구매 여부를 선택하세요(y/n) : ");
		// 추가 구매 여부 확인
			yn = sc.next().charAt(0);
			if(yn == 'n')
				break;
		}	
		
		// 결과 출력
		System.out.println("주문하신 정보는 다음과 같습니다.");
		System.out.println(str);
		System.out.print(result);
		System.out.println(str);
		System.out.printf("합계 : %d원",sum);
	}
}
