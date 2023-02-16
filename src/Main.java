public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee()
                .setName("Stanley Hudson")
                .setAge(33)
                .setPosition("Sales Manager")
                .setEmail("stanley.hudson@yahoo.com")
                .setPhoneNumber(7444364);


        System.out.println("Name: " + employee.getName() + "\n" + "Email: " + employee.getEmail()  + "\n" + "Position: "
                + employee.getPosition()  + "\n" + "Age: " + employee.getAge() + "\n" + "Phone Number: " + employee.getPhoneNumber());
    }
}