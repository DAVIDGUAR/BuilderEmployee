package employee;

/**
 *
 * @author david
 */
public class EmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Employee empleado1 = new EmployeeBuilder("David","Rodriguez",11l).setNewBirthDate(3).setNewBirthMonth(10).setNewBirthYear(85).createEmployee();
                
        System.out.println("Empleado del mes" + empleado1.toString());
        
    }
    
}
