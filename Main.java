/**
 * Lesson5
 * @author Gordeev Evgeny
 * @version 14.06.2019
 */
public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov","ivanov@mail.ru", 36);
        persArray[1] = new Person("Petrov","petrov@mail.ru", 58);
        persArray[2] = new Person("Sidorov","sidorov@mail.ru", 61);
        persArray[3] = new Person("Kozlov","kozlov@mail.ru", 26);
        persArray[4] = new Person("Vasielev","vasielev@mail.ru", 41);
        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() > 40){
                persArray[i].printInfo();
            }
        }
    }
}
