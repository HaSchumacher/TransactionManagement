/**--- Generated at Fri Mar 05 15:44:03 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.proxies;
import db.executer.PersistenceException;
import generated.cinemaService.Role;
public abstract class RoleProxy implements IRole{
   public abstract Role getTheObject();
   public boolean equals(Object o) {
      if(!(o instanceof IRole)) return false;
      return ((IRole)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
}
