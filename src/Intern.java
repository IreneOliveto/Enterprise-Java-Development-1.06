public class Intern extends Employee {

    private static final int MAX_SALARY = 20000;

    //constructor
    public Intern(String name, String surname, /*int idNumber, String role,*/ double salary) {
        setName(name);
        setSurname(surname);
        /*setIdNumber(idNumber);
        setRole(role);*/
        setSalary(salary);
    }

    //setter
    public void setSalary(double salary) {
        if(salary <= MAX_SALARY){
            super.setSalary(salary);
        }else {
            super.setSalary(MAX_SALARY);
        }
    }

}
