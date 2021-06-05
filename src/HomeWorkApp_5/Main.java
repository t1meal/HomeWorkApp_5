package HomeWorkApp_5;

public class Main {

    public static void main(String[] args) {
        Person [] arrayPerson = new Person[]{
                new Person("Ivan Ivanov", "dev_ops", "ivan@mail.ru", "8(905)657-52-63", 80000, 35),
                new Person("Petya Petrov", "admin", "petya@mail.ru", "8(905)645-54-41", 120000, 45),
                new Person("Semen_Semenich", "programmist", "semen_semen@mail.ru", "8(920)950-55-21", 100000, 30),
                new Person("Olesa Pavlova", "Secretary", "umnushka@yandex.ru", "8(999)251-11-22", 60000, 25),
                new Person("Oleg Vitallev", "Boss", "big_bos@gmail.com", "89607776677", 200000, 47)
        };


        int checkAge = 40;
        for (Person person : arrayPerson){
            if (person.age > checkAge){
                person.infoPrint();
                System.out.println();
            }
        }
    }
}
