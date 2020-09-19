
package employee_mgm;


public class Crud {
    //field
    Db db = new Db();
    //method
    
    //register
    public Employee register(Employee emp){
       return db.register(emp);
    }
    //search
   public Employee search(int id){
       return db.search(id);
    }
   
   //count
   public int count(){
       return db.count();
    }
   
   //print
   public Employee[] print(){
       return db.print();
   }
   
    //constructor
}
