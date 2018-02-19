import java.util.ArrayList;
import java.util.List;

public class CoreObserver {
	
   private static List<Observer> observers = new ArrayList<Observer>();

   public static void attach(Observer observer){
      observers.add(observer);
   }

   public static void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}
