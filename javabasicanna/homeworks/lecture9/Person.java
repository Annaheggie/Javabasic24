package javabasicanna.homeworks.lecture9;

import java.util.Scanner;

class Person {
    String firstName;
    String lastName;
    String city;
    String phone;

    public Person(String firstName, String lastName, String city, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        return "You can call Citizen " + firstName + " " + lastName + " from " + city + " by number " + phone;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Person 1:");
        System.out.print("First Name: ");
        String firstName1 = scanner.next();
        System.out.print("Last Name: ");
        String lastName1 = scanner.next();
        System.out.print("City: ");
        String city1 = scanner.next();
        System.out.print("Phone: ");
        String phone1 = scanner.next();

        Person person1 = new Person(firstName1, lastName1, city1, phone1);
        System.out.println(person1.personInfo());

        System.out.println("\nEnter details for Person 2:");
        System.out.print("First Name: ");
        String firstName2 = scanner.next();
        System.out.print("Last Name: ");
        String lastName2 = scanner.next();
        System.out.print("City: ");
        String city2 = scanner.next();
        System.out.print("Phone: ");
        String phone2 = scanner.next();

        Person person2 = new Person(firstName2, lastName2, city2, phone2);
        System.out.println(person2.personInfo());

        System.out.println("\nEnter details for Person 3:");
        System.out.print("First Name: ");
        String firstName3 = scanner.next();
        System.out.print("Last Name: ");
        String lastName3 = scanner.next();
        System.out.print("City: ");
        String city3 = scanner.next();
        System.out.print("Phone: ");
        String phone3 = scanner.next();

        Person person3 = new Person(firstName3, lastName3, city3, phone3);
        System.out.println(person3.personInfo());

        scanner.close();
    }
}
