package ch06;

import java.util.Scanner;

public class Hero {
//	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die; // boolean은 get,set 대신 'is'라고 쓰는 게 일반적
	Scanner sc = new Scanner(System.in);
	private String name = sc.next();

	// getter 메서드 만들기 (5) -return타입 있다
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.power;
	}

	public boolean isDie() {
		return this.die;
	}

	// setter 메서드 만들기 (5)-return 타입 없다
//	public void setName(String name) {
//		this.name = name;
//	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public void isDie(boolean die) {
		this.die = die;
	}

	// 방어적 코드 추가
	public void setName(String name) {
		this.name = name;
		if(name.length()>8) {
			System.out.println("이름은 8글자 미만으로 작성해야 합니다.");
			return;
		}
	}
}
	
