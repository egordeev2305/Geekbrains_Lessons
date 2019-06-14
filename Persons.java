/**
 * Создать класс "Сотрудники" с полями: фио, email, возраст;
 */
 
public class Person {
    private String fio;
    private int age;
    private String email;

    public int getAge() {
        return age;
    }

    public Person(String fio, String email, int age) {
        this.fio = fio;
        this.email = email;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("fio " + fio + " email " + email + " age " + age);
    }
}
