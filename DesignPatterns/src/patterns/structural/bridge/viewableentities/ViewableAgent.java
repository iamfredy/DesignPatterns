package patterns.structural.bridge.viewableentities;

import java.time.Instant;

public class ViewableAgent extends Agent implements ViewableEntity {

	public ViewableAgent(String name, String bio, String profilePicURL) {
		super(name, bio, profilePicURL);
	}

	@Override
	public String getPhotoUrl() {
		return this.profilePicURL;
	}

	@Override
	public String getSummary() {
		return this.getBio();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getType() {
		return "Agent";
	}

	@Override
	public Instant getCreatedOnInstant() {
		return Instant.ofEpochMilli(this.createdOn);
	}

	@Override
	public Instant getLastModifiedOnInstant() {
		return Instant.ofEpochMilli(this.lastModifiedOn);
	}

}
