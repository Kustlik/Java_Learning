package Zadanie2.pl.javastart.system;

import Zadanie2.pl.javastart.data.Movie;
import Zadanie2.pl.javastart.data.Person;
import Zadanie2.pl.javastart.data.Ticket;
import Zadanie2.pl.javastart.service.PrintService;
import Zadanie2.pl.javastart.service.PurchaseService;

class CinemaSystem {
    public static void main(String[] args) {

        PurchaseService purchaseService = new PurchaseService();
        PrintService printService = new PrintService();

        Movie movie = new Movie("Omen", "horror", 128, 16, 72, 72);

        Person person1 = new Person("Jan", "Kowalski", 15);
        purchaseService.purchaseSeat(movie, person1);

        Person person2 = new Person("Anna", "Zalewska", 19);
        purchaseService.purchaseSeat(movie, person2);

        System.out.println("Sprzedane bilety");
        if (person1.getTicket() != null)
            printService.printTicketInfo(movie, person1.getTicket());
        if (person2.getTicket() != null)
            printService.printTicketInfo(movie, person2.getTicket());

        printService.printResume(movie);
    }
}