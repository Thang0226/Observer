package view;

import model.BinObserver;
import model.HexObserver;
import model.IntSubject;
import model.OctObserver;
import model.abstracts.Subject;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Subject subject = new IntSubject();

		subject.addObserver(new HexObserver(subject));
		subject.addObserver(new OctObserver(subject));
		subject.addObserver(new BinObserver(subject));

		Scanner input = new Scanner(System.in);
		for (int i = 0; i< 5; i++) {
			System.out.print("\n\nEnter an Integer number: ");
			subject.setState(input.nextInt());
		}
	}
}
