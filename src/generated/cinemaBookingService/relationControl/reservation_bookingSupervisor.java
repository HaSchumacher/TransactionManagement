/**--- Generated at Sun Feb 28 15:53:02 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaBookingService.relationControl;
//10 ===== GENERATED:      Import Section =========
import relationManagement.Relation;
import db.executer.PersistenceException;
import generated.cinemaBookingService.proxies.*;
import exceptions.ConstraintViolation;
import java.util.Set;
import java.util.stream.Collectors;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class reservation_bookingSupervisor
{
   //30 ===== GENERATED:      Attribute Section ======
   private static reservation_bookingSupervisor theInstance = new reservation_bookingSupervisor();
   private Relation<IBooking,IReservation> elements;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private reservation_bookingSupervisor(){
      this.elements = new Relation<>("reservation_booking");
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static reservation_bookingSupervisor getInstance(){return theInstance;}
   public IReservation getMyReservation(IBooking owner){
      return this.elements.getRelatedTargets(owner).isEmpty() ? null : this.elements.getRelatedTargets(owner).get(0);
   }
   public void set(IBooking owner, IReservation target) throws PersistenceException{
      IReservation targetOld = this.getMyReservation(owner); IReservation targetNew = target;
      this.elements.change(owner, targetOld, targetNew);
   }
   public void setAlreadyPersistent(IBooking owner, IReservation target) {
      IReservation targetOld = null; IReservation targetNew = target;
      this.elements.setAlreadyPersistent(owner, targetNew);
   }
   public void change(IBooking owner, IReservation targetOld, IReservation targetNew) throws PersistenceException{
      this.elements.change(owner, targetOld, targetNew);
   }
   public Set<IBooking> getMyBooking(IReservation target){
      return this.elements.getRelatedSources(target).stream().collect(Collectors.toSet());
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}