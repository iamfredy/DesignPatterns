package patterns.structural.bridge.views;

import patterns.structural.bridge.viewableentities.ViewableEntity;

public class DetailView extends View{
	public DetailView(ViewableEntity viewableEntity) {
		super(viewableEntity);
	}

	@Override
	public void display() {
		System.out.println("****Detail View For "+this.viewableEntity.getType()+"***************************");
		System.out.println("*****Name             :"+this.viewableEntity.getName());
		System.out.println("*****Description      :"+this.viewableEntity.getSummary());
		System.out.println("*****Logo             :"+this.viewableEntity.getPhotoUrl());
		System.out.println("*****Last Modified On :"+this.viewableEntity.getLastModifiedOnInstant());
		System.out.println("*****Created On       :"+this.viewableEntity.getCreatedOnInstant());
		System.out.println("**************************************************");		
	}
	
}
