public class Employee {

    private static void main(String[] args) {
        private String name;
        private String surname;
        private int idNumber;
        private String role;
        private double salary;
    }

    //constructor
    public employee(String name, String surname, int idNumber, String role, double salary) {
        setName(name);
        setSurname(surname);
        setIdNumber(idNumber);
        setRole(role);
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
        return this. surname;
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

    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.Scanner;

    public class EmployeeFile {
        public static void main(String[] args) throws IOException {
            // Open file to be written in
            FileWriter writer = new FileWriter("employees.txt", true);

            // Write in file
            writer.write("Employee1\n");
            writer.write("Employee2\n");
            writer.write("Employee3\n");
            writer.write("Employee4\n");
            writer.write("Employee5\n");
            writer.write("Employee6\n");
            writer.write("Employee6\n");
            writer.write("Employee7\n");
            writer.write("Employee8\n");
            writer.write("Employee9\n");
            writer.write("Employee10\n");

            // Create file if not exist or update the content of the writer
            writer.close();

            // Open file
            File file = new File("employees.txt");
            // Create scanner object to iterate over the file
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }

            // Close buffer
            scanner.close();
        }
    }

}
