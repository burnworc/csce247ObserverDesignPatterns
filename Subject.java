/**
 * The interface Subject contains the subject which is "Heinzenberg", the cook from Breaking Bad.
 * @author Cole Burnworth
 *
 */
public interface Subject {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers(String location, String description);
}
