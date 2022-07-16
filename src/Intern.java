public class Intern extends Employee {

    public Intern(String name, String surname, double salary) {
        super(name, surname);
        double salaryLimit;
    }

    public void salaryLimit() {
        if (int salary > 2000) {
            System.err.println("Your salary is too high for your position!");
        }
    }

    //setter
    public void setSalaryLimit(String salaryLimit) {
        this.salaryLimit = salaryLimit;
    }

    //getter
    public double getSalaryLimit() {
        return this.salaryLimit;
    }


}
