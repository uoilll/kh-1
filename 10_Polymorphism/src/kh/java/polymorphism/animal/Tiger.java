package kh.java.polymorphism.animal;

public class Tiger extends Animal{
	@Override
	public void say() {
		System.out.println("안녕하세요, 호랑이입니다.");
	}
	public void punch() {
		System.out.println("호랑이 펀치를 날립니다.");
	}
}
