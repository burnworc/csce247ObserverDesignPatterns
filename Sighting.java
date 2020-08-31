/**
 * This class provides the methods for getting the location and details for Heinzenberg.
 * @author Cole
 *
 */
public class Sighting {
	private String location;
	private String details;
	
	/**
	 * Constructors for location and details
	 * @param location
	 * @param details
	 */
	public Sighting(String location, String details) {
		this.location = location;
		this.details = details;
	}
	/**
	 * Getters and setters for location and details
	 * @return
	 */
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}	
}
