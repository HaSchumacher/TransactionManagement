/**--- Generated at Sun Feb 28 15:53:01 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaBookingService.commands;
import generated.cinemaBookingService.*;
import commands.*;
public class FrontRow_constructor_Command extends ServiceCommand<FrontRow>{
   private static final long serialVersionUID = -803812157L;
   private Integer  price;
   private Boolean  bookedUp;
   public FrontRow_constructor_Command(Integer  price, Boolean  bookedUp){
      super();
      this.price = price;
      this.bookedUp = bookedUp;
   }
   public void execute(){
      try{this.result = FrontRow.createFresh(price, bookedUp);
      }catch(Exception e){this.e = e;
      }finally{CinemaBookingService.getInstance().notifyObservers(this);}
   }
}
