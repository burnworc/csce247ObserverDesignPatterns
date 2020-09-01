/**
 * The class Cook contains the methods for making an arraylist of observers actions and the methods for obtaining this information.
 * @author Cole
 *
 */
import java.util.*;
public class Cook implements Subject {
	private ArrayList<Observer> observers;
	private String name;
	
	/**
	 * Constructor for name, and other methods for the Observers
	 * @param name
	 */
	public Cook(String name) {
		this.name = name;
		this.observers = new ArrayList<Observer>(); // creates new Arraylist of observers
	}

	public String getName() { // Returns name of cook
		return name;
	}
	
	public void registerObserver(Observer observer) { // Registers observer if they are not already in the database
		if(!observers.contains(observer)) {
			observers.add(observer);
		}		
	}
	
	public void removeObserver(Observer observer) { // Removes observer if they are already in the database
		if(observers.contains(observer)) {
			observers.remove(observer);
		}
	}
	
	public void notifyObservers(String location, String description) { // Notifies observers if the location changes
		for(Observer observer : observers) {
			observer.update(location, description);
		}
	}
	
	public void enterSighting(String location, String description) { // Allows observers to update the location and description of the cook
		notifyObservers(location, description);
	}
}
