package patterns.creational.abstractFactory;

public interface IGUIFactory {
	public IButton getButton();
	public ICheckBox getCheckBox();
}
