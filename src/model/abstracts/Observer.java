package model.abstracts;

public abstract class Observer {

	private Subject subject;

	public Observer(Subject subject) {
		this.subject = subject;
	}

	public Subject getSubject() {
		return subject;
	}

	public abstract void update();

}
