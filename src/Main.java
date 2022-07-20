import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        //create an array of employees manually
        Employee[] employees = new Employee[10];

        //create & initialize actual employees objects using constructor
        employees[0] = new Employee("Juan", "Red", 34000);
        employees[1] = new Employee("Marta",  "Yellow", 26000);
        employees[2] = new Employee("Luis",  "Green", 40000);
        employees[3] = new Employee( "Carlos",  "Orange", 15000);
        employees[4] = new Employee( "John",  "Brown", 18000);
        employees[5] = new Employee( "Carlos",  "Blue", 32000);
        employees[6] = new Employee( "Jesse",  "Black", 17000);
        employees[7] = new Intern( "Josep",  "Pink", 19000);
        employees[8] = new Intern( "Marc",  "Grey", 56000);
        employees[9] = new Intern("Pau","Golden", 54000);

        FileWriter writer = new FileWriter("employee.txt", true);

        // Write in file
        for (int i = 0; i < employees.length; i++) {
            writer.write(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getSalary()+"\n");
        }

        writer.close();



    }
}

