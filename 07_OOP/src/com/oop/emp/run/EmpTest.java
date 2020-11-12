package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order;
		Employee e = new Employee();

		
		while(true) {
			
			System.out.println("******* 사원 정보 관리 프로그램 ***************");
			
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 삭제");
			System.out.println("3. 사원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.println("***************************************\n");
			
			System.out.print("실행할 명령 번호를 입력하세요 : ");
			order = sc.nextInt();
			
			switch(order) {
			case 1:
				e.empInput();
				break;
			case 2:
				e.empDelete();
				break;
			case 3:
				e.empOutput();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요!\n");
				break;
			}
		}
		
	}
}
