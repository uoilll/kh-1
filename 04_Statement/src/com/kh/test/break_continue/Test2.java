package com.kh.test.break_continue;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		int rand = (int)(Math.random()*50)+1;
		int count = 0;
		//System.out.println(rand);
		while(true) {
			System.out.print("정수 한 개를 입력하세요 : ");
			int input = sc.nextInt();
			count++;
			if(rand>input) {
				System.out.println("입력하신 정수보다 큽니다");
				continue;
			} else if(rand<input) {
				System.out.println("입력하신 정수보다 작습니다.");
				continue;
			} else if(rand==input){
				System.out.println("정답입니다." + count + "회 만에 정답을 맞추셨습니다.");
				break;
			}
			
		}
		
	}
}


