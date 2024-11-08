package model;

import model.abstracts.Observer;
import model.abstracts.Subject;

public class BinObserver extends Observer {
	public BinObserver(Subject subject) {
		super(subject);
	}

	public void update() {
		System.out.print(" Bin: " + Integer.toBinaryString(super.getSubject().getState()) + "\t");
	}
}
