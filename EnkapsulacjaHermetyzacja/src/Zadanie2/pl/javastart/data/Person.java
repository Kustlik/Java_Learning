package Zadanie2.pl.javastart.data;

public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private Ticket ticket;

    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public Ticket getTicket() {return ticket;}

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {this.age = age;}
    public void setTicket(Ticket ticket) {this.ticket = ticket;}
}
