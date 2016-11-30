import java.util.List;
import java.util.ArrayList;
/**
 * Subject is the abstract observable class contains the list of observer
 * @author Kundjanasith Thonglek 5710545023
 */
public class Subject{
	private List<Observer> observers = new ArrayList<Observer>();
	public void subscribe(Observer observer){
	      observers.add(observer);		
	   }
	public void unsubscribe(Observer observer){
		  observers.remove(observer);
	}
	public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	} 	
}

