package kh.java.polymorphism.animal;

/**
 * 추상메소드를 하나이상 가지고 있다면,
 * 해당클래스는 반드시 추상클래스여야 한다.
 */

public abstract class Animal {
//	public void say() {
//		System.out.println("안녕하세요, 동물입니다.");
//	}
	/**
	 * 추상메소드
	 *  - 메소드 몸통부 없다.
	 *  - abstract 키워드 사용.
	 *  - 접근제한자, 리턴타입, 메소드명, 매개변수선언부
	 */
	public abstract void say();
}
