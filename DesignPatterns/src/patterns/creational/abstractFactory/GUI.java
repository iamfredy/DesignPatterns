package patterns.creational.abstractFactory;

public class GUI {
	public static IGUIFactory getGUIFactory(String os) {
		if("windows".equals(os)) {
			return new WindowsGUI();
		}
		else if("macos".equals(os)) {
			return new MacOSGUI();
		}
		return null;
	}
}
