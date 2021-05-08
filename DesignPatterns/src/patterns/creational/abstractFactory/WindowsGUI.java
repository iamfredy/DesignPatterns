package patterns.creational.abstractFactory;

public class WindowsGUI implements IGUIFactory {

	@Override
	public IButton getButton() {		
		return new WindowsButton();
	}

	@Override
	public ICheckBox getCheckBox() {
		return new WindowsCheckBox();
	}

}
