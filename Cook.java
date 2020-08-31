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
		this.observers = new ArrayList<Observer>();
	}

	public String getName() {
		return name;
	}
	
	public void registerObserver(Observer observer) {
		if(!observers.contains(observer))
			observers.add(observer);		
	}
	
	public void removeObserver(Observer observer) {
		if(observers.contains(observer))
			observers.remove(observer);
	}
	
	public void notifyObservers(String location, String description) {
		for(Observer observer : observers)
		observer.update(location, description);
	}
	
	public void enterSighting(String location, String description) {
		notifyObservers(location, description);
	}
}
