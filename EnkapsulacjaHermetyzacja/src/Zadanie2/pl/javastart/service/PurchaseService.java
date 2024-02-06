package Zadanie2.pl.javastart.service;

import Zadanie2.pl.javastart.data.Movie;
import Zadanie2.pl.javastart.data.Person;
import Zadanie2.pl.javastart.data.Ticket;

public class PurchaseService
{
    private int ticketCounter = 0;

    public void purchaseSeat(Movie movie, Person person)
    {
        if (checkSeatAvailability(movie) && checkAgeRequirement(movie, person))
        {
            createTicket(movie, person);
        }
        else
            System.out.println("Nie można zakupić miejsca");
    }

    private void createTicket(Movie movie, Person person)
    {
        person.setTicket(new Ticket(
                ticketCounter++,
                person.getFirstName() + " " + person.getLastName(),
                movie.getMovieTitle()));
        movie.setFreeSeats(movie.getFreeSeats() - 1);
    }

    private boolean checkSeatAvailability(Movie movie)
    {
        if (movie.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
            return false;
        }
        else
            return true;
    }

    private boolean checkAgeRequirement(Movie movie, Person person)
    {
        if (person.getAge() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
            return false;
        }
        else
            return true;
    }
}
