package Zadanie1;

public class Bank
{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        person1.registeredAddress.city = "Warszawa";
        person1.registeredAddress.street = "Malinowa";
        person1.registeredAddress.postNumber = "34-203";
        person1.registeredAddress.houseNumber = 23;
        person1.registeredAddress.apartmentNumber = 4;

        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "90897812362";

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5_000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.1;
        credit1.termMonths = 12;

        Person person2 = new Person();
        person2.registeredAddress.city = "Łódź";
        person2.registeredAddress.street = "Brązowa";
        person2.registeredAddress.postNumber = "91-203";
        person2.registeredAddress.houseNumber = 12;
        person2.registeredAddress.apartmentNumber = 8;

        person2.residentalAddress = person1.residentalAddress;

        person2.firstName = "Bartek";
        person2.lastName = "Walczyk";
        person2.pesel = "92877812392";

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;

        Credit credit2 = new Credit();
        credit2.borrower = person2;
        credit2.cashBorrowed = 2_000;
        credit2.cashReturned = 0;
        credit2.interestRate = 0.1;
        credit2.termMonths = 12;

        System.out.println("Osoba:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("Mieszka w miejscowości: " + person1.residentalAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

        System.out.println("Osoba:");
        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.pesel);
        System.out.println("Mieszka w miejscowości: " + person2.residentalAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);
        System.out.println("oraz kredyt na kwotę: " + credit2.cashBorrowed);
    }
}
