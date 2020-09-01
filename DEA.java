/**
 * DEA class contains the methods for keeping track of the locations, descriptions, and displays these methods.
 * @author Cole
 *
 */
import java.util.*;
public class DEA implements Observer {
	private Subject cook;
	private ArrayList<String> locations;
	private String notes;
	
	/**
	 * Sets cook and creates an arraylist for locations and registers to the observer
	 * @param cook
	 */
	public DEA(Subject cook) {
		this.setCook(cook);
		this.locations = new ArrayList<String>();
		this.notes = "";
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
	
	public void update(String location, String description) { // Adds a new location for Heinzenberg
		locations.add(location);
		this.notes += "\n" + description;
	}
	
	/**
	 * Method for returning the output of location and notes on Heinzenberg
	 */
	public String getLog() {
		String logOutput = "Locations:\n";
		for(String location : locations) {
			logOutput += location+"\n";
		}
		logOutput += "\nNotes: "+this.notes+"\n";
		return logOutput;
	}
}
