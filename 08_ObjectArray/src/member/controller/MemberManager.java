package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManager {
	private Gold[] gArr = new Gold[10];
	private Silver[] sArr = new Silver[10];
	private Vip[] vArr = new Vip[10];
	private VVip[] vvArr = new VVip[10];
	int gIdx = 0;
	int sIdx = 0;
	int vIdx = 0;
	int vvIdx = 0;
	
	public void goldInsert(Gold g) {
		this.gArr[gIdx] = g;
		gIdx++;
	}
	
	public void silverInsert(Silver s) {
		this.sArr[sIdx] = s;
		sIdx++;
	}

	public void vipInsert(Vip v) {
		this.vArr[vIdx] = v;
		vIdx++;
	}

	public void vvipInsert(VVip vv) {
		this.vvArr[vvIdx] = vv;
		vvIdx++;
	}
	
	public void printData() {
		System.out.println("------------------------<<"
		     		+ "회원정보>>------------------------");
		System.out.println("이름\t\t등급\t\t포인트\t\t이자포인트");
		System.out.println("---------------------------"
					+ "-------------------------------");
		for(int i = 0; i < sIdx; i++) {
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n",
					sArr[i].getName(),sArr[i].getGrade(),
					sArr[i].getPoint(),sArr[i].getInterestPoint());
		}
		for(int i = 0; i < gIdx; i++) {
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n",
					gArr[i].getName(),gArr[i].getGrade(),
					gArr[i].getPoint(),gArr[i].getInterestPoint());
		}
		for(int i = 0; i < vIdx; i++) {
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n",
					vArr[i].getName(),vArr[i].getGrade(),
					vArr[i].getPoint(),vArr[i].getInterestPoint());
		}
		for(int i = 0; i < vvIdx; i++) {
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n",
					vvArr[i].getName(),vvArr[i].getGrade(),
					vvArr[i].getPoint(),vvArr[i].getInterestPoint());
		}
	}
}
