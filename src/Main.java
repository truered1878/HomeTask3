import org.hillel.java.hometask3.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

        System.out.println("------------------------------");

        System.out.println("Name: " + employee.getName() + "\n" + "Email: " + employee.getEmail()  + "\n" + "Position: "
                + employee.getPosition()  + "\n" + "Age: " + employee.getAge() + "\n" + "Phone Number: " + employee.getPhoneNumber());
    }
}