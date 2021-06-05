package HomeWorkApp_5;

public class Person {
    String name;
    String status;
    String email;
    String phoneNumber;
    int cash;
    int age;

    Person(String name, String status, String email, String phoneNumber, int cash, int age){
        this.name = name;
        this.status = status;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.cash = cash;
        this.age = age;
    }
    void infoPrint(){
        System.out.println("ФИО " + name);
        System.out.println("Должность  " + status);
        System.out.println("Email  " + email);
        System.out.println("Телефон  " + phoneNumber);
        System.out.println("Зарплата  " + cash);
        System.out.println("Возраст  " + age);
    }
}
