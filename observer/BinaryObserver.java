public class BinaryObserver extends Observer{

   static{
      CoreNotifier.attach(new BinaryObserver());
   }

   public void update() {
      System.out.println( "Binary String: "); 
   }
}
