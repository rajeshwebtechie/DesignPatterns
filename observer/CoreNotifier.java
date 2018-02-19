public class CoreNotifier {
   public static void main(String[] args) {
      CoreObserver corenotifier = new CoreObserver();
      corenotifier.notifyAllObservers();
   }
}
