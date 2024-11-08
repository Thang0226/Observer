package model;

import model.abstracts.Observer;
import model.abstracts.Subject;

public class IntSubject extends Subject {

	@Override
	public void remove(Observer o) {
		observers.remove(o);
	}
}
