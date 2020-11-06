package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		int input;
		boolean isPrime = true;
		int i = 2;
		
		while(true) {
			System.out.print("정수 하나를 입력하세요! (2 이상의 정수) : ");
			input = sc.nextInt();
			
			if(input < 2) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			} else {
				break;
			}
		}
		while(i < input) {
			if((input%i)==0) {
				isPrime = false;
				break;
			}
			i++;
		}
		
			
		if(isPrime) {
			System.out.printf("%d는 소수다..",input);
		} else {
			System.out.printf("%d는 소수가 아니다.",input);
		}
	}
}
