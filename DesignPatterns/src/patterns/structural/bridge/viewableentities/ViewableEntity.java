package patterns.structural.bridge.viewableentities;

import java.time.Instant;

public interface ViewableEntity {
	public String getPhotoUrl();
	public String getSummary();
	public String getName();
	public String getType();
	public Instant getCreatedOnInstant();
	public Instant getLastModifiedOnInstant();
}
