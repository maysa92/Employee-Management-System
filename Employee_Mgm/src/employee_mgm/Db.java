
package employee_mgm;


public class Db { //data access object
    //field
    Employee db[] = new Employee[10];
    int index = 0;
    //method
    //register
    public Employee register(Employee emp){
        db[index] = emp;
        index++;
        return db[index-1];
    }

    //search
    public Employee search(int id){
        int target = 0;
        for(int i = 0; i < db.length; i++){
            int x = db[i].getId();
            if(id == x)
            target = i;
            break;
        }
        return db[target];
    }
    
    
    //count
    public int count(){
        int count = 0;
        for(int i = 0; i < db.length; i++){
            if(db[i] != null)count++;
        }
        return count;       
    }
    //print
    public Employee[] print(){
        return db;
    }
    
    //constructor
}
