/**--- Generated at Sun Feb 28 15:10:31 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class deleteFilmprojection_Command extends ServiceCommand<Boolean>{
   private static final long serialVersionUID = 623573819L;
   private Filmprojection fp;
   public deleteFilmprojection_Command(Filmprojection fp){
      super();
      this.fp = fp;
   }
   public void execute(){
      try{this.result = CinemaService.getInstance().deleteFilmprojection(fp);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}