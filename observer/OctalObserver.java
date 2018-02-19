public class OctalObserver extends Observer{

   public OctalObserver(CoreNotifier corenotifier){
	      corenotifier.attach(this);
	   }
   @Override
   public void update() {
     System.out.println( "Octal String: " ); 
   }
}
