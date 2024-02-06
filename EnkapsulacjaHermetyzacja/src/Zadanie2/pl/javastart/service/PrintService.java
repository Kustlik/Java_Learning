package Zadanie2.pl.javastart.service;

import Zadanie2.pl.javastart.data.Movie;
import Zadanie2.pl.javastart.data.Ticket;

public class PrintService
{
    public void printTicketInfo(Movie movie, Ticket ticket)
    {
        System.out.println(ticket.getTicketId() + " | " +
                ticket.getTicketPersonData() + " | " +
                ticket.getTicketMovieTitle() + " - " +
                movie.getMovieType() + " - " +
                movie.getMovieTime() + "min");
    }

    public void printResume(Movie movie)
    {
        System.out.println("Liczba pozostałych miejsc: " + movie.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie.getMaxSeats() - movie.getFreeSeats()));
    }
}
