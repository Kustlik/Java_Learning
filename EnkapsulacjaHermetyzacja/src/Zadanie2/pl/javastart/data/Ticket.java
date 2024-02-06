package Zadanie2.pl.javastart.data;

public class Ticket
{
    private int ticketId;
    private String ticketPersonData;
    private String ticketMovieTitle;

    public Ticket(int ticketId, String ticketPersonData, String ticketMovieTitle)
    {
        this.ticketId = ticketId;
        this.ticketPersonData = ticketPersonData;
        this.ticketMovieTitle = ticketMovieTitle;
    }

    public int getTicketId() {return ticketId;}
    public String getTicketPersonData() {return ticketPersonData;}
    public String getTicketMovieTitle() {return ticketMovieTitle;}

    public void setTicketId(int ticketId) {this.ticketId = ticketId;}
    public void setTicketPersonData(String ticketPersonData) {this.ticketPersonData = ticketPersonData;}
    public void setTicketMovieTitle(String ticketMovieTitle) {this.ticketMovieTitle = ticketMovieTitle;}
}
