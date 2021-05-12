package patterns.structural.bridge.viewableentities;

import java.time.Instant;

public class Team {
	Long teamId;
	String teamName;
	String teamLogoURL;
	Instant createdOn;
	Instant lastModifiedOn;
	
	public Team(String name,String teamLogoURL) {
		this.teamId=System.currentTimeMillis();
		this.teamName=name;
		this.teamLogoURL=teamLogoURL;
		this.createdOn=Instant.ofEpochMilli(System.currentTimeMillis());
		this.lastModifiedOn=Instant.ofEpochMilli(System.currentTimeMillis()+189213l);
	}
	
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamLogoURL() {
		return teamLogoURL;
	}
	public void setTeamLogoURL(String teamLogoURL) {
		this.teamLogoURL = teamLogoURL;
	}
	public Instant getCreatedOnInstant() {
		return createdOn;
	}
	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}
	public Instant getLastModifiedOnInstant() {
		return lastModifiedOn;
	}
	public void setLastModifiedOn(Instant lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}
}
