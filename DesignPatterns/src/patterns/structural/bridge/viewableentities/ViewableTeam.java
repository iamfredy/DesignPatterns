package patterns.structural.bridge.viewableentities;

import java.time.Instant;

public class ViewableTeam extends Team implements ViewableEntity{

	public ViewableTeam(String name, String teamLogoURL) {
		super(name, teamLogoURL);
	}

	@Override
	public String getPhotoUrl() {
		return this.teamLogoURL;
	}

	@Override
	public String getSummary() {
		return "Team Name is : "+this.teamName+" and Created on "+this.createdOn;
	}

	@Override
	public String getName() {
		return this.teamName;
	}

	@Override
	public String getType() {
		return "Team";
	}

	@Override
	public Instant getCreatedOnInstant() {
		return this.createdOn;
	}

	@Override
	public Instant getLastModifiedOnInstant() {
		return this.lastModifiedOn;
	}

}
