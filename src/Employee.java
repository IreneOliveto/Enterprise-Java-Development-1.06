class Employee {
    private String name;
    private String surname;
    private int idNumber;
    private String role;
    private double salary;

    //default constructor
    public Employee(){};

    //constructor method
    public Employee(String name, String surname,/* int idNumber, String role,*/ double salary) {
        setName(name);
        setSurname(surname);
    /*    setIdNumber(idNumber);
        setRole(role);
    */
        setSalary(salary);
    }

    //setter
    public void setName(String name) {
        this.name = name;

    }

    public void setSurname(String surname) {
        this.surname = surname;

    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;

    }

    public void setRole(String role) {
        this.role = role;

    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

    //getter
    public String getName() {
        return this.name;

    }

    public String getSurname() {
        return this.surname;

    }

    public int getIdNumber() {
        return this.idNumber;

    }

    public String getRole() {
        return this.role;

    }

    public double getSalary() {
        return this.salary;

    }

}
