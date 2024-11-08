package model;

import model.abstracts.Observer;
import model.abstracts.Subject;

public class IntSubject extends Subject {

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
}
