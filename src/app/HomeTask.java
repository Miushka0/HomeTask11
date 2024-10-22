package app;

public class HomeTask {
    public static void main(String[] args) {
        Person firstPerson = new Person("John", 30, "Інженер");
        Person secondPerson = new Person("Mary", 25, "Вчитель");
        Person thirdPerson = new Person("Bob", 25, "Лікар");

        System.out.println(firstPerson);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);

        System.out.println();
        System.out.println(firstPerson);
        firstPerson.setProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        System.out.println(firstPerson);
    }
}
