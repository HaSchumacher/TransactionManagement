/**--- Generated at Sun Feb 28 16:02:00 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class login_Command extends ServiceCommand<Void>{
   private static final long serialVersionUID = -1119024674L;
   private String username;
   private String password;
   public login_Command(String username, String password){
      super();
      this.username = username;
      this.password = password;
   }
   public void execute(){
      try{CinemaService.getInstance().login(username, password);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}
