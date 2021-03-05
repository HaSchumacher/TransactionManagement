/**--- Generated at Fri Mar 05 15:44:03 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class Movie_constructor_Command extends ServiceCommand<Movie>{
   private static final long serialVersionUID = 422003522L;
   private String  title;
   public Movie_constructor_Command(String  title){
      super();
      this.title = title;
   }
   public void execute(){
      try{this.result = Movie.createFresh(title);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}
