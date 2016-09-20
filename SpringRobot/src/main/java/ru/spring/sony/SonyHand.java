package ru.spring.sony;

import ru.spring.interfaces.Hand;

public class SonyHand implements Hand {
	public void shake() {
		System.out.println("Sony Shaking hand!");
	}
}
