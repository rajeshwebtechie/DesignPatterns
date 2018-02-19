public class HexaObserver extends Observer{

	  public HexaObserver(CoreNotifier corenotifier){
	      corenotifier.attach(this);
	   }


   public void update() {
      System.out.println( "Hex String: " ); 
   }
}
