/**--- Generated at Fri Mar 05 15:44:03 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class deleteCinemahall_Command extends ServiceCommand<Boolean>{
   private static final long serialVersionUID = 1391425931L;
   private Cinemahall c;
   public deleteCinemahall_Command(Cinemahall c){
      super();
      this.c = c;
   }
   public void execute(){
      try{this.result = CinemaService.getInstance().deleteCinemahall(c);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}
