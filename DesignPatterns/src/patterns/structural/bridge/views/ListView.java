package patterns.structural.bridge.views;

import patterns.structural.bridge.viewableentities.ViewableEntity;

public class ListView extends View{

	public ListView(ViewableEntity viewableEntity) {
		super(viewableEntity);
	}
	@Override
	public void display() {
		System.out.println("*****List View For "+this.viewableEntity.getType()+"***************************");
		System.out.println("*****Name            :"+this.viewableEntity.getName());
		System.out.println("*****Logo            :"+this.viewableEntity.getPhotoUrl());
		System.out.println("*****Last Modified On:"+this.viewableEntity.getLastModifiedOnInstant());
		System.out.println("**************************************************");
		
	}


}
