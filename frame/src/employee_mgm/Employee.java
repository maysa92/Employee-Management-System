
package employee_mgm;


public class Employee {
    //data defined object
    //field
    private String name;
    private int id;
    private String dob;
    //method

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDob() {
        return dob;
    }
    
    
    //constructor
    public Employee(String name, int id, String dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }
    
    
}
