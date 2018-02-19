public class HexaObserver extends Observer{

	  public HexaObserver(CoreObserver corenotifier){
	      corenotifier.attach(this);
	   }


   public void update() {
      System.out.println( "Hex String: " ); 
   }
}
