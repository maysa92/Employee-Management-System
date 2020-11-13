
package employee_mgm;
import java.util.*;

public class Ui {
    //field
    Scanner scan0 = new Scanner(System.in);
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    Scanner scan3 = new Scanner(System.in);
    Crud crud = new Crud();
    //method
    public void showMenu(){
        int w = 0;
        System.out.println("Employee Management System");
        System.out.println("==========================");
        while (w == 0){
            System.out.println();
            System.out.print("----------- MENU -----------\n" +
            "1.registration\n" +
            "2.search by id\n" +
            "3.total number of employee\n" +
            "4.employee list\n" +
            "5.quit\n" +
            "-----------------------------\n" +
            "SELECT MENU 1 - 5: ");
            int menu = scan0.nextInt();
            //register
            if (menu == 1){
                System.out.print("-----REGISTRATION -----\n" +
"insert id (2 digits): ");
                int id = scan1.nextInt();
                System.out.print("insert name: ");
                String name = scan2.nextLine();
                System.out.print("insert DOB (mm/dd/yy): ");
                String dob = scan3.nextLine();
                //call user defined datatype
                Employee emp1 = new Employee(name, id, dob);
                Employee result = crud.register(emp1);
                System.out.println(result.getName() + " is successfully registered.");
            }else if (menu == 2){//search by id
                System.out.print("SEARCH BY ID ----------------\n" +
"insert id (2 digits): ");
                int searchid = scan1.nextInt();
                Employee result1 = crud.search(searchid);
                System.out.println("search by id: "+ searchid);
                System.out.println(result1.getId() +" "+result1.getName()+" "+ result1.getDob());
            }else if (menu == 3){//total number of employee
                int total = crud.count();
                System.out.println("TOTAL NUMBER OF EMPLOYEE: "+total);
            }else if (menu == 4){//print employee list
                //print
                Employee list[] = crud.print();
                for(int i = 0; i < list.length; i++){
                    if(list[i] != null)System.out.println(list[i].getId() +" "+list[i].getName()+" "+ list[i].getDob());
                }
            }else if (menu == 5){//quit
                w = 1;
            }else{
                System.out.print("Invalid input!");
            }
        }
    }
    
    
    
    
    //constructor
}
