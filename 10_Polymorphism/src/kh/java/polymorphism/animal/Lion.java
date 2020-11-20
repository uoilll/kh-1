package kh.java.polymorphism.animal;

public class Lion extends Animal{
	@Override
	public void say() {
		System.out.println("안녕하세요, 사자입니다.");
	}
	public void kick() {
		System.out.println("라이언 킥을 날립니다.");
	}
}
