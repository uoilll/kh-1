package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Test5 t = new Test5();
		t.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String address;
		int height;
		int weight;
		String phoneNum;
		
		int sAge = 0;
		int sHeight = 0;
		int sWeight = 0;
		
		int i = 1;
		while(i <= 3) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("나이를 입력하세요 : ");
			age = sc.nextInt();
			sc.nextLine();
			System.out.print("주소를 입력하세요 : ");
			address = sc.nextLine();
			System.out.print("키를 입력하세요 : ");
			height = sc.nextInt();
			System.out.print("몸무게을 입력하세요 : ");
			weight = sc.nextInt();
			System.out.print("핸드폰 번호를 입력하세요 : ");
			phoneNum = sc.next();
			
			System.out.printf("%d %s %d세  %s %dcm %dkg %s%n", i, name, age, address, height, weight, phoneNum);
			
			sAge += age / 3;
			sHeight += height / 3;
			sWeight+= weight / 3;
			i++;
		}
		
		System.out.println("==============================");
		System.out.printf("평균나이 %d세 / 평균 키 : %dCM / 평균 몸무게 : %dkg", sAge, sHeight, sWeight);
		
	}
}