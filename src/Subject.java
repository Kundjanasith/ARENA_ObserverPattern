import java.util.List;
import java.util.ArrayList;

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
