package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		//t.test1();
		t.test2();
	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int i = 1;
		int tot = 1;
		while(i <= input) {
			if((i%2)==1) {
				tot *= i;
			}
			i++;
		}
		System.out.println("결과는 " + tot + "입니다.");
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		int input1, input2;
		System.out.print("첫 번째 수를 입력하세요 ! : ");
		input1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 ! : ");
		input2 = sc.nextInt();
		
		int big = 0;
		int small = 0, small1 = 0;
		int sum = 0;
		
		if(input1 > input2) {
			big = input1;
			small1 = small = input2;
		} else if(input1 < input2) {
			big = input2;
			small1 = small = input1;
		} else {
			if((input1%2)==1)
				sum += input1;
		}
		
		while(big > small1) {
			if((small1%2)==1) {
				sum += small1;
			}
			small1++;
		}
		
		System.out.printf("%d부터 %d까지의 홀수의 합은 %d입니다.", small, big, sum);
	}
}
