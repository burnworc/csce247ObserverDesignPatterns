/**
 * The interface Observer contains the methods for the cartel and DEA to find and update the whereabouts of Heinzenberg.
 * @author Cole
 *
 */
public interface Observer {
	void update(String location, String description); // Updates to the new location and description
	String getLog(); // Gets the log of all the information on Heinzenberg
}
