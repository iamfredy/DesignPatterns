package patterns.structural.bridge.viewableentities;

public class Agent {
	Long agentId;
	String name;
	String bio;
	String profilePicURL;
	Long createdOn;
	Long phoneNumber;
	Long lastModifiedOn;

	
	public Agent(String name,String bio,String profilePicURL) {
		this.agentId=System.currentTimeMillis();
		this.name=name;
		this.bio=bio;
		this.profilePicURL=profilePicURL;
		this.createdOn=System.currentTimeMillis();
		this.lastModifiedOn=System.currentTimeMillis()+360000l;
		this.phoneNumber=System.currentTimeMillis()-12345l;;
	}
	public Long getAgentId() {
		return agentId;
	}
	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getProfilePicURL() {
		return profilePicURL;
	}
	public void setProfilePicURL(String profilePicURL) {
		this.profilePicURL = profilePicURL;
	}
	public Long getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Long createdOn) {
		this.createdOn = createdOn;
	}
	public Long getLastModifiedOn() {
		return lastModifiedOn;
	}
	public void setLastModifiedOn(Long lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}	
}
