package ru.spring.robot;

import ru.spring.interfaces.Hand;
import ru.spring.interfaces.Head;
import ru.spring.interfaces.Leg;
import ru.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hand hand;
	private Head head;
	private Leg leg;

	private String color;
	private int year;
	private boolean isArny;

	public ModelT1000() {

	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		this.hand = hand;
		this.head = head;
		this.leg = leg;
	}

	public ModelT1000(String color, int year, boolean isArny) {
		super();
		this.color = color;
		this.year = year;
		this.isArny = isArny;
	}

	public ModelT1000(Hand hand, Head head, Leg leg, String color, int year, boolean isArny) {
		super();
		this.hand = hand;
		this.head = head;
		this.leg = leg;
		this.color = color;
		this.year = year;
		this.isArny = isArny;
	}

	@Override
	public void action() {
		head.calc();
		hand.shake();
		leg.move();
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
		System.out.println("Is it Arny?: " + isArny);
		System.out.println();
	}

	public void dance() {
		System.out.println("T100 is dancing!");
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isArny() {
		return isArny;
	}

	public void setArny(boolean isArny) {
		this.isArny = isArny;
	}

}
