package Zadanie1;

public class Person
{
    String firstName;
    String lastName;
    String pesel;
    Address registeredAddress = new Address();
    Address residentalAddress = registeredAddress;
}
