/**--- Generated at Sun Feb 28 15:53:02 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaBookingService.commands;
import generated.cinemaBookingService.*;
import commands.*;
public class OwnerService_addFilmprojection_Command extends ObjectCommand<OwnerService, String>{
   private static final long serialVersionUID = 650641494L;
   private Movie movie;
   private Cinemahall cinemahall;
   public OwnerService_addFilmprojection_Command(OwnerService receiver, Movie movie, Cinemahall cinemahall){
      super(receiver);
      this.movie = movie;
      this.cinemahall = cinemahall;
   }
   public void execute(){
      try{this.result = this.receiver.addFilmprojection(movie, cinemahall);
      }catch(Exception e){this.e = e;
      }finally{this.receiver.notifyObservers(this);}
   }
}
