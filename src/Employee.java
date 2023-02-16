public class Employee  {

    private String name;
    private String position;
    private String email;
    private int phoneNumber;
    private int age;

//        public Employee Employee() {
//            this.name = name;
//            this.position = position;
//            this.email = email;
//            this.phoneNumber = phoneNumber;
//            this.age = age;
//            return this;
//        }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public Employee setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Employee setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }
}
