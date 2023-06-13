package org.system;

public class Desktop extends Computer {

	public static void main(String[] args) {
		Desktop des = new Desktop();
		des.desktopSize();
		des.computerModel();

	}
	public void desktopSize() {
		System.out.println("desktopSize method is called");
	}
}
