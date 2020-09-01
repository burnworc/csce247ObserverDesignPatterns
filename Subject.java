/**
 * The interface Subject contains the subject which is "Heinzenberg", the cook from Breaking Bad.
 * @author Cole Burnworth
 *
 */
public interface Subject {
	void registerObserver(Observer observer); // Registers observer
	void removeObserver(Observer observer); // Removes observer from the program
	void notifyObservers(String location, String description); // Notifies observers of Heinzenberg's whereabouts
}
