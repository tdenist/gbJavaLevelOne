public class Employee {

    public String fullName;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeInfo() {
        System.out.println("ФИО сотрудника: " + fullName + ",\n" +
                "должность: " + position + ",\n" +
                "email: " + email + ",\n" +
                "телефон: " + phone + ",\n" +
                "зарплата: " + salary + ",\n" +
                "возраст: " + age);
    }
}

