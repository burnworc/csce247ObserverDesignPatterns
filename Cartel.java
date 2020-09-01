/**
 * The class cartel keeps track of the locations as an arrayList of sightings, and displays the locations, followed by the notes
 * @author Cole
 *
 */
import java.util.*;
public class Cartel implements Observer {
	private Subject cook;
	private ArrayList<Sighting> sightings;
	
	/**
	 * Constructor methods for cook and sightings
	 * @param cook
	 */
	public Cartel(Subject cook) {
		this.setCook(cook);
		this.sightings = new ArrayList<Sighting>();
		cook.registerObserver(this);
	}
	
	/**
	 * Getters and setters for the Subject cook 
	 * @return
	 */
	public Subject getCook() {
		return cook;
	}
	
	public void setCook(Subject cook) {
		this.cook = cook;
	}
	
	/**
	 * method for updating location and description
	 */
	
	public void update(String location, String description) {
		sightings.add(new Sighting(location, description));
	}
	
	/**
	 * method for displaying each location, and then the description
	 */
	public String getLog() {
		String logOutput = "";
		for(Sighting sighting : sightings) {
			logOutput += sighting.getLocation()+" ("+sighting.getDetails()+")\n";
		}
		return logOutput;
	}
}
