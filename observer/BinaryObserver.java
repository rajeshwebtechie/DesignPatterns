public class BinaryObserver extends Observer{

   static{
      CoreObserver.attach(new BinaryObserver());
   }

   public void update() {
      System.out.println( "Binary String: "); 
   }
}
