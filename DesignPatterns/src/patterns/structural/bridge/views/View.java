package patterns.structural.bridge.views;

import patterns.structural.bridge.viewableentities.ViewableEntity;

public abstract class View {
	ViewableEntity viewableEntity;
	public View(ViewableEntity viewableEntity) {
		this.viewableEntity=viewableEntity;
	}
	public abstract void display();
}
