package patterns.creational.abstractFactory;

public class WindowsButton implements IButton {

	@Override
	public void displayButtonInUI() {
		System.out.println("Displaying Windows Button in the UI");
	}

}
