package javabasicanna.homeworks.lecture10;

public class FitUser {
    private String firstName;
    private int dayOfBirth;
    private  int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private  String phone;
    private String lastName;
    private double weight;
    private int pressure;
    private int stepsPerDay;
    private int age;

    public FitUser(String firstName, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String phone, String lastName, double weight, int pressure, int stepsPerDay) {
        this.firstName = firstName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
        this.age = 2020 - yearOfBirth;
    }

    public void printAccountInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Date of Birth: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight);
        System.out.println("Pressure: " + pressure);
        System.out.println("Steps per Day: " + stepsPerDay);
        System.out.println();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public static void main(String[] args) {
        FitUser user1 = new FitUser("Alice", 15, 5, 1990, "alice@example.com", "1234567890", "Smith", 65.5, 120, 8000);
        FitUser user2 = new FitUser("Bob", 20, 10, 1985, "bob@example.com", "9876543210", "Johnson", 75.2, 130, 10000);
        FitUser user3 = new FitUser("Eve", 8, 3, 2000, "eve@example.com", "4561237890", "Brown", 55.0, 110, 6000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setWeight(63.0);
        user1.setStepsPerDay(9000);
        user1.printAccountInfo();

        user2.setPressure(125);
        user2.setLastName("Williams");
        user2.printAccountInfo();
    }
}
