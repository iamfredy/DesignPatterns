package patterns.creational.abstractFactory;

public class MacOSGUI implements IGUIFactory {

	@Override
	public IButton getButton() {
		return new MacOSButton();
	}

	@Override
	public ICheckBox getCheckBox() {
		return new MacOSCheckBox();
	}

}
