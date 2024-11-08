package model.abstracts;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	protected List<Observer> observers = new ArrayList<>();
	private int state;

	public void addObserver(Observer o) {
		observers.add(o);
	}

	public abstract void removeObserver(Observer o);

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int value) {
		this.state = value;
		notifyObservers();
	}
}
