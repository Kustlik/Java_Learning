package Zadanie1;

public class App {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person("Jan", "Kowalski", "29384857"));
        db.add(new Person("Anna", "Marek", "238328493"));
        db.add(new Person("Michał", "Jasny", "23938293843"));
        db.add(new Person("Michał", "Jasny", "23938293843"));
        db.add(new Person("Jędrzej", "Dziobek", "023985892392"));
        db.add(new Person("Burzyj", "Welencja", "29384727382"));
        db.remove(new Person("Michał", "Jasny", "23938293843"));

        for (int i=0; i<db.size(); i++){
            if (db.get(i) != null)
                System.out.println(String.valueOf(i) + ": " + db.get(i));
        }
    }
}
