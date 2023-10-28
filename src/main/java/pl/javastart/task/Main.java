package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person ona = new Person("Anna", "Nowak");
        Person on = new Person("Adam", "Nowak");
        Task task1 = new Task("Sprzątanie", "Salon, Łazienka, Kuchnia, Przedpokój i Sypialnia", -1, on);
        Task task2 = new Task("Pranie", "Kolorowe i białe osobno", 1, ona);

        System.out.println("Zadanie 1 do wykonania to:" + task1.getName() + ", opis: "
                + task1.getDescription() + ", Priorytet: " + task1.getPriority() +
                ", Osoba odpowiedzialna: " + task1.person.getFirstName() + " " + task1.person.getLastName());

        System.out.println("Zadanie 2 do wykonania to:" + task2.getName() + ", opis: "
                + task2.getDescription() + ", Priorytet: " + task2.getPriority() +
                ", Osoba odpowiedzialna: " + task2.person.getFirstName() + " " + task2.person.getLastName());

        System.out.println("Sprawdzam priorytet zadania: " + task1.getName());
        task1.highPriority();
        System.out.println("Czy high? " + task1.highPriority());

        task1.mediumPriority();
        System.out.println("Czy medium? " + task1.mediumPriority());

        task1.lowPriority();
        System.out.println("Czy low? " + task1.lowPriority());

        System.out.println("Ustawiam priorytet zadania: " + task1.getName() + " na high");
        task1.setPriority(1);

        System.out.println("Sprawdzam priorytet zadania: " + task1.getName());
        task1.highPriority();
        System.out.println("Czy high? " + task1.highPriority());

        task1.mediumPriority();
        System.out.println("Czy medium? " + task1.mediumPriority());

        task1.lowPriority();
        System.out.println("Czy low? " + task1.lowPriority());

        System.out.println("Ustawiam priorytet zadania: " + task1.getName() + " na medium");
        task1.setPriority(0);

        System.out.println("Sprawdzam priorytet zadania: " + task1.getName());
        task1.highPriority();
        System.out.println("Czy high? " + task1.highPriority());

        task1.mediumPriority();
        System.out.println("Czy medium? " + task1.mediumPriority());

        task1.lowPriority();
        System.out.println("Czy low? " + task1.lowPriority());

    }
}
