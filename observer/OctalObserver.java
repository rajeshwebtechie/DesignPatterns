public class OctalObserver extends Observer{

   public OctalObserver(CoreObserver corenotifier){
	      corenotifier.attach(this);
	   }
   @Override
   public void update() {
     System.out.println( "Octal String: " ); 
   }
}
