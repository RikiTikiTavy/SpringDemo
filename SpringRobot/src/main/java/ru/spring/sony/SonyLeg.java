package ru.spring.sony;

import ru.spring.interfaces.Leg;

public class SonyLeg implements Leg {
	public void move() {
		System.out.println("Sony Moving out!");
	}
}
